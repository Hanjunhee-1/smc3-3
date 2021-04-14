import java.util.Scanner;

public class Number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);//Scanner함수 객체 생성
		boolean chance = false;//당첨여부를 확인해줄 boolean타입의 변수
		int a[] = new int[10];//10개의 난수를 저장할 정수형 배열
		for(int i=0; i<10; i++) {
			a[i] = (int)(Math.random() * 50) + 1;//난수 저장
			for(int j=0; j<i; j++) {//반복된 숫자가 있는 경우를 확인해주는 반복문
				if(a[i] == a[j]) {
					i--;
					break;
				}
			}
		}
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요 : ");
		int input = sc.nextInt();//숫자 하나 입력받기
		for(int i=0; i<10; i++){
			System.out.print(a[i]+" ");
			if(input==a[i]){
				chance = true;
			}
		}
		System.out.println();
		if(chance == false){
			System.out.println("꽝! 다음기회에~");
		}
		else{
			System.out.println("당첨!");
		}
	}
}
