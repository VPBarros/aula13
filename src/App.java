import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        	//Logica de programação/Estrutura Repetitiva/ Faça enquanto do while
		//Programa para ler temperatura e Celsius mostrar equivalente e Fahrenheit.Perguntando ao usuario
		//se deseja repetir?(s/n) se sim (s) repetir o programa.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		char resp;
		do {
			System.out.print("Digite temperatura em Celsius: ");
			double C = sc.nextDouble();
			double F = 9.0 * C/5.0 + 32.0;
			System.out.printf("Equivalente e Fahrenheit: %.1f%n" ,F);
			System.out.print("Deseja repetir (s/n)? ");
			resp = sc.next().charAt(0);
		}while (resp != 'n');
		
		
	sc.close();	

    }
}
