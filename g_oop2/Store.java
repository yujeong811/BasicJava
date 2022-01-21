package g_oop2;

public class Store {

	public static void main(String[] args) {
		Desktop d1 = new Desktop("삼성 컴퓨터", 1000000);
		Desktop d2 = new Desktop("LG 컴퓨터", 1500000);
		
		Aircon ac1 = new Aircon("삼성 에어컨", 2000000);
		Aircon ac2 = new Aircon("LG 에어컨", 2500000);
		
		TV tv1 = new TV("삼성 TV", 3000000);
		TV tv2 = new TV("LG TV", 3500000);
		
		Customer c = new Customer(); 
		
		c.buy(d1);
		
		c.buy(ac2); 
		
		c.buy(tv2); // 상속을 받아서 다형성 표현이 가능하기 때문에 타입이 달라도 사용 가능
		
		((Desktop)c.items[0]).programming(); //형변환을 하면 사용 가능
	}

}

 class Product {
	 String name; //이름
	 int price; //가격
	 
	 Product(String name, int price) { //물건마다 이름과 값이 달라서 생성자를 만들어서 초기화 시킴
		 this.name = name;
		 this.price= price;
	 }
	 
	 //상품의 정보를 반환하는 메서드
	 String getInfo() {
		 return name + "(" + price + "원)";
	 }
 }

 class Desktop extends Product {
	 Desktop(String name, int price) {
		 super(name, price);
	 }
	 
	 void programming() {
		 System.out.println("프로그램을 만듭니다.");
	 }
 }
 
 class Aircon extends Product {
	 Aircon(String name, int price) {
		 super(name, price);
	 }
	 
	 void setTemperature() {
		 System.out.println("온도를 설정합니다.");
	 }
 }
 
 class TV extends Product {
	 TV(String name, int price) {
		 super(name, price); //product 클래스 생성자 호출
	 }
	 
	 void setChannel() {
		 System.out.println("채널을 변경합니다.");
	 }
 }
 
 class Customer {
	 int money = 100000000;
	 
	 Product[] items = new Product[10];
	 
	 void buy(Product p) {
		 if(money < p.price) {
			 System.out.println("잔돈이 부족합니다.");
			 return;
		 }
		 
		 money -= p.price;
		 
		 for(int i = 0; i < items.length; i++) {
			 if(items[i] == null) {
				 items[i] = p;
				 break;
			 }
		 }
		 System.out.println(p.getInfo() + "를 구매하였습니다.");
	 }
 }
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 