package altura;

public class Altura {
	public static void main(String[] args) {
		float chico = 1.5f, ze = 1.1f;
		int ano = 0;

		while(chico >= ze) {
			
			chico += 0.02;
			
			ze += 0.03;
			
			ano++;
			System.out.printf("Chico: %.2f\tZe: %.2f\tAno: %d\n", chico, ze, ano);
		}
		System.out.println("Sao necessarios " + ano + " anos!\n");
	}
}
