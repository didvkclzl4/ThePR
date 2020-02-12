/**
 * @author TJ
 * 60점이상이면 합격입니다
 * 60점미만이면 불합격입니다 라고 출력하는 프로그램
 */

public class FlowTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 0;
		
		score = 100;
		
		System.out.println("점수 :" + score);
		System.out.println();
		
		if(score >= 60) {
			System.out.println("합격입니다");
		}
		if(score < 60) {
			System.out.println("불합격입니다");
		}

	}

}
