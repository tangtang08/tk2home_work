package methodsObjs;
import java.io.InputStream;
// Step 1 Import Scanner 
import java.util.Scanner;

public class AdsubMuldiv1 {
	public static void main(String[] args) {
		
		

		//Step 2 create the scanner input 
		Scanner keyboard=new Scanner(System.in);

		// Step 3 give the user instructions. To give the user a menu choice
		System.out.println("Press: 1)Add 2)Subtract 3)Multiply 4)Divide");

		//Step 4 get users input from menu choice
		int menu = keyboard.nextInt();
		//create an If statement
	if (menu==1){
		System.out.println(" Type two numbers to add ");

		//Step 5 Declare name of the scanner input
		int input1 = keyboard.nextInt();
		int input2 = keyboard.nextInt();
		
		// Step 10 OBJECT print the results of the output to the screenu 
		System.out.println(AdsubMuldiv1.add( input1, input2));
	}
	
	else if ( menu==2) {
		System.out.println("Type 2 numbers to subtract ");
	int inputsub1 = keyboard.nextInt();
	int inputsub2 = keyboard.nextInt();
	 
	System.out.println(AdsubMuldiv1.sub(inputsub1, inputsub2));
	}
	
	else if ( menu ==3) {
		System.out.println("Type 2 numbers to multiply ");
	int inmulti1= keyboard.nextInt();
	int inmulti2=keyboard.nextInt();
	System.out.println(AdsubMuldiv1.multi(inmulti1, inmulti2));
	
	}
	
	else { 
		System.out.println("Type 2 numbers to divide");
	int inputdiv1= keyboard.nextInt();
	int inputdiv2= keyboard.nextInt();
	System.out.println(AdsubMuldiv1.divide(inputdiv1, inputdiv2));
	}
	
	//ADD on  later... Ask the user if they would like to try it again
	//System.out.println(AdsubMuldiv1.menu1("choice"));

	}

	// Step 6 create the 'add' METHOD
	public static int add(int input1, int input2){
		//Step 7 calculate the inputs
		int z= input1 + input2;
		// Step 8 Return the calculation to the main method 
		return z;	
	}
	
	public static int sub(int inputsub1, int inputsub2){
		 int z= inputsub1- inputsub2;
		 return z;
	}
	
	public static int multi(int inmulti1, int inmulti2){
		int z= inmulti1 * inmulti2;
		return z;
	}
	
	public static float divide( float inputdiv1, float inputdiv2){
		float z= ((float)inputdiv1) / inputdiv2;
		return z;
	}
	//ADD on  later... Ask the user if they would like to try it again
	//public static String menu1 (String choice){
		//return "Would you like to try this again?";
	}

 