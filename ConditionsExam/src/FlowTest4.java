import java.util.Scanner;

/**
 * 
 * @author TJ
 *
 */

public class FlowTest4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 0;
		String grade = "";
		
		System.out.println("안녕하세요. 학점 공지 프로그랩입니다.");
		System.out.println("점수를 입력해주세요.");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		if(score<=100 && score >=90) {
			grade = "A";
		}else if(score < 90 && score >= 80) {
			grade = "B";
		}else if(score <= 79 && score >= 70) {
			grade = "C";
		}else {
			grade = "F";
		}
		
		System.out.println("당신의 점수는 " + score + " 학점은");
		System.out.println(grade + "입니다.");
		
	}

}
