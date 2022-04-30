import java.util.Scanner;
public class SumOfNNumbers {
   public static void main(String args[]){
      int sum = 0;
      System.out.print("Enter a limit: ");
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();

      for (int i = 0; i<num; i++){
         sum = sum +i;
      }
      System.out.println("Sum = "+sum);
   }
}
