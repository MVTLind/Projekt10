package common;

public class Main {

	public static void main(String[] args) {

		boolean running = true;

		while (running){
			Menu menu = new Menu();
			menu.inputSelection();
			running = menu.running;
		}


	}
}
