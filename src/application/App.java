package application;

public class App {
	
	private int count = 1;

	public static void main(String[] args) {
		new App().run();

	}
	
	public void run() {
		
		final String NAME = "Peter";
		String lastName = "Lapicola";
		
		class Test {
			public void print() {
				//name = "Peter";
				//The local instance variable name can't be accessed unless 
				//it is a constant (cant declare String name; has to be final
				//String name and has to be initialized when declared
				System.out.println(NAME);
				System.out.println(count);
				
				/* If the variable is initialized upon declaration and not
				 * changed elsewhere, it is considered effectively final, and 
				 * can be accessed by the inner class.  If the variable is changed
				 * after initialization, it is no longer effectively final and can
				 * not be accessed by the local inner class.
				 */
				System.out.println(lastName);
			}
		}
		
		new Test().print();
	}

}
