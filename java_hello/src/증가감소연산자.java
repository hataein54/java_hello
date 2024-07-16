
public class 증가감소연산자 {

	public static void main(String[] args) {
		int num1 = 0;
		int num2 = 0;
		boolean result;
		
		result = ((num1 +=10) < 0 ) && ((num2 += 10) > 0);
		System.out.println("1초과 100 미만인가?" + result);

		result = (1 < num1) & (num1 < 100);
		System.out.println("2 또는 3의 배수인가?" + result);

		result = !(num1 != 0);
		System.out.println("0 인가?" + result);
		result = ((num1 +=10) < 0 ) && ((num2 += 10) > 0);

	}

}
