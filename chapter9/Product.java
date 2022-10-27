package day9;

public class Product {
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
		
	}

}
class Buyer{
	int money =1000;
	int bonusPoint = 0;
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이부족합니다");
			return;
		}
		money -=p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p.toString()+"을 구입하셨습니다");
	}
}
