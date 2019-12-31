package dockertest;

import java.util.Date;

public class DockerTest {

	public static void main(String[] args) {		
		Date d = new Date();
		StringBuilder builder = new StringBuilder();
		builder
			.append("******* ").append(d.toString()).append("*******")
			.append("\nargs:");
			for (String arg : args) {
				builder.append("\n").append(builder.append(arg));
			}			
		System.out.println(builder);
	}
}
