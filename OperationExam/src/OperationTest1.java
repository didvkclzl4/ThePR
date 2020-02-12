
public class OperationTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float pi = 3.141f;
		
		//소수점 2째자리까지 표현 3번째자리에서 올림처리
		
		float shortPi = (int)(pi * 100 + 0.9) / 100f;
		
		System.out.println(shortPi);
				
			

	}

}
