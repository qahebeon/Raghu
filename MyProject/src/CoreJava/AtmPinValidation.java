package CoreJava;

import java.util.Scanner;



public class AtmPinValidation {


	Scanner sc = new Scanner(System.in);
	int pin = 1234;

	public void validation(){

		System.out.println("Enter pinNo:");
		int pinNo = sc.nextInt();

		if(pin==pinNo){
			System.out.println("Pin entered successfully");
		}
		else{
			System.out.println("Incorrect pinNo");
		}
	}

	public static void main(String[] args) {

		AtmPinValidation a = new AtmPinValidation();
		a.validation();

	}

}
