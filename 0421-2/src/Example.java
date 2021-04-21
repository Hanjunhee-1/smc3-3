
public class Example {

	public static void main(String[] args) {
		Truck t1 = new Truck(50);
		Truck t2 = new Truck("GRAY");
		Truck t3 = new Truck();

		t1.SpeedPrint();//50km/h를 출력해줌
		t1.ColorPrint();//Color의 기본값인 "White"를 출력해줌
		
		t2.SpeedPrint();//speed의 기본값인 30km/h를 출력해줌
		t2.ColorPrint();//"GRAY"를 출력해줌
		
	}

}

class Car{
	int speed = 30;
	String Color = "White";
	public Car(){
		System.out.println("Car의 생성자입니다.");
	}
	public Car(int speed){
		this.speed = speed;
	}
	
	public Car(String Color){
		this.Color = Color;
	}
	public void SpeedPrint(){
		System.out.println("현재 속도는 "+speed+"km/h 입니다.");
	}
	public void ColorPrint(){
		System.out.println("색깔은 " + Color + "입니다.");
	}
}

class Truck extends Car{
	public Truck(int a){
		super(a);
	}
	public Truck(String c){
		super(c);
	}
	public Truck(){
		super();
	}
}