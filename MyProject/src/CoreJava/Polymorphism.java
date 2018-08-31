package CoreJava;

public class Polymorphism {
	public void add(int a, int b){
		int c = a+b;
		System.out.println("sum of a+b is = " +c);
		
	}
	public void add(int a, int b, int c){
		int x = a+b+c;
		System.out.println("sum of a+b+c is = " +x);
	}
	public void add(int a , double b){
		double z = a+b;
		System.out.println("sum of a+b is = " +z);
	}

	public static void main(String[] args) {
		Polymorphism p = new Polymorphism();
		p.add(10, 20);
		p.add(10, 20, 30);
		p.add(10, 20.50);
		
	}

}
