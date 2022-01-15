package PTIPOO;

public class Ponto {

	private int x;
	private int y;
	double Dist;

	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Ponto() {
		this.x = 0;
		this.y = 0;

	}

	public boolean ehIgual(Ponto p) {

		if (this.x == p.x && this.y == p.y)
			return true;
		else
			return false;

	}

	public double Dist(Ponto p) {
		double c1 = this.x - p.x;
		double c2 = this.y - p.y;
		return Math.sqrt(c1*c1+c2*c2);
	}
		
		/*int Xa = this.x;
		int Ya = this.y;
		int Xb = p.x;
		int Yb = p.y;
		Dist = Math.sqrt((Xb - Xa)*(Xb - Xa) + (Yb - Ya) * (Yb - Ya));
		// double Dist = (Math.sqrt(Math.pow((Xb - Xa), 2) * (Math.pow((Yb - Ya), 2))));
		return Dist;
	}*/

	public String toString() {
		return this.x + " " + this.y;
	}
}
