package test;

public class MethodTest {

	public static void main1(String[] args) {
		// Bar var1 = new Bar(); //Bar-#1
		// Bar var2 = new Bar(2); //Bar-#2
		// Bar var4 = new Bar(3.14); //Bar-#2 Bar-#3
		// Foo var4 = new Foo(); //Compile Error
		// Foo var5 = new Bar(2); //Compile Error
		// Foo var6 = new Bar(1.1); //Compile Error
		// Fubar var7 = new Fubar(); //Compile Error
		// Fubar var8 = new Fubar(2); //Bar-#1 Foo-#1 Fubar-#3 Fubar-#2
		// Fubar var9 = new Fubar(1.1); //Bar-#1 Foo-#1 Fubar-#3
	}

	public static int recurse(int a, int b) {
		System.out.println(a);
		System.out.println(b);
		if (a > b + 2) {
			return 3 + recurse(a - 1, b + 1);
		} else if (a > b) {
			return 2 + recurse(a - 2, b);
		}
		return 4;
	}

	public static void main(String[] args) {
		System.out.println("Recursion starts!");
		int result = recurse(10, 2);
		System.out.println(result);
		System.out.println("Recursion ends!");
	}

}

class Bar {
	public Bar() {
		System.out.println("Bar-#1");
	}

	public Bar(int x) {
		System.out.println("Bar-#2");
	}

	public Bar(double x) {
		this(2);
		System.out.println("Bar-#3");
	}
}

class Foo extends Bar {
	public Foo(int x) {
		super();
		System.out.println("Foo-#1");
	}

	public Foo(double x) {
		super(x);
		System.out.println("Foo-#2");
	}
}

class Fubar extends Foo {
	/*public Fubar() {
		System.out.println("Fubar-#1");
	}*/

	public Fubar(int x) {
		this(3.14);
		System.out.println("Fubar-#2");
	}

	public Fubar(double x) {
		super(2);
		System.out.println("Fubar-#3");
	}
}