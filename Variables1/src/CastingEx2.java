
public class CastingEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/**
		 * 자동형변환
		 * 묵시적 , 명시적
		 * 작은 값에서 큰값으로 갈때는 자연스러우므로 자동적형변환이 이루어지고
		 * 큰값에서 작은 값으로 갈때는 소실이 잃어날 수 있으므로 명시적으로 형변환을 해줘야한다.
		 * 
		 * 1.boolean을 제외한 나머지 7개의 기본형은 서로 형변환이 가능하다
		 * 2.기본형과 참조형은 서로 형변환할 수 없다
		 * 3.서로 다른 타입의 변숙나의 연산은 형변환을 하는 것이 원칙이지만,
		 * 값의 범위가 작은 타입에서 큰 타입으로의 형변환은 생략할 수 있다
		 */
		
//		int num = 0;
//		long bigNum = (long)0; //원래는 0은 int인데 자동형변환으로 long이되어 long으로 들어간다
//		
//		float tinyNum = (float)0.0; //원래는 0.0은 double이므로 형변환해서 float에 넣어준다
//		double d = 0.0;
		
//		num = bigNum;
//		bigNum = num;
		
//		tinyNum = (float)0.12345678901234567890;
//		d = 0.12345678901234567890;
//		
//		System.out.println(tinyNum);
//		System.out.println(d);
		
//		bigNum = d;
//		d = bigNum;
//		정수 < 실수
//		bigNum = (long)d;
//		d = bigNum;
	}

}
