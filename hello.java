import java.util.*;
class hello{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		int a,i=0;
		System.out.println("Enter a number: ");
		a= sc.nextInt();
		for(i=0;i<a;i++){
			for(int j=0;j<i;j++){
				System.out.print("*");
			}
			System.out.println("");
		}
	}
}
/*kon program e osubidha bol
if else
for
while
do while
nested loop
haa chol nested loop mne hochhe akta loop er modhe ar akta loop okk chol akta pattern er program die kori eta
*
**
***
****
*****
eta die okk
try kor then ami dekhchi
ai rokom hobe
0 1 1 2 3 5 8 13 21 34 55.....n
amni e kor
bol
 
*/