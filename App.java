
public class App {

	public static void main(String[] args) {
	

		    MyTreeElement tree = new MyTreeElement();
		    tree.erstelleBaum();
		 
		    boolean gefunden = (tree.sucheKnoten('b'));
		    
		    if (gefunden == true) {
				System.out.println("Gefunden");
			}
		    else {
		    	System.out.println("Nicht Gefunden");
			}

		
		
		

	}

}
