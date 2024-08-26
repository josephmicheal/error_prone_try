

public class MyBuggyApp {
	
	public static void main(String args[]) {
		System.out.print("Hello!");
		
		if(args.length==1) {
			new IllegalAccessException();
		}
	}

}
