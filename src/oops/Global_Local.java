package oops;

public class Global_Local {

	// Global or class variables can be non-static or static
	// Local variables are neither static or non-static 
	// We can call static entity directly inside a main() method
	// We can call static entity via the class name also in main() method
	//
	static int age = 25;
	String language[] = { "Kannada", "English", "Hindi", "Tamil" };
	static double d = 10.45;

	public static void main(String args[]) {

		System.out.println("Print me");
		Test();
		Global_Local.Test();
		age = 12;
		d = 45.4;
		Global_Local.age = 7;
	}

	public static void Test() {
		int i = 20;

		String name = "vikas";
		System.out.println(i + name);

	}

	public static void Sample() {
		int j = 30;
		String language = "Java";
		System.out.println(j + language);
	}
}
