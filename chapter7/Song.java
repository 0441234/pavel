package day7;

public class Song {
	String title;
	String artist;
	int year;
	String country;
Song(){}
Song(String title,String artist,int year,String country){
	this.title=title;
	this.artist=artist;
	this.year=year;
	this.country=country;
}
String show() {
	System.out.println(year+"년"+country+"국적의"+artist+"가 부른" + title);
	return show();
}
}
