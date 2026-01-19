public class Main { 
	public static void main(String[] args) { 

		System.out.println("Welcome to Git Practice! Features A and B merged"); 
		greet("FeatureA_User"); 
		greet("FeatureB_User"); }

	
	public static void greet(String name) { 
		System.out.println("Hello, " + name + "!"); }
}