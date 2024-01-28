package com.project.HarmonyHub.Entity;
import java.util.*;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class Song {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
String artist;
String genre;
String link;
@ManyToAny
List<playlist>playlists;
public Song() {
	super();
	// TODO Auto-generated constructor stub
}
public Song(int id, String name, String artist, String genre, String link, List<playlist> playlists) {
	super();
	this.id = id;
	this.name = name;
	this.artist = artist;
	this.genre = genre;
	this.link = link;
	this.playlists = playlists;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getArtist() {
	return artist;
}
public void setArtist(String artist) {
	this.artist = artist;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public String getLink() {
	return link;
}
@Override
public String toString() {
	return "Song [id=" + id + ", name=" + name + ", artist=" + artist + ", genre=" + genre + ", link=" + link + "]";
}
public void setLink(String link) {
	this.link = link;
}
public List<playlist> getPlaylists() {
	return playlists;
}
public void setPlaylists(List<playlist> playlists) {
	this.playlists = playlists;
}

}
