
public class VarEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 형변환 type casting
		byte < short < int < long
		 1       2      4     8
		 */
		
		int score = (int)85.4; //형변환을 하면 타입이 달라도 타입을 강제로 주입시킬 수 있다.
		byte b = (byte)score;
		
		System.out.println(score);
		System.out.println(b);
	}

}
