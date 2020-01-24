package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	public static void main(String[] args) {
		Thread r1 = new Thread(()-> {
			Robot one = new Robot(300, 200);
			one.setSpeed(10);
			one.setPenColor(Color.blue);
			one.penDown();
			one.setPenWidth(3);
			for (int i = 0; i < 360; i++) {
				one.move(3);
				one.setAngle(i);	
			}		
		});
		Thread r2 = new Thread(()-> {
			Robot two = new Robot(600, 200);
			two.setSpeed(10);
			two.setPenColor(Color.black);
			two.penDown();
			two.setPenWidth(3);
			for (int i = 0; i < 360; i++) {
				two.move(3);
				two.setAngle(i);	
			}
		});
		Thread r3 = new Thread(()-> {
			Robot three = new Robot(900, 200);
			three.setSpeed(10);
			three.setPenColor(Color.red);
			three.moveTo(1);
			three.setPenWidth(3);
			for (int i = 0; i < 360; i++) {
				three.move(3);
				three.setAngle(i);	
			}
		});
		Thread r4 = new Thread(()-> {
			Robot four = new Robot(450, 500);
			four.setSpeed(10);
			four.setPenColor(Color.yellow);
			four.penDown();
			four.setPenWidth(3);
			for (int i = 0; i < 360; i++) {
				four.move(3);
				four.setAngle(i);	
			}
		});
		Thread r5 = new Thread(()-> {
			Robot five = new Robot(750, 500);
			five.setSpeed(10);
			five.setPenColor(Color.green);
			five.penDown();
			five.setPenWidth(3);
			for (int i = 0; i < 360; i++) {
				five.move(3);
				five.setAngle(i);	
			}
		});
		r1.start();
		r2.start();
		r3.start();
		r4.start();
		r5.start();
	}
}