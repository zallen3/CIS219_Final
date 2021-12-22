/*
Zachery Allen   
CIS219 - Tues & Thurs 3:30-5:20pm
Fall 2021
*/

//Imports
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class final2 {
    
    public static void main(String args[]) {    	
    	//Runs getAge() which is returning the value of the month to check with the switch statement
    	switch(getAge()) {
    	case 1:
    		System.out.println("January: You are either a Capricorn or an Aquarius with a garnet gemstone.");
    		break;
    	case 2:
    		System.out.println("February: You are either an Auquarius or a Pisces with an amethyst gemstone.");
    		break;
    	case 3:
    		System.out.println("March: You are either a Pisces(like me) or an Aries with an aquamarine gemstone.");
    		break;
    	case 4:
    		System.out.println("April: You are either an Aries or a Taurus with a diamond gemstone");
    		break;
    	case 5:
    		System.out.println("May: You are either a Taurus or a Gemini with an emerald gemstone");
    		break;
    	case 6:
    		System.out.println("June: You are either a Gemini or a Cancer with a pearl gemstone");
    		break;
    	case 7:
    		System.out.println("July: You are either a Cancer or a Leo with a ruby gemstone");
    		break;
    	case 8:
    		System.out.println("August: You are either a Leo or a Virgo with a peridot gemstone");
    		break;
    	case 9:
    		System.out.println("September: You are either a Virgo or a Libra with a Sapphire gemstone");
    		break;
    	case 10:
    		System.out.println("October: You are either a Libra or a Scorpio with a Tourmaline gemstone");
    		break;
    	case 11:
    		System.out.println("November: You are either a Scorpio or a Sagittarius with a Citrine gemstone");
    		break;
    	case 12:
    		System.out.println("December: You are either a Sagittarius or a Capricorn with a Tanzanite gemstone");
    		break;
    	default:
    		System.out.println("You entered the data incorrectly, please try again!");
    	}
    }
    
    public static int getAge() {
    	
    	//Create Scanner object
    	Scanner scan = new Scanner(System.in);
    	
    	int year;
    	int month;
    	int day;
    	
    	//Enter yyyy/mm/dd, each DO checks if data type is incorrect and reprompts for input
    	do {
        System.out.println("Enter your birth year [yyyy]: ");
        while (!scan.hasNextInt()) {
        	//Scanner takes user inputed value and prompts if it is incorrect
        	String text = scan.next();
        	System.out.println("Please enter a valid year: ");
        }
    	year = scan.nextInt();   
    	} while (year < 0); 
    	
    	do {
            System.out.println("Enter your birth month [mm]: ");
            while (!scan.hasNextInt()) {
            	String text = scan.next();
            	System.out.println("Please enter a valid month: ");
            }
        	month = scan.nextInt();
        	if (month > 12) {
        		System.out.println("Please enter a month number between 1 and 12!");
        		month = scan.nextInt();
        	}
        	} while (month < 0); 
    	
    	do {
            System.out.println("Enter the day you were born on [dd]: ");
            while (!scan.hasNextInt()) {
            	String text = scan.next();
            	System.out.println("Please enter a valid day: ");
            }
        	day = scan.nextInt(); 
        	if (day > 31) {
        		System.out.println("Please enter a day number between 1 and 31!");
        		day = scan.nextInt();
        	}
        	} while (day < 0); 
    	
    	//Get todays date, use the numbers entered for the birthdate, and use the .getYears method to get the persons age
    	LocalDate today = LocalDate.now();
    	LocalDate birthDate = LocalDate.of(year, month, day);
    	int userAge = Period.between(birthDate, today).getYears();
    	
    	//Print out the users age and their birthdate
    	System.out.println("You are: " + userAge);
    	System.out.println("Your birthdate is: " + birthDate);
    	
    	int userMonth = birthDate.getMonthValue();
    	
    	scan.close();
    	//Returns int userMonth for the switch statement
    	return userMonth;
    }
}