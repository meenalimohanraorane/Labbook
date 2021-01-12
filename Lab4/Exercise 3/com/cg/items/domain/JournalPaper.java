package com.cg.items.domain;

public class JournalPaper extends WrittenItem{
public int pubYear;
public JournalPaper(){
super();
  
}
public JournalPaper(int idNum, String str, int n, String author, int y){
super();
pubYear=y;
}
public void setPubYear(int pubYear) {
	this.pubYear = pubYear;
}
public int getPubYear() {
	return pubYear;
}
public int getIdNum(){
return super.getidNum();
}
public String title(){
return super.getTitle();
}
public int numCopies(){
return super.getNumCopies();
}
public String getAuthor(){
return super.getAuthor();
}
public void print(){
super.print();
}
public void checkIn(){
  
}
public void checkOut(){
  
}
public void addItem(){
super.addItem();
}
}