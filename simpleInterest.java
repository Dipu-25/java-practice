import java.util.Scanner;

class simpleintrest{

public static void main(String arg[]){


Scanner input = new Scanner(System.in);


System.out.print("enter a principal  ");
int p = input.nextInt();


System.out.print("enter a Rate ");
int r = input.nextInt();


System.out.print("enter a time ");
int t= input.nextInt();

System.out.print((p*r*t/100));

}}