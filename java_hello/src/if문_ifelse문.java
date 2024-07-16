public class if문_ifelse문 {

   public static void main(String[] args) {
      int num1 = 90;
      int num2 = 80;
      int num3 = 77;
      
      int max;
      
      
     if((num2 < num1) && num1 < num3 ||(num3<num1 && num1< num2))
     	System.out.println(num1);
     	
     	else if((num1 < num2) && num2 < num3 || (num3 <num2 && num2 < num1))
     	System.out.println(num2);
     	
     	else
     	System.out.println(num3);
      
   }
}
