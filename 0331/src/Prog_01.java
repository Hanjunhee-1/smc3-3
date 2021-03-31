import java.util.Scanner;

public class Prog_01 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Grade g = new Grade();
		
		System.out.print("수학, 과학, 영어 순으로 3개의 정수 입력 : ");
		
		g.math = sc.nextInt();
		g.science = sc.nextInt();
		g.english = sc.nextInt();
		
		g.average(g.math, g.science, g.english);

	}

}

class Grade{
	
	int math=0, science=0, english=0;
	
	Grade(){
		
	}
	
	public void average(int math, int science, int english){
		System.out.println("평균값 : " + (math+science+english)/3);
	}
	
}