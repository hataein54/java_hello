
public class SwitchExample {

	public static void main(String[] args) {
		//걸리면 break 까지
		int num =2;
		
		switch (num) {
		case 1:
			System.out.println("1 입니다.");
			System.out.println("1 입니다.");
			break;
		case 2:
			System.out.println("2 입니다.");
			System.out.println("2 입니다.");
			break;
		default:
			System.out.println("디폴트 입니다.");
			System.out.println("디폴트 입니다.");
		}
		
		int month= 99;
		
		switch(month) {
		case 1, 2, 12:
			System.out.println("겨울 입니다");
		break;
		
		case 3, 4, 5 :
			System.out.println("봄 입니다");
		break;
		

		case 6, 7, 8:
			System.out.println("여름 입니다");
		break;
		

		case 9, 10, 11:
			System.out.println("가을 입니다");
		break;
		
		default:
			System.out.println("잘못된 입력입니다.");
		}

	      if(month == 3 || month == 4 || month == 5  ) {
	          System.out.println("봄입니다");
	       }else if(month == 6 || month == 7 || month == 8 ) {
	          System.out.println("여름 입니다");
	       }else {
	          System.out.println("잘못된 입력입니다.");      
	       }
		
		
		
		
		
		
	}

}
