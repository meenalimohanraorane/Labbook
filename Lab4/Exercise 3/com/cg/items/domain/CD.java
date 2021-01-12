package com.cg.items.domain;

public class CD extends MediaItem{
private String artist;
private String genre;
public boolean equals(Object obj){
if(obj == null)
return false;
MediaItem otherMediaItem = (MediaItem) obj;
return super.equals(otherMediaItem) && getRunTime() == otherMediaItem.getRunTime();
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
}