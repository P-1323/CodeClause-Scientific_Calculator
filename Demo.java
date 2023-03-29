package priyankaapplication;


import java.util.*;
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) {
		
		

		        Scanner scanner = new Scanner(System.in);

		        System.out.println("Enter the type of unit to convert: (1) Length, (2) Mass, (3) Temperature");
		        int type = scanner.nextInt();

		        if (type == 1) {
		            System.out.println("Enter the value to convert:");
		            double value = scanner.nextDouble();
		            System.out.println("Enter the current unit: (1) meters, (2) feet, (3) inches, (4) centimeter");
		            int from = scanner.nextInt();
		            System.out.println("Enter the target unit: (1) meters, (2) feet, (3) inches, (4) centimeter");
		            int to = scanner.nextInt();
		            convertLength(value, from, to);
		            }
		         else if (type == 2) {
		            System.out.println("Enter the value to convert:");
		            double value = scanner.nextDouble();
		            System.out.println("Enter the current unit: (1) kilograms, (2) gram, (3) decigram");
		            int from = scanner.nextInt();
		            System.out.println("Enter the target unit: (1) kilograms, (2) gram, (3) decigram");
		            int to = scanner.nextInt();
		            convertMass(value, from, to);
		            }
		        else if (type == 3) {
		            System.out.println("Enter the value to convert:");
		            double value = scanner.nextDouble();
		            System.out.println("Enter the current unit: (1) Celsius, (2) Fahrenheit, (3) kelvin");
		            int from = scanner.nextInt();
		            System.out.println("Enter the target unit: (1) Celsius, (2) Fahrenheit, (3) kelvin");
		            int to = scanner.nextInt();
		            convertTemperature(value, from, to);
		        } 
		        else {
		            System.out.println("Invalid unit type.");
		        }

		        scanner.close();
		    }

		    public static void convertLength(double value, int from, int to) {
		        double result = 0;
		        String unitFrom = "";
		        String unitTo = "";

		        switch (from) {
		            case 1:
		                unitFrom = "meters";
		                switch (to) {
		                    case 1:
		                        result = value;
		                        unitTo = "meters";
		                        System.out.println(result);
		                        break;
		                    case 2:
		                        result = value * 3.28084;
		                        unitTo = "feet";
		                        System.out.println(result);
		                        break;
		                    case 3:
		                        result = value * 39.3701;
		                        unitTo = "inches";
		                        System.out.println(result);
		                        break;
		                    case 4:
		                    	result=value*100;
		                    	unitTo = "centimeter";
		                        System.out.println(result);
		                    	break;
		                    default:
			            		System.out.println("Invalid Number");
		                }
		                break;
		            case 2:
		                unitFrom = "feet";
		                switch (to) {
		                    case 1:
		                        result = value / 3.28084;
		                        unitTo = "meters";
		                        System.out.println(result);
		                        break;
		                    case 2:
		                        result = value;
		                        unitTo = "feet";
		                        System.out.println(result);
		                        break;
		                    case 3:
		                    	result=value*12;
		                    	unitTo="inches";
		                    	System.out.println(result);
		                    	break;
		                    case 4:
		                    	result=value*30.48;
		                    	unitTo = "centimeter";
		                        System.out.println(result);
		                    default:
			            		System.out.println("Invalid Number");
		                }
		                break;
		            case 3:
		            	unitFrom="inches";
		            	switch(to) {
		            	case 1:
		            		result=value*39.37;
		            		unitTo="meters";
		            		System.out.println(result);
		            		break;
		            	case 2:
		            		result=value/12;
		            		unitTo="feet";
		            		System.out.println(result);
		            	case 3:
		            		result=value;
		            		unitTo="inches";
		            		System.out.println(result);
		            		break;
		            	case 4:
		            		result=value*2.54;
		            		unitTo = "centimeter";
	                        System.out.println(result);
		            	default:
		            		System.out.println("Invalid Number");
		            	}
		            case 4:
		            	unitFrom="centimeter";
		            	switch(to) {
		            	case 1:
		            		result=value*0.01;
		            		unitTo="meters";
		            		System.out.println(result);
		            		break;
		            	case 2:
		            		result=value/ 30.48;
		            		unitTo="feet";
		            		System.out.println(result);
		            	case 3:
		            		result=value/ 2.54;
		            		unitTo="inches";
		            		System.out.println(result);
		            		break;
		            	case 4:
		            		result=value;
		            		unitTo = "centimeter";
	                        System.out.println(result);
		            	default:
		            		System.out.println("Invalid Number");
		            	}
		           
		            	break;
		            	default:
		            		System.out.println("Invalid Number");
		            		}
		        }
		    
		    
		        public static void convertMass(double value, int from, int to) {
			        double result = 0;
			        String unitFrom = "";
			        String unitTo = "";

			        switch (from) {
			            case 1:
			                unitFrom = "Kilogram";
			                switch (to) {
			                    case 1:
			                        result = value;
			                        unitTo = "kilogram";
			                        System.out.println(result);
			                        break;
			                    case 2:
			                        result = value * 1000;
			                        unitTo = "gram";
			                        System.out.println(result);
			                        break;
			                    case 3:
			                        result = value * 10000;
			                        unitTo = "decigram";
			                        System.out.println(result);
			                        break;
			                    default:
				            		System.out.println("Invalid Number");
			                }
			                break;
			            case 2:
			                unitFrom = "gram";
			                switch (to) {
			                    case 1:
			                        result = value /1000;
			                        unitTo = "kilogram";
			                        System.out.println(result);
			                        break;
			                    case 2:
			                        result = value;
			                        unitTo = "gram";
			                        System.out.println(result);
			                        break;
			                    case 3:
			                    	result=value*10;
			                    	unitTo="decigram";
			                    	System.out.println(result);
			                    	break;
			                    default:
				            		System.out.println("Invalid Number");
			                }
			                break;
			            case 3:
			            	unitFrom="decigram";
			            	switch(to) {
			            	case 1:
			            		result=value/10000;
			            		unitTo="kilogram";
			            		System.out.println(result);
			            		break;
			            	case 2:
			            		result=value/10;
			            		unitTo="gram";
			            		System.out.println(result);
			            	case 3:
			            		result=value;
			            		unitTo="decigram";
			            		System.out.println(result);
			            		break;
			            	default:
			            		System.out.println("Invalid Number");
			            		}
			            	break;
			            	default:
			            		System.out.println("Invalid Number");
			        }
			        }
			        public static void convertTemperature(double value, int from, int to) {
				        double result = 0;
				        String unitFrom = "";
				        String unitTo = "";

				        switch (from) {
				            case 1:
				                unitFrom = "celsius";
				                switch (to) {
				                    case 1:
				                        result = value;
				                        unitTo = "celsius";
				                        System.out.println(result);
				                        break;
				                    case 2:
				                        result = (value*9/5)+32;
				                        unitTo = "Fahranheit";
				                        System.out.println(result);
				                        break;
				                    case 3:
				                        result = value + 273.15;
				                        unitTo = "kelvin";
				                        System.out.println(result);
				                        break;
				                    default:
					            		System.out.println("Invalid Number");
				                }
				                break;
				            case 2:
				                unitFrom = "Fahranheit";
				                switch (to) {
				                    case 1:
				                        result = (value-32)*5/9;
				                        unitTo = "celsius";
				                        System.out.println(result);
				                        break;
				                    case 2:
				                        result = value;
				                        unitTo = "Fahranheit";
				                        System.out.println(result);
				                        break;
				                    case 3:
				                    	result=((value-32)*5/9)+273.15;
				                    	unitTo="kelvin";
				                    	System.out.println(result);
				                    	break;
				                    default:
					            		System.out.println("Invalid Number");
				                }
				                break;
				            case 3:
				            	unitFrom="kelvin";
				            	switch(to) {
				            	case 1:
				            		result=value-273.15;
				            		unitTo="celsius";
				            		System.out.println(result);
				            		break;
				            	case 2:
				            		result=((value-273.15)*9/5)+32;
				            		unitTo="Fahranheit";
				            		System.out.println(result);
				            	case 3:
				            		result=value;
				            		unitTo="kelvin";
				            		System.out.println(result);
				            		break;
				            	default:
				            		System.out.println("Invalid Number");
				            		}
				            	break;
				            	default:
				            		System.out.println("Invalid Number");
				        }

}
}
