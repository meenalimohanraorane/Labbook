package com.cg.items.domain.util;

import java.util.Scanner;

import com.cg.items.domain.Book;
import com.cg.items.domain.CD;
import com.cg.items.domain.Item;
import com.cg.items.domain.JournalPaper;
import com.cg.items.domain.MediaItem;
import com.cg.items.domain.Video;
import com.cg.items.domain.WrittenItem;

public class Util {
	static void show() {
		System.out.println("-------------------------------------");
		System.out.println("1. Journal Details");
		System.out.println("2. Book Details");
		System.out.println("3. Media Details");
		System.out.println("4. Exit");
	}
	public void util() {
	Scanner sc=new Scanner(System.in);
	show();
	System.out.println("Enter Choice: ");
	int choice =sc.nextInt();
	switch(choice) {
	case 1:
		WrittenItem witem=new JournalPaper();
	    JournalPaper journal=new JournalPaper();
	    witem.setAuthor("William Hughes");
	    journal.setPubYear(2002);
	    witem.addItem(witem.setidNum(102),witem.setTitle("Addictions"),witem.setNumCopies(10));
	    witem.print();
	    System.out.println("Author Name: "+witem.getAuthor());
	    System.out.println("Published in: "+journal.getPubYear());
	    
	 break;
	case 2:
		Item item=new Book();
		item.addItem(item.setidNum(101),item.setTitle("51 Shades of Dark"),item.setNumCopies(10));
		item.print();
		break;
	case 3:
	MediaItem med=new CD();
	Video med1=new Video();
	med1.setRunTime(40);
	med1.setDirectior("Mukesh Kumar");
	med1.setGenre("T-Series");
	med1.setYear(2002);
	System.out.println("Run-Time: "+med1.getRunTime()+"\nDirector: "+med1.getDirectior()+"\nGenre: "+med1.getDirectior());
	break;
	case 4:
		System.exit(0);
		break;
	}
	}
}