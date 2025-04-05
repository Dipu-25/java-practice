import java.util.Scanner;

class triangle{
public static void main(String args[]){

Scanner input = new Scanner(System.in);

System.out.print("Enter the breath : ");
int breath = input.nextInt();

System.out.print("Enter the heigth : ");
int heigth = input.nextInt();


float area = 0.5f * breath* heigth;

System.out.print("Area of Triangle : " + area);


}
}



