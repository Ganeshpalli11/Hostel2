package com.project.HarmonyHub.Services;

import com.project.HarmonyHub.Entity.users;

public interface UsersService {
    String addUser(users user);
    boolean emailExists(String email);
    boolean ValidateLogin(String email,String pass);
   String getUserRole(String email);
}
