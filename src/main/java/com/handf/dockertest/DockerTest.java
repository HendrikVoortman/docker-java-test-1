package com.handf.dockertest;

import java.util.Date;

public class DockerTest {

	public static void main(String[] args) throws InterruptedException {		
		Date d = new Date();
		StringBuilder builder = new StringBuilder();
		builder
		.append("******* ").append(d.toString()).append(" [v1] *******")
		.append("\nargs:");
		for (String arg : args) {
			builder.append("\n").append(builder.append(arg));
		}			
		System.out.println(builder);

		final int SLEEP_DURATION = 10;
		for (int i=1; i <= SLEEP_DURATION; i++) {
			System.out.println("delay=" + i);
			Thread.sleep(1000);
		}
		System.out.println("finished sleeping...");			
	}
}
