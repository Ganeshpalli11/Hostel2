package com.project.HarmonyHub.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HarmonyHub.Entity.users;
import com.project.HarmonyHub.Repository.UsersRepo;

@Service
public class UsersServiceImplementation implements UsersService {
    @Autowired
    UsersRepo usr;

    @Override
    public String addUser(users user) {
        usr.save(user);
        return "Student data Saved";
    }

    @Override
    public boolean emailExists(String email) {
        if (usr.getByEmail(email) != null) {
            return true;
        } else {
            return false;
        }
    }

	@Override
	public boolean ValidateLogin(String email, String pass) {
		users user=usr.getByEmail(email);
		if(user!=null) {
		
		if(pass.equals(user.getPassword())) {
			return true;
		}
		else {
			return false;

		}
	}
		else {
			return false;
		}
	
	}
	@Override
	public String getUserRole(String email) {
		users user=usr.getByEmail(email);
		return user.getRole();
	}
}
