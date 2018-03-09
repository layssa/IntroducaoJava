package IntroducaoJava;

public class Slide24 {

	public static void main(String[] args) {
		int a = 0; 
		int b = a++; //incrementando depois de atribuir
		int c = ++a; //incrementando antes de atribuir
		b = a--; //decrementando depois de atribuir
		c = --a; //decrementando antes de atribuir
		
		int x = +3; //x recebe o positivo 3
		x = -x; //x recebe -3, neste caso
		
		int i = ~1; //i= -2 (os bits foram invertidos)
		
		boolean falsidade =! (true); //inverte o valor booleano
		
		double d = 1.99;
		int i1 = (int) d; //converte de double p/ int (perda de precisão)

	}

}
