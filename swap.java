import java.util.Scanner;

 class Swap{
public static void main(String args[]){

Scanner input = new Scanner(System.in);

System.out.print("enter number A : ");
int a = input.nextInt();

System.out.print("enter number B : ");
int b = input.nextInt();

int c = a; 
        a = b;      
        b = c;

System.out.println("value of A is:" + a);
System.out.println("value of B is :" + b );
System.out.println("Swaping is done");


}
}