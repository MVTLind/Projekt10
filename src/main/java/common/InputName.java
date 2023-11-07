package common;

import java.util.Scanner;

public class InputName {
	String compName = "";
	int score = 0;


	//Add competitor
	public String addCompetitor() {

		boolean active = true;
		String compName = "";
		Scanner sc = new Scanner(System.in);

		while (active) {
			System.out.println("Please enter the competitor's name:");
			compName = sc.nextLine();
			if (!compName.matches(".*[a-�A-�]")) {
				System.out.println("Only use letters when putting in competitors name.");

			} else {
				active = false;
			}

		}
		return compName;
	}
}
