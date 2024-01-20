import java.util.*;
class evenodd{
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("enter a number:");
		a=sc.nextInt();
		if(a%2==0){
			System.out.println("even number");
		}
		else{
			System.out.println("odd number");
		}
	}
}