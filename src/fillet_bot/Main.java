package fillet_bot;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.net.*;
import java.util.Scanner;



public class Main {
	static Robot robot;

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		String button1,button2,button3,button4,button5,button6;
		int laps;
		int delay = 85;//if you get errors increase val 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the buttons (include the initial W) make sure to press enter after each line");
		button1= sc.nextLine();
		button1.toUpperCase();
		button2= sc.nextLine();
		button2.toUpperCase();
		button3= sc.nextLine();
		button3.toUpperCase();
		button4= sc.nextLine();
		button4.toUpperCase();
		button5= sc.nextLine();
		button5.toUpperCase();
		button6= sc.nextLine();
		button6.toUpperCase();
		System.out.println("Enter the number of laps");
		laps = sc.nextInt();
		System.out.println("switch to rdr2");
		robot = new Robot();
		robot.delay(2000);
		for (int i = 0;i<laps;i++) {
			buttonsrobot(button1,delay);
			buttonsrobot(button2,delay);
			buttonsrobot(button1,delay);
			buttonsrobot(button3,delay);
			buttonsrobot(button1,delay);
			buttonsrobot(button4,delay);
			buttonsrobot(button1,delay);
			buttonsrobot(button5,delay);
			buttonsrobot(button1,delay);
			buttonsrobot(button6,delay);
		}
	}	
	private static void buttonsrobot(String input,int delay) throws AWTException {
		
		if(input.equals("w")) {
			robot.keyPress(KeyEvent.VK_W);
		}
		if(input.equals("a")) {
			robot.keyPress(KeyEvent.VK_A);
		}
		if(input.equals("s")) {
			robot.keyPress(KeyEvent.VK_S);
		}
		if(input.equals("d")) {
			robot.keyPress(KeyEvent.VK_D);
		}
		robot.delay(delay);
	}

}
