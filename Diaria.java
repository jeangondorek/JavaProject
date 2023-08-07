import java.util.ArrayList;
import java.util.Scanner;

class Diaria {
    Scanner scan = new Scanner(System.in);
    ArrayList<Double> kmsdocarro = new ArrayList<Double>();

    double valortotal;

	double kmspagar;

	double dias;

	double litrosapagar;
    
    void Calculartotaldiarias(double vldd) {
		System.out.println("Digite a quantidade de dias locados.");
		dias = scan.nextInt();
		dias = vldd * dias;
		System.out.println("Total das diarias:" + dias);
		System.out.println("\n\n\n");
	}

	void Calcularquilometragem(double tata ) {
		double kmsatual;
		int i;
		System.out.println("Digite a ID do cliente para calculo.");
		i = scan.nextInt();
		System.out.println("Digite a quilometragem atual do carro.");
		kmsatual = scan.nextDouble();
		i=i-1;
        kmspagar = kmsatual - kmsdocarro.get(i);
		System.out.println("Quilometragem rodada, calcular taxa = " + kmspagar + "km");
		kmspagar = kmspagar * tata;
		System.out.println("Pagar: " + kmspagar + "R$");
		System.out.println("\n\n\n");
	}

	void Calcularreposicaocombustivel(double vlpc) {
		System.out.println("Digite os litros a pagar.");
		litrosapagar = scan.nextDouble();
		litrosapagar = litrosapagar * vlpc;
		System.out.println("R$ pagos pelos litros: " + litrosapagar);
		System.out.println("\n\n\n");
	}

	void Calcvalortotal() {
		valortotal = dias + litrosapagar + kmspagar;
		System.out.println("Total a pagar" + valortotal + "\n\n\n");
	}

	void extrato() {
		System.out.println("Diarias: " + dias);
		System.out.println("Valor da taxa por quilometros: " + kmspagar);
		System.out.println("Valor reposicao de combustivel: " + litrosapagar);
		System.out.println("Valor total: " + valortotal + "\n\n\n");

	}
}
