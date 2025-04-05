import java.util.Scanner;

class user{
public static void main(String args[]){
Scanner input = new Scanner(System.in);
System.out.print("Enter your name :");
String name = input.nextLine();
System.out.println("What are you doing "+ name);
System.out.println(name +"best of luck to doing your work" );
System.out.println("what are you age");
int age= input.nextInt();
System.out.println("your age"+age);
}
}