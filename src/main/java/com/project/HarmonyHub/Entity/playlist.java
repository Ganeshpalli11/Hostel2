package com.project.HarmonyHub.Entity;

import java.util.List;

import org.hibernate.annotations.ManyToAny;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class playlist {
@Id
@GeneratedValue(strategy=GenerationType.AUTO)
int id;
String name;
public playlist(int id, String name, List<Song> songs) {
	super();
	this.id = id;
	this.name = name;
	this.songs = songs;
}
@ManyToAny
List<Song>songs;
@Override
public String toString() {
	return "playlist [id=" + id + ", name=" + name + ", songs=" + songs + "]";
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
public List<Song> getSongs() {
	return songs;
}
public void setSongs(List<Song> songs) {
	this.songs = songs;
}
public playlist() {
	super();
	// TODO Auto-generated constructor stub
}
}
