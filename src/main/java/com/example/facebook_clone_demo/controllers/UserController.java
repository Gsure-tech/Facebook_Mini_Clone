package com.example.facebook_clone_demo.controllers;

import com.example.facebook_clone_demo.dto.UserDto;
import com.example.facebook_clone_demo.models.UsersModel;
import com.example.facebook_clone_demo.services.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class UserController {
    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/register")
    public String getRegisterPage(Model model) {
        model.addAttribute("registerRequest", new UsersModel());
        return "register_page";
    }

    @GetMapping("/login")
    public String getLoginpage(Model model, HttpSession session) {
        if(session.getAttribute("user")!=null){
            return "redirect:/index";
        }
        model.addAttribute("loginRequest", new UsersModel());
        return "login";
    }

    @PostMapping("/register")
    public String savePost(@ModelAttribute UserDto userDto) {
        System.out.println("register request:" + userDto);
        userService.signUp(userDto);

        return "redirect:/index";
        // return new ResponseEntity<>("Signup successfully", HttpStatus.CREATED);
    }

    @PostMapping("/login")
    public String login(@ModelAttribute UsersModel usersModel, Model model, HttpSession session) {

        UsersModel user = userService.authenticate(usersModel.getEmail(),
                usersModel.getPassword());

        if (user!= null) {
            session.setAttribute("user",user);
            return "redirect:/index";

        } else {
            session.setAttribute("errorMessage","Username or Password not matched");
            return "redirect:/login";
        }


    }

    @GetMapping("/logout")
    public String logoutUser(HttpSession session){
        session.invalidate();

        return "redirect:/login";
    }
}
//    @PostMapping("/register")
//    public String register(@ModelAttribute UsersModel usersModel){
//        System.out.println("register request:" + usersModel);
//        UsersModel registeredUser = userService.signUp(usersModel.getFirstName(),usersModel.getSurname(), usersModel.getEmail(),
//                usersModel.getPassword(),usersModel.getDob(),usersModel.getGender());
//        return registeredUser == null ? "error_page" : "/index";
//
//    }

    //@PostMapping("/login")
//    public String login(@ModelAttribute UsersModel usersModel, Model model, HttpSession session) {
//        System.out.println("login request:" + usersModel);
//        UsersModel user = userService.authenticate(usersModel.getEmail(),
//                usersModel.getPassword());
//
//
//        //if (user!= null) {
//           // session.setAttribute("user",user);
//            //model.addAttribute("userLogin", authenticated.getFirstName());
//            //model.addAttribute("userId", authenticated.getId());
//            //return "redirect:/index";
//
//       // } else {
//            //return "error_Page";
//        //}
//        return "redirect:/index";
//    }
//}