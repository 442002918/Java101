import java.util.Scanner;

class Main {

public static void main(String[] args) {

Scanner myscanner = new Scanner(System.in);

System.out.println("Enter a Number");

float var1 = myscanner.nextFloat();

System.out.println("Enter a Number");

float var2 = myscanner.nextFloat();

System.out.println("addition");
System.out.println(var1+var2);
System.out.println("subtraction");
System.out.println(var1 - var2);
System.out.println("muitplication");
System.out.println(var1 * var2);
System.out.println(var1 / var2);
System.out.println("moduius");
System.out.println(var1 % var2);
System.out.println("grater");
System.out.println(var1 > var2);
System.out.println("grater or equal");
System.out.println(var1 >= var2);
System.out.println("not equal");
System.out.println(var1 != var2);
System.out.println("equal");
System.out.println(var1 == var2);

}
}
