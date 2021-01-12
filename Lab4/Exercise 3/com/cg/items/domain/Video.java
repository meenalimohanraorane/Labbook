  
package com.cg.items.domain;

public class Video extends MediaItem{
private String directior;
private String genre;
private int year;
public String getDirectior() {
	return directior;
}
public void setDirectior(String directior) {
	this.directior = directior;
}
public String getGenre() {
	return genre;
}
public void setGenre(String genre) {
	this.genre = genre;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
}