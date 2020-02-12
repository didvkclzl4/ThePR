
public class VarEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year = 0;
//		선언문은 두번 나타날 수 없다. 유일해야 한다
//		변수명은 한번만 선언해야 한다.
		int age = 14;
		
		System.out.println(year);
//		선언한 변수를 int 없이 사용할 때는 변수의 활용
//		ctrl + f11 : 실행
		System.out.println(age);
		
		year = age + 2000;
		age = age + 1;
		
		System.out.println(year);
		System.out.println(age);
		
		
	}

}
