package _02_Advanced_Robot_Race;

import java.util.Random;

import org.jointheleague.graphical.robot.Robot;

public class AdvancedRobotRace {
	public static void main(String[] args) {
		Random rand = new Random();
		Thread r1 = new Thread(() -> {
			Robot one = new Robot(400, 700);
			one.setSpeed(5);
			while (one.getY() >= 100) {
				one.move(rand.nextInt(100));
			}
			System.out.println("One");
		});
		Thread r2 = new Thread(() -> {
			Robot two = new Robot(800, 700);
			two.setSpeed(5);
			while (two.getY() >= 100) {
				two.move(rand.nextInt(100));
			}
			System.out.println("Two");
		});
		Thread r3 = new Thread(() -> {
			Robot three = new Robot(1200, 700);
			three.setSpeed(5);
			while (three.getY() >= 100) {
				three.move(rand.nextInt(100));
			}
			System.out.println("Three");
		});
		r1.start();
		r2.start();
		r3.start();
	}
}
