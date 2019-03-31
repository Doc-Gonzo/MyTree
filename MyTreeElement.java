
/*  Erstelle eine eigene binäre Baum-Klasse MyTreeElement, welche Buchstaben (char) speichert. 
 * Zeichne zuerst ein UML-Diagramm und implementeire dieses anschließend. Fertige am Ende ein ausführliches Testprotokoll an.
 * 
 * 
a.    Jedes MyTreeElement speichert einen Buchstaben und kann einen linken und rechten Kindknoten vom Typ MyTreeElement haben.
b.    Links werden kleinere (z.B. a < b) oder gleiche Buchstaben abgelegt, rechts größere.
c.    Neben der add(char c) Methode brauchst du eine Methode count(char c), welche die Schritte beim Suchen nach einem bestimmten 
	Buchstaben zählt. */
public class MyTreeElement {
	Knoten start;
	
	public MyTreeElement() {
	// start Bleibt null fuer ersten Check
	
	}
	
	/*if the new node’s value is lower than the current node’s, we go to the left child
	if the new node’s value is greater than the current node’s, we go to the right child
	when the current node is null, we’ve reached a leaf node and we can insert the new node in that position */	
	
	
	// Rekursive Add Methode
	private Knoten addRek(Knoten current, char value) {
		// Wenn Tree leer, dann erstelle ersten Knoten
	    if (current == null) {
	        return new Knoten(value);
	    }
	    // Wenn kleiner, links einfuegen
	    if (value < current.value) {
	        current.links = addRek(current.links, value);
	    } 
	    // Wenn groesser, rechts einfuegen
	    else if (value > current.value) {
	        current.rechts = addRek(current.rechts, value);
	    } 
	    else {
	    // Wenn bereits Existent:
	        return current;
	    }	 
	    return current;
	}
	// Add Methode die die Rekursive aufruft
	public void addChar(char value) {
	    start = addRek(start, value);
	}
	// Test-Baum erstellen
	MyTreeElement erstelleBaum() {
	    MyTreeElement tree = new MyTreeElement();
	    
	    tree.addChar('a');
	    tree.addChar('e');
	    tree.addChar('c');
	    tree.addChar('f');
	    tree.addChar('b');
	    tree.addChar('d');	 
	    return tree;
	}
	// Rekursiv durchsuchen
	public boolean sucheRek(Knoten current, char value) {
	    if (current == null) {
	        return false;
	    } 
	    if (value == current.value) {
	        return true;
	    } 
	    
	    return value < current.value
	      ? sucheRek(current.links, value)
	      : sucheRek(current.rechts, value);
	}
	// Durchsuchen
	public boolean sucheKnoten(char value) {
	    return sucheRek(start, value);
	}
	
	
}
