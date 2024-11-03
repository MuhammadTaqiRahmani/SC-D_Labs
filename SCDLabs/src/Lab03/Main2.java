package Lab03;
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Length of Rectangle: ");
		float length = input.nextFloat();
		System.out.print("Width of Rectangle: ");
		float width = input.nextFloat();
		Rectangle Rectangle = new Rectangle();
		Rectangle.setLength(length);
		Rectangle.setWidth(width);
		Rectangle.displayOutput();
		
	}
}
