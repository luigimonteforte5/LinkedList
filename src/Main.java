import java.util.LinkedList;

public class Main {
	public static void main( String[] args ) {

		LinkedList<Fruit> lista =  new LinkedList <>();

		lista.add( new Fruit("Arancia" ));
		lista.add( new Fruit("Pesca" ));
		lista.add( new Fruit("Banana" ));

		System.out.println(lista);
		System.out.println("-----------------------------------");

		lista.addFirst( new Fruit("Mela" ));
		lista.addLast( new Fruit("Pera" ));

		System.out.println("Lista dopo l'aggiunta: " + lista);

	}
}