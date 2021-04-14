import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("[1:가위      2:바위       3:보]");
		
		int user = sc.nextInt();
		
		int com = (int)(Math.random()*3+1);
		
		game(user, com);

	}
	
	public static void game(int user, int com){//사용자 정의 함수
		switch(user){
		
		case 1:
			if(com==3)System.out.println("이겼습니다!");
			else if(com==2)System.out.println("졌습니다...");
			else System.out.println("비겼습니다");
			break;
			
			
		case 2:
			if(com==3)System.out.println("졌습니다...");
			else if(com==2)System.out.println("비겼습니다");
			else System.out.println("이겼습니다!");
			break;
			
		case 3:
			if(com==3)System.out.println("비겼습니다");
			else if(com==2)System.out.println("이겼습니다!");
			else System.out.println("졌습니다...");
			break;
			
		}
		
	}

}


