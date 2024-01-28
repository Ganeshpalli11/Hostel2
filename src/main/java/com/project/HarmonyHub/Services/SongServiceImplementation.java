package com.project.HarmonyHub.Services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.HarmonyHub.Entity.Song;
import com.project.HarmonyHub.Repository.SongRepo;

@Service
public class SongServiceImplementation implements SongService{
@Autowired
SongRepo SR;
	@Override
	public void addSong(Song song) {
SR.save(song);		
	}
	@Override
	public List<Song> fetchAllSongs() {
		// TODO Auto-generated method stub
		List<Song>Slist=SR.findAll();
		return null;
	}

}
