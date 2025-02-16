//import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		var male = new Person();
		male.setName("Xilitol");
		male.setAge(29);
		var female = new Person();
		female.setName("Sacarose");
		female.setAge(23);
		
		System.out.println("Male name: " + male.getName() + " age is:" + male.getAge());
		System.out.println("Female name: " + female.getName() + " age is: " + female.getAge() );
	}
	
	
}
