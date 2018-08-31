package Interface;
//Syntax to 'implement' Interface in a class

public class HumanClass implements GodInterface {

	public static void main(String[] args) {
		HumanClass h = new HumanClass();
		h.run();
		h.eat();
		h.sleep();
		System.out.println("Human have "+nose+" nose");
		System.out.println("Human have "+neck+" neck");


	}

	@Override
	public void run() {
		System.out.println("Human can run");
	}

	@Override
	public void eat() {
		System.out.println("Human can eat");
	}

	@Override
	public void sleep() {
		System.out.println("Human can sleep");
	}

}
