package com.project.HarmonyHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HarmonyHub.Entity.users;

public interface UsersRepo extends JpaRepository <users,Integer>{
users getByEmail(String email);
}
