package comprobarOOP;

class Rectangulo extends Figura {
	private double ancho = 0D;
	private double alto = 0D;

	Rectangulo(double ancho, double alto) {
		this.ancho = ancho;
		this.alto = alto;
		areaTamanio = ancho * alto;
	}

	double area() {
		return areaTamanio;
	}
}
