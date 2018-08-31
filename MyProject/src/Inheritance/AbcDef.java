package Inheritance;

public class AbcDef {

	public static void main(String[] args) {
		// Creating object for Superclass Abc
		Abc a = new Abc();
		a.m1();
		//a.m2();  Superclass object wont access subclass method properties
		
		// Creating object for Subclass Def
		Def d = new Def();
		d.m1();
		d.m2();

	}

}
