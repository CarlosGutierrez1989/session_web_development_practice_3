package com.cds.CDSSpotify.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.servlet.http.HttpSession;

public class Utils {

	public static boolean checkUserIsLog(HttpSession session) {
		if(session.getAttribute("userLog") != null) {
			return true;
		}
		return false;
	}

	
	public static String generatePhotos(){
		 List<String> photos = new ArrayList<String>();
		 
		 Random rand = new Random();
		 
		 
		 photos.add("https://sunlimetech.com/portfolio/boot4menu/assets/imgs/team/img_01.png"); 
		 photos.add("https://sunlimetech.com/portfolio/boot4menu/assets/imgs/team/img_02.png");
		 photos.add("https://sunlimetech.com/portfolio/boot4menu/assets/imgs/team/img_03.png");
		 photos.add("https://sunlimetech.com/portfolio/boot4menu/assets/imgs/team/img_05.png");
		    	    
		 int n = rand.nextInt(photos.size());
		 
		return photos.get(n);
		
	}


	public static String generateMusicLike() {
		 List<String> musics = new ArrayList<String>();
		 Random rand = new Random();
		 
		 musics.add("Rock");
		 musics.add("Jazz");
		 musics.add("Dubstep");
		 musics.add("Techno");
		 musics.add("Country");
		 musics.add("Rap");
		 musics.add("Electro");
		 musics.add("Reggeton");
		 
		 int n = rand.nextInt(musics.size());
		 
		return musics.get(n);
	}

}
