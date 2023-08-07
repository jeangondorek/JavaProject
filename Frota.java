import java.util.Scanner;
import java.util.ArrayList;
class Frota {

	ArrayList <String> marca = new ArrayList<String>();

	ArrayList <String> modelo = new ArrayList<String>();

	ArrayList <String> placa = new ArrayList<String>();

	ArrayList <Double> quilometragem = new ArrayList<Double>();

	Scanner scan = new Scanner(System.in);

	void cadastrarfrota() {
		String marc1;
		String model1;
		String plac1;
		double quilometrage1;
		System.out.println("Digite a marca do carro.");
		marc1 = scan.nextLine();
		System.out.println("Digite o modelo do carro.");
		model1 = scan.nextLine();
		System.out.println("Digite a placa do carro.");
		plac1 = scan.nextLine();
		System.out.println("Digite a quilometragem inicial do carro.");
		quilometrage1 = scan.nextDouble();
		modelo.add(model1);
		placa.add(plac1);
		quilometragem.add(quilometrage1);
		marca.add(marc1);
		System.out.println("\n\n\n");
	}

	void listarveiculos() {
		int inteiro = quilometragem.size();
		for (int i=0; i < inteiro; i++){
			System.out.print("Marca: " + marca.get(i));
			System.out.print("\tModelo " + modelo.get(i));
			System.out.println("\tPlaca: " + placa.get(i));
			System.out.println("\tQuilometragem: " + quilometragem.get(i) + "\n\n");
		}
		System.out.println("\n\n\n");
	}

}
