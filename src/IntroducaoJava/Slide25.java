package IntroducaoJava;

public class Slide25 {

	public static void main(String[] args) {
		int um = 3 / 2; //divisao de inteiros gera um inteiro
		float umEmeio = (float) 3 / 2;  //ocore promo��o aritm�tica para float
		double xyz = umEmeio * um; //ocorre promo��o aritm�tica para float
		
		int resto = 7 % 2; //resto = 1
		
		long l = 1000 + 4000;
		double d = 1.0 - 0.01;
		
		long var = 12345;
		String str = "O valor de var � " +var;
		
		String str1 = "O valor de var � " +Long.toString(var);
	}
}
