import java.util.Scanner;
import java.util.ArrayList;
class Locacao{
	Scanner scan = new Scanner(System.in);
	Clientes clien = new Clientes();
	Frota carr = new Frota();
	Precos prec = new Precos();

	ArrayList<Integer> idclientelocador = new ArrayList<Integer>();

	ArrayList<String> placaveiculolocado = new ArrayList<String>();

	ArrayList<Double> kmsdocarro = new ArrayList<Double>();

	void cadastrarlocacao() {
		int idd=1;
		String placaca;
		double kms;
		System.out.println("Digite o ID do cliente:");
		idd = scan.nextInt();
		idclientelocador.add(idd);
		System.out.println("Placa do carro:");
		placaca = scan.next();
		placaveiculolocado.add(placaca);
		System.out.println("Digite os kms rodados:");
		kms = scan.nextDouble();
		kmsdocarro.add(kms);
		System.out.println("\n\n\n");
	}

	void listarlocacoes() {
		int inteiro = idclientelocador.size();
		for (int i=0; i < inteiro; i++){
			System.out.print("ID do locador: " + idclientelocador.get(i));
			System.out.print("\tPlaca do carro locado: " + placaveiculolocado.get(i));
			System.out.println("\tQuilometros iniciais do carro: " + kmsdocarro.get(i) + "\n\n");
		}
		System.out.println("\n\n\n");
	}
}
	