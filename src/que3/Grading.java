package que3;
import java.util.Scanner;
public class Grading {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i ;
		i =sc.nextInt();
		
		if(i==100){
			System.out.println("Grade S");
		}
		else if(i==90|| i<=100){
			System.out.println("Grade A ");
		}
		else if(i==80 || i<=90){
			System.out.println("Grade B ");
		}
		else if(i==70 || i<=80){
			System.out.println("Grade C ");
		}
		else if(i==60 || i<=70){
			System.out.println("Grade D ");
		}
		else if(i==50 || i<=60){
			System.out.println("Grade E ");
		}
		else if(i<50){
			System.out.println("Grade F ");
		}
		else{
		System.out.println(" Invalid input");
	}
	

	}
	

}
