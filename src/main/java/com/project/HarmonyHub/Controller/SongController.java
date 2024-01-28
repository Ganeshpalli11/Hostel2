package com.project.HarmonyHub.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.project.HarmonyHub.Entity.Song;
import com.project.HarmonyHub.Entity.users;
import com.project.HarmonyHub.Services.SongServiceImplementation;

@Controller
public class SongController {
@Autowired
SongServiceImplementation SSI;
@PostMapping("/addSong")
public String addSong(@ModelAttribute Song song) {
	SSI.addSong(song);
	return "adminHome";
	
}
@GetMapping("/addSongAdmin")
public String addUser() {
    
        return "adminHome";

    }

@GetMapping("/viewSongs")
public String viewSongs() {
    List<Song> Slist=SSI.fetchAllSongs();
        return "adminHome";

    }
}

