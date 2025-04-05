import java.util.Scanner;

class logical{
public static void main(String args[]){

Scanner input = new Scanner(System.in);

System.out.println("enter your age");
int age = input.nextInt();

System.out.println("Are you female (True / False )");
boolean isFemale = input.nextBoolean();

System.out.println("Are you male (True / False )");
boolean male = input.nextBoolean();


if(age>5 && !male){

System.out.print("you got 75% discount");
}

else if(isFemale){
System.out.print("you got 50% discount");
}

else if(age>60 && !isFemale){
System.out.print("you got 25% discount");
}

else
{
System.out.print("you got no dicount");
}

}}


