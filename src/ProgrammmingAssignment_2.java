import java.util.Scanner;
public class ProgrammmingAssignment_2 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the location: \n"
				+ "1 for Local \n"
				+ "2 for Canda \n"
				+ "3 for South America \n"
				+ "4 for Europe \n"
				+ "5 for all locations");
		
			int location = input.nextInt();
		double[] weights = shippingInformation(input);
		
		packageQuantity(weights);
		
		checkLocation(location, weights);
	}
	private static void packageQuantity(double[] weights) {
		String s1="";
		String s2="";
		String s3="";
		String s4="";
		for(int i=0;i<weights.length;i++){
			if(weights[i] > 0 && weights[i] <=1){
				s1 += "1";
			}
			if(weights[i] >1 && weights[i] <=3){
				s2 += "1";
			}
			if(weights[i] > 3 && weights[i] <= 10){
				s3 +="1";
			}
			if(weights[i] > 10 && weights[i] <=20){
				s4 +="1";
			}
		}
		System.out.println("You are shipping " + s1.length() + " packages greater than 0 and less than or equal to 1 pounds");
		System.out.println("You are shipping " + s2.length() + " packages greater than 1 and less than or equal to 3 pounds");
		System.out.println("You are shipping " + s3.length() + " packages greater than 3 and less than or equal to 10 pounds");
		System.out.println("You are shipping " + s4.length() + " packages greater than 10 and less than or equal to 20 pounds");
				
		
	}
	private static double[] shippingInformation(Scanner input) {
		System.out.println("Enter the number of packages shipped: ");
			int numberOfPackages = input.nextInt();
		System.out.println("Enter the weight of the packages (in pounds): ");
		double [] weights = new double[numberOfPackages];
		for(int i=0; i<numberOfPackages;i++){
			double w = input.nextInt();
			if (0<w && w<=20){
			weights[i]= w;}
			else{
				System.out.println("Cannot ship packages over 20 pounds");
				}
		
			}
		return weights;
	}
	private static void checkLocation(int location, double[] weights) {
		if(location == 1){
		System.out.println("The total shipping cost is: $" + (Local(weights)));
		}
		else if(location == 2){
			System.out.println("The total shipping cost is: $" + (Canada(weights)));
		}
		else if(location ==3){
			System.out.println("The total shipping cost is: $" + (SouthAmerica(weights)));
		}
		else if(location == 4){
			System.out.println("The total shipping cost is: $" + (Europe(weights)));
		}
		else if(location == 5){
			System.out.println("The total shipping cost for Local shipping is: $" + (Local(weights)));
			System.out.println("The total shipping cost for Canada is: $" + (Canada(weights)));
			System.out.println("The total shipping cost for South America is: $" + (SouthAmerica(weights)));
			System.out.println("The total shipping cost for Europe is: $" + (Europe(weights)));
		}
	}
	public static double Local(double [] weights){
		double price = 0.00;
		for(int i = 0; i<weights.length;i++){
			if(weights[i] > 0.00 && weights[i]<= 1){
				price += 3.5;}
			else if(weights[i] > 1 && weights[i]<=3){
				price += 5.5;}
			else if(weights[i] > 3 && weights[i]<=10){
				price += 8.5;}
			else if(weights[i] > 10 && weights[i]<=20){
				price += 10.5;}			
			}
		return price;
}
	public static double Canada(double [] weights){
		double price = 0.00;
		for(int i = 0; i<weights.length;i++){
			if(weights[i] > 0.00 && weights[i]<= 1){
				price += 4.5;}
			else if(weights[i] > 1 && weights[i]<=3){
				price += 6.5;}
			else if(weights[i] > 3 && weights[i]<=10){
				price += 10.5;}
			else if(weights[i] > 10 && weights[i]<=20){
				price += 12.5;}			
			}
		return price;
}
	public static double SouthAmerica(double [] weights){
		double price = 0.00;
		for(int i = 0; i<weights.length;i++){
			if(weights[i] > 0.00 && weights[i]<= 1){
				price += 5.5;}
			else if(weights[i] > 1 && weights[i]<=3){
				price += 7.5;}
			else if(weights[i] > 3 && weights[i]<=10){
				price += 9.5;}
			else if(weights[i] > 10 && weights[i]<=20){
				price += 11.5;}			
			}
		return price;}
	public static double Europe(double [] weights){
		double price = 0.00;
		for(int i = 0; i<weights.length;i++){
			if(weights[i] > 0.00 && weights[i]<= 1){
				price += 7.5;}
			else if(weights[i] > 1 && weights[i]<=3){
				price += 9.5;}
			else if(weights[i] > 3 && weights[i]<=10){
				price += 11.0;}
			else if(weights[i] > 10 && weights[i]<=20){
				price += 15.0;}			
			}
		return price;
}
}