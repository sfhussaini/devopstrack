package demo;
public class App {
	public String getGreeting() {
		return "Hello world.";
	}
	
	public Integer divide(Integer n1, Integer n2){
		return n1/n2;
	}
	
	public static void main(String[] args) {
		System.out.println(new App().getGreeting());
	}
}
