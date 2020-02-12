
public class VarEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 변수란? 단하나의 값을 저장할 수 잇는 메모리공간
		 * 하나의 변수에 단 하나의 값만 저장가능
		 * 한줄 주석 단축키 : ctrl + / 
		 * 보라색은 예악어
		 * 변수타입 변수명
		 * 컴퓨터 언어에서 '='은 대입의 의미
		 * 변수의 명명규칙 
		 * 1. 대소문자가 구분되며 길이에 제한이 없다
		 * -true와 True는 서로 다른 것으로 간주한다.
		 * 2. 예약어를 사용해서는 안된다.
		 * -true는 예약어라서 사용할 수 없지만, True는 가능하다
		 * 3. 숫자로 시작해서는 안된다.
		 * -top10은 허용하지만, 7up은 허용하지 않는다.
		 * 4. 특수문자는 '_'와 '$'만을 허용한다.
		 * -$harp는 허용되지만, $#arp은 허용되지 않는다.
		 * 클래스 명명규칙
		 * 1. 클래스 이름의 첫 글자는 항상 대문자로 한다.
		 * - 변수와 메서드의 이름의 첫 글자는 항상 소문자로 한다.
		 * 2. 여러 단어로 이루어진 이름은 단어의 첫 글자를 대문자로 한다.
		 * - LastIndexOf, StringBuffer 낙타표기법
		 * 3. 상수의 이름은 모두 대문자로 한다. 여러단어로 이루어진 경우 '_'로 구분한다.
		 * - PI, MAX_NUMBER
		 * last_index_of -파스칼 표기법
		 * 표현범위 크기  (1바이트)  (2)     (4)     (8)
		 *           boolean - char  - int   - long
		 *           byte    - short - float - double
		 * 
		 */
		boolean check = false;
		char ch = 'A'; // "" 문자열 '' 문자
		byte bNum = (byte)127;
		int num = 0;
		long lNum = 0L;
		float f = 0.0f;
		double dNum = 0.0;
		
		System.out.println(bNum);
		System.out.println(check);
		System.out.println(ch + 1);
		System.out.println(num);
		System.out.println(lNum);
		System.out.println(f);
		System.out.println(dNum);
	}
}

