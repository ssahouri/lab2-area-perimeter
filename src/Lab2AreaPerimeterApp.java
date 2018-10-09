import java.util.Scanner;

public class Lab2AreaPerimeterApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    Scanner sc = new Scanner(System.in);
	    
	    double length;
	    double width;
	    double height;
	    double perimeter;
	    double area;
	    double volume;
	    char userInput = 'y';
	    
	    
	    
	    System.out.println("Welcome to Grand Circus' Room Detail Generator!");
	    
	   while( userInput == 'y') {
	    
	    System.out.println("Enter Length: ");
	    length = sc.nextDouble();
	    

	    System.out.println("Enter Width: ");
	    width = sc.nextDouble();
	    

	    System.out.println("Enter Height: ");
	    height = sc.nextDouble();
	    
	    
	    area = length * width;
	    perimeter = length *2 + width *2;
	    volume = length * width * height;
	    
	    		
	    System.out.println("Area: " + area);
	    System.out.println("Perimeter: " + perimeter);
	    System.out.println("Volume: " + volume);
	    
	    System.out.println("Continue? (y/n): ");
	    userInput = sc.next().charAt(0);
	    
	    
	    }
	  System.out.println("Done!");

	}

}
