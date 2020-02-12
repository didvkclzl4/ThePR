
public class OperationTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input = 3;
		/**
		 * 삼항 연산자를 이용해서 1이면 전원을 켜집니다.
		 * 0이면 전원을 종료합니다.
		 */
		
		String result = "";
		
		result = (input == 1) ? "입력하신 값은 1\n전원을 켰습니다."
				: (input == 0) ? "입력하신 값은 0\n전원을 종료합니다." 
						: "입력하신 값은 " + input + "\n잘못입력했습니다";
		
		System.out.println(result);
		
		
		
	
				
				
				
			

	}

}
