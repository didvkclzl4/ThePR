import java.util.Scanner;

public class OperatorEx11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//사용자가 입력할 변수
		int userInput = 0;
		//임시 결과
		int tempNum = 0;
		//사용자가 입력한 값에 대한 홀짝 결과
		String result = "";
		String userName = "";
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("홀짝 판별 프로그램 시작");
		System.out.println("고객님의 성함을 알려주세요");
		userName = scan.nextLine();
		System.out.println(userName + "님이 원하시는 숫자를 입력해주세요");
		
		userInput = scan.nextInt();
		
		//판별을 위한 과정
		tempNum = userInput % 2;
		
		//사용자가 입력한 값에 대한 홀짝 판별결과
		result = (tempNum == 0) ? "짝" : "홀";
		
		System.out.println(userName + "님이 입력하신 값은 " + userInput + " " + result + "수 입니다");

	}

}
