import java.util.Scanner;

class rectangle{
public static void main(String arg[]){

Scanner input = new Scanner(System.in);

System.out.print("Enter Area of A side");
int A_side = input.nextInt();


System.out.print("Enter Area of B side");
int B_side = input.nextInt();

int rectangle = A_side + B_side ;

System.out.print("Area of rectangle" + rectangle);

}
}
