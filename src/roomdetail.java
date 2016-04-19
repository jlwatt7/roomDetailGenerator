import java.util.Scanner;

public class roomdetail {

	public static void main(String[] args) {

	// display a welcome message and add space above next prompt 
		System.out.println("Welcome to Grand Circus' Room Detail Generator!");
		System.out.println();
		
		boolean userContinue = false;
		String answer;
		double length;
		double width;
		double area;
		double perimeter;
		
		Scanner scanner = new Scanner(System.in);
do {	
		
	// display enter length & width and allow user to enter information 
		answer = roomDetail(scanner);
		if(answer.equals("Y")){
			userContinue = true;    
		}
		{
		if(answer.equals("N"))
			userContinue = false;
		}
		
} //run program again
while (userContinue);

{
		
}
	}

	public static String roomDetail(Scanner scanner) {
		String answer;
		double length;
		double width;
		double area;
		double perimeter;
		System.out.print("Enter Length: ");
		length = scanner.nextDouble();
		System.out.print("Enter Width: ");
		width = scanner.nextDouble();
	// Area = length*width
		area = length*width;
		System.out.println("Area:" + area);
	//Perimeter = 2*length + 2*width
		perimeter = 2*length + 2*width;
		System.out.println("Perimeter:" + perimeter);
		
		//Add space
		//Prompt user to see if they want to continue or not
		System.out.println();
		System.out.print("Would you like to continue (Y/N): ");
		answer =  scanner.next();
		return answer;
	}
}
