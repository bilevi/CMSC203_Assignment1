/*
 Class: CMSC203 CRN 21455
 Program: Assignment 1
 Instructor: Professor Alexander
 Summary of Description: A troubleshooting program for the Wi-Fi
 Due Date: 09/16/2021
 Integrity Pledge: I pledge that I have completed the programming assignment independently.
 I have not copied the code from a student or any source.
B. Leigh Vining
 */

import java.util.Scanner;

public class WiFiDiagnosis
{

	public static void main(String[] args)
	{
	Scanner input = new Scanner(System.in);
	
	System.out.println("If you have a problem with internet connectivity, this Wi-Fi diagnosis might work");
	
	System.out.println("\nFirst step: reboot your computer");
	System.out.println("Are you able to connect with the internet? (yes or no)");
	String answer = input.nextLine();
	
	if (answer.contains("yes") || answer.contains("Yes"))
	{
		System.out.println("This seemed to work");
	}
	else if (answer.contains("no") || answer.contains("No"))
	{
		System.out.println("Second step: reboot the router");
		System.out.println("are you able to connect to with the internet? (yes or no)");
		answer = input.nextLine();
	
		if (answer.contains("yes") || answer.contains("Yes"))
		{
			System.out.println("This seemed to work");
		}
		else if (answer.contains("no") || answer.contains("No"))
		{
			System.out.println("Third step: make sure the cables to the router are plugged in firmly and the router is getting power");
			System.out.println("are you able to connect to with the internet? (yes or no)");
			answer = input.nextLine();
	
				if (answer.contains("yes") || answer.contains("Yes"))
					{
						System.out.println("This seemed to work");
					}
				else if (answer.contains("no") || answer.contains("No"))
				{
					System.out.println("Fourth step: move the computer closer to the router");
					System.out.println("are you able to connect to with the internet? (yes or no)");
					answer = input.nextLine();
	
						if (answer.contains("yes") || answer.contains("Yes"))
						{
							System.out.println("This seemed to work");
						}
						else if (answer.contains("no") || answer.contains("No"))
						{
							System.out.println("Fifth step: contact your ISP");
						}
				}
		}
	}
	}
}