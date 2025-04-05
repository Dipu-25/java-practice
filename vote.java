import java.util.Scanner;

class vote{
public static void main(String args[]){

Scanner userinput = new Scanner(System.in);

System.out.print("Enter your age");
int age = userinput.nextInt();

if(age>18){
System.out.println("you are eligible for vote");
}

else if(age >= 18)
{
System.out.println("eligible");
}
else{
System.out.print("you not eligible for vote");
}

}
}