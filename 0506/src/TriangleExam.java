import java.util.Scanner;

public class TriangleExam {

	public static void main(String[] args) {
		double height = 10.2;
		double width = 17.3;
		
		Triangle t = new Triangle(height, width);

		t.Print();
		
		System.out.println("삼각형의 밑변과 높이를 변경시킵니다.");
		
		t.Change(height, width);
		
		t.Print();

	}

}

class Triangle{
	double height;
	double width;
	
	Triangle(){
		
	}
	
	Triangle(double height, double width){
		this.height = height;
		this.width = width;
	}
	
	void Change(double height, double width){
		height = 7.5;
		width = 9.2;
		this.height = height;
		this.width = width;
	}
	
	void Print(){
		double result = height*width/2;
		System.out.println("삼각형의 넓이는 " + result + "입니다.");
	}
}