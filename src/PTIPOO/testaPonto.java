package PTIPOO;

public class testaPonto {

	public static void main(String[] args) {
		// Ponto x e y são Variaveis de referencia para um objeto da classe Ponto
		Ponto p1, p2, p3, p4;

		// Cria um objeto Ponto - dois construtores - sobrecarregados
		p1 = new Ponto(3, 4);
		p2 = new Ponto();
		p3 = new Ponto();
		p4 = new Ponto();

		if (p1.ehIgual(p2))
			System.out.println("Iguais");
		else
			System.out.println("Diferentes");

		System.out.println("Ponto 1: " + p1);
		System.out.println("Ponto 2: " + p2);
		System.out.println(p1.ehIgual(p2));
		System.out.println(p1.Dist(p2));
		System.out.println();
		System.out.print(p4);
		//System.out.print("A distancia entre os pontos é: " + p1.Dist(p1) + " " + p2.Dist(p2) + " " + p3.Dist);

	}

}
