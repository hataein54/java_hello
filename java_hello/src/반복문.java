
public class 반복문 {

	public static void main(String[] args) {
		int count = 0;
//		
//		while(count <= 100) {
//		System.out.println(count + "번"+"Hello World");
//		count++;
//		}
//		//do while 사용
//		//차이= do while 실행문장을 한번은 실행 시킨다.
////		count=1;
//		do {
//			System.out.println(count + "번"+": Hello world" );
//			count++;
//		}while(count<=100);
//		
//		//for 문
//		
//		for(int i=0; i<=3; i++) {
//			System.out.println(i + "번" + ": Hello world");
//		}
//		
//		int sum = 0;
//		
//		for(int i=1; i<=10000; i++) {
//			sum +=i;
//			
//		}
//		System.out.println(sum);
//		
//		//3단 구구단 출력
//		
//		//3*1=3;
//		//2*3=6;
//		
//		for(int i=1; i<=9; i++){
//			for(int e=1; e<10; e++)
//			System.out.println(i+"x"+e+"="+i*e);
//		}
//		
//		//출력이 홀수
//		
//		for(int i=1; i<100; i++) {
//			if(i%2==1) 
//			System.out.println(i);
//			
//		}			
//		for(int i=100; i>-1; i-=2) {
//			System.out.println(i);
//		}
		
		int sum = 0;
		for(int i=0; i<100; i++) {
			if(i%3!=0) {
				sum += i;
			}
		}
		System.out.println(sum);	
		
		sum = 0;
		while(count <= 100) {
			if(count%3==0) {
				sum += count;
			}
			count++;
		}
		System.out.println(sum);
	}

}
