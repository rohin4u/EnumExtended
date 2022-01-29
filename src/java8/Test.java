package java8;

public class Test {
	
	public static void main(String[] args) {
//		Animal a = new Animal();
//		a.m1("delhi");
		
//		()->{System.out.println("inside main method");};
		Animal s1 = s->{return s;};
		s1.m1("delhi");
	}

}
