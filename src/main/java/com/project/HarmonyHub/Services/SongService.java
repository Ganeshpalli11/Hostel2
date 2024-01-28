package com.project.HarmonyHub.Services;

import java.util.List;

import com.project.HarmonyHub.Entity.Song;

public interface SongService {
public void addSong(Song song);
public List<Song> fetchAllSongs();
}
