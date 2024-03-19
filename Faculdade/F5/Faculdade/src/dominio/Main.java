package dominio;

public class Main {

	public static void main(String[] args) {
		cliente cliente1 = new cliente(1, "Diego Sinhorini", "email@fiap.com.br", "28-07-2003", "password123");
		cliente cliente2 = new cliente(2, "Ana Takata", "email@fiap.com.br", "19-02-1998", "password123");
		tipoInvestimento cdi =  new tipoInvestimento(1, "CDI");
		Investimento investimento1 = new Investimento(1, cliente1, cdi, "CDI", "Banco da Europa", 100.00, "18-02-2024", "18-02-2026");


		
		System.out.println(cliente1.exibirDados());
		System.out.println(cliente2.exibirDados());
		investimento1.exibirDados();
		investimento1.alterar(1, "CDB", "Novo Banco MundoOpen", 200.0, "18-02-2024", "18-02-2028");
		investimento1.exibirDados();

	}

}
