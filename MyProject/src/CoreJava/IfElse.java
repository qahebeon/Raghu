package CoreJava;

public class IfElse {

	int a = 10;
	int b = 20;

	public void test(){
		if (a<b) {
			System.out.println("pass");
		}
		else{
			System.out.println("fail");
		}

	}

	public static void main(String[] args) {
		
		IfElse I = new IfElse();
		I.test();

	}

}
