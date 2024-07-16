
public class Money_main2 {

	public static void main(String[] args) {
		int num =5 ;
		
		if(num >=5) {
			num =10;
		}else {
			num=20;
		}
		System.out.println(num);
		
		int result = (num >= 5)?10:20;
		System.out.println(result);
		
		int kor = 90;
		int eng = 100;
		int math = 70;
		int max;
		
		max = (kor <=eng )? eng: kor;
		max = (max <= math)? math: max;
		
		System.out.println(max);
		
		max = (kor > eng)? (kor>math?kor:math):(math>eng?math:eng);
		
		System.out.println(max);
		
		
	}

}
