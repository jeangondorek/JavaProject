import java.util.Scanner;
class Precos {

	double valordiaria ;

	double taxaquilometro;

	double valorcombustivel;
	
	Scanner scan = new Scanner(System.in);

	void cadastrarprecos() {
		System.out.println("Digite o valor da diaria:");
		valordiaria = scan.nextDouble();
		System.out.println("Digite o valor da taxa por quilometro: ");
		taxaquilometro = scan.nextDouble();
		System.out.println("Digite o valor do combustivel: ");
		valorcombustivel = scan.nextDouble();
		System.out.println("\n\n\n");
	}
	void listarvalores() {
		System.out.println("Valor da diaria: " + valordiaria);
		System.out.println("Valor da taxa por quilometro: " + taxaquilometro);
		System.out.println("Valor do litro de combustivel: " + valorcombustivel + "\n\n");
		System.out.println("\n\n\n");
	}
}
