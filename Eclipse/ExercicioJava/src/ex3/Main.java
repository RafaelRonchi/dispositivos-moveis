package ex3;

public class Main {

	public static void main(String[] args) {
		Forma retangulo = new Retangulo(4, 5);
        Forma quadrado = new Quadrado(3);
        Forma circulo = new Circulo(2);

        System.out.println("Área do Retângulo: " + retangulo.area());
        System.out.println("Perímetro do Retângulo: " + retangulo.perimetro());

        System.out.println("Área do Quadrado: " + quadrado.area());
        System.out.println("Perímetro do Quadrado: " + quadrado.perimetro());

        System.out.println("Área do Círculo: " + circulo.area());
        System.out.println("Perímetro do Círculo: " + circulo.perimetro());

	}
	

}

