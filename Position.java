package janani;
import java.util.Scanner;
public class Position {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int i,n;
System.out.println("enter the elements");
Scanner ja=new Scanner(System.in);
n=ja.nextInt();
System.out.println("enter the number");
int []a=new int[n];
for(i=0;i<n;i++){
	a[i]=ja.nextInt();
}
for(i=0;i<n;i++){
	System.out.println(i+" "+a[i]);
}
	}

}
