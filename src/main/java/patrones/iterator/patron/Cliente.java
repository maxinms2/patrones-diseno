package patrones.iterator.patron;

public class Cliente {
	    public static void main(String[] args) {
	        int[] numbers = {1, 2, 3, 4, 5};
	        Iterator iterator = new ArrayIterator(numbers);

	        while (iterator.hasNext()) {
	            System.out.println(iterator.next());
	        }
	    }

}
