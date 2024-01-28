package com.project.HarmonyHub.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.HarmonyHub.Entity.users;
import com.project.HarmonyHub.Services.UsersServiceImplementation;

@Controller
public class userController {
    @Autowired
    UsersServiceImplementation Usi;

    @PostMapping("/register")
    public String addUser(@ModelAttribute users user) {
        boolean userStatus = Usi.emailExists(user.getEmail());
        if (userStatus == false) {
            Usi.addUser(user);
            return "DataUpload";

        } else {
            System.out.println("user-exists");
            return "login";

        }
    }
    @PostMapping("/validate")
    public String ValidateLogin(@RequestParam ("email") String email,@RequestParam ("pass")String pass) {
    	
    	if(Usi.ValidateLogin(email, pass)==true) {
    		if(Usi.getUserRole(email)=="admin") {
        		return "admin";

    		}
    		else {
    			return "admin";
    		}
    	}
    	else {
    		return"login2";
    	}
    }
  
    }

