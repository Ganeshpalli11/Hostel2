package com.project.HarmonyHub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.HarmonyHub.Entity.Song;

public interface SongRepo extends JpaRepository<Song,Integer>{

}
