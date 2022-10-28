package day10;

abstract class Animal {
	 String kind;
	 Animal(String kind){
		 this.kind=kind;
	 };
	 public void breath() {};
	 
	 public abstract void sound();
	 
}

