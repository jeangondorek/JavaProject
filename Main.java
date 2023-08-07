import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);
	
    public static void main(String[] args){
		Precos precos = new Precos();
		Clientes clientes = new Clientes();
		Frota frota = new Frota();
		Locacao loc = new Locacao();
        Diaria diaria = new Diaria();
		int opt=-1;
		while(opt!=0){
			System.out.println("Digite a opcao desejada:");
			System.out.println("1  - para cadastrar clientes");
			System.out.println("2  - para cadastrar frota");
			System.out.println("3  - para cadastarar precos");
			System.out.println("4  - para listar clientes");
			System.out.println("5  - para listar frota");
			System.out.println("6  - para listar precos");
			System.out.println("7  - para cadastrar locacao");
			System.out.println("8  - para listar locacoes");
			System.out.println("9  - para calcular total de diarias");
			System.out.println("10 - para calcular valor quilometragem");
			System.out.println("11 - para calcular reposicao combustivel");
			System.out.println("12 - para calcular valor total");
			System.out.println("13 - para ver extrato");
			System.out.println("0  - para sair");
			System.out.println("\n\n");
			opt = scan.nextInt();
			switch(opt){
				case 1:{
					clientes.cadastrarclientes();
					break;
				}
				case 2:{
					frota.cadastrarfrota();
					break;
				}
				case 3:{
					precos.cadastrarprecos();
					break;
				}
				case 4:{
					clientes.listarclientes();
					break;
				}
				case 5:{
					frota.listarveiculos();
					break;
				}
				case 6:{
					precos.listarvalores();
					break;
				}
				case 7:{
					loc.cadastrarlocacao();
					break;
				}

				case 8:{
					loc.listarlocacoes();
					break;
				}

				case 9:{
					double valordiariad = precos.valordiaria;
					diaria.Calculartotaldiarias(valordiariad);
					break;
				}

				case 10:{
					double taxaquilometroq = precos.taxaquilometro;
					diaria.Calcularquilometragem(taxaquilometroq);
					break;
				}

				case 11:{
					double valorcombustivelc = precos.valorcombustivel;
					diaria.Calcularreposicaocombustivel(valorcombustivelc);
					break;
				}

				case 12:{
					diaria.Calcvalortotal();
					break;
				}
				case 13:{
					diaria.extrato();
					break;
				}
				case 0:{
					System.out.println("SAINDO.....");
					System.out.println("\n\n\n");
					break;
				}
				default:
					System.out.println("ERRO");
					System.out.println("\n\n\n");
					break;
			}
		}
    }
}
