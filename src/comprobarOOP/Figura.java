package comprobarOOP;

abstract class Figura {
	protected double areaTamanio = 0D;

	abstract double area();

	String obtenerArea() {
		return Double.toString(areaTamanio);
	};

}
