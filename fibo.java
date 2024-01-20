public class fibo{
	public static void main(String args[]){
		int a=0,b=1,c=0;
		for(int i=0;i<12;i++){
			System.out.println(a);
			c=a+b;
			b=a;
			a=c;
		}
	}
}