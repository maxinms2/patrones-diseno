package patrones.memento.sinpatron;

class Store {
	static String itemStatus = "available"; // Estado inicial del artículo

	public static void main(String[] args) {
		System.out.println("Estado inicial: " + itemStatus);
		// El artículo se reserva
		itemStatus = "reserved";
		System.out.println("Estado después de reservar: " + itemStatus);
		// El artículo se vende
		itemStatus = "sold";
		System.out.println("Estado después de vender: " + itemStatus);
		// Intento de regresar al estado "reservado"
		// ¡No hay manera de hacerlo sin modificar manualmente!
		itemStatus = "reserved";
		System.out.println("Estado después de intentar revertir: " + itemStatus);
	}
}
