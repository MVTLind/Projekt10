package common;

public class Main {

	public static void main(String[] args) {
		Menu menu = new Menu();
		boolean running = true;

		while (running){
			menu.inputSelection();
			running = menu.running;
		}
	}
}
