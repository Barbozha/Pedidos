package Programas;

import java.text.Normalizer.Form;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

import Entidades.Cliente;
import Entidades.ItemPedido;
import Entidades.Pedidos;
import Entidades.Produto;
import Pedidos.enun.Pedidos_Status;

public class Principal {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("-------------------------------------");
		System.out.println("           DADOS DO CLIENTE          ");
		System.out.println("-------------------------------------");
		System.out.print("Nome: ");
		String nomecli = ler.nextLine();
		System.out.print("Email: ");
		String email = ler.nextLine();
		System.out.println("Data de Nacimento: ");
		Date datanascimento = sdf.parse(ler.next());
		
		//Gravando dados na classe cliente
		Cliente cliente = new Cliente(nomecli, email, datanascimento);
		
		System.out.println("-------------------------------------");
		System.out.println("            DADOS DO PEDIDO          ");
		System.out.println("-------------------------------------");
		System.out.println("Digite a data do Pedido (dd/mm/yyyy)");
		Date data = sdf.parse(ler.next());
		System.out.println("Digite o Status do Pedido:");
		Pedidos_Status status = Pedidos_Status.valueOf(ler.next());
		
		//Gravando dados na classe pedido
		Pedidos pedido = new Pedidos(data, status, cliente);
		
		System.out.println("-------------------------------------");
		System.out.println("            ÍTENS DO PEDIDO          ");
		System.out.println("-------------------------------------");
		System.out.println("Quantos itens do Pedido");
		int num = ler.nextInt();
		for(int i = 1 ; i <= num ; i++) {
			System.out.println("Entre com os dados do item #"+i);
			System.out.print("Nome do Produto: ");
			ler.nextLine();
			String nome_produto = ler.nextLine();
			System.out.print("Preço do Produto: ");
			double preco = ler.nextDouble();
			
			//Gravando dados do Produto
			Produto produto = new Produto(nome_produto, preco);
			
			System.out.print("Quantidade: ");
			int qtde = ler.nextInt();
			
			//Gravando dados do Item de produto
			ItemPedido itens = new ItemPedido(qtde, preco, produto);
			
			// Adicionando item de produto
			pedido.adicionaItem(itens);
		}
		
		System.out.println("");
		System.out.println(pedido);
		
		ler.close();
	}

}
