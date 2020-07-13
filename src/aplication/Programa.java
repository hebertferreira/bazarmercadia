package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.ItemPedido;
import entities.Produto;

public class Programa {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		Cliente cliente;
		Produto p1 = new Produto("TV", 1200.0);
		ItemPedido ip1 = new ItemPedido(p1, 2, p1.getValorUnitario());
		
		System.out.println(ip1);
		
		
		/*System.out.println("Entre com os dados do cliente:");
		System.out.print("Nome: ");
		String nomeCliente = sc.nextLine();
		System.out.print("Email: ");
		String emailCliente = sc.nextLine();
		System.out.print("Data Aniversario (DD/MM/YYYY): ");
		Date dataAniversarioCliente = sdf.parse(sc.next());
		
		cliente = new Cliente(nomeCliente, emailCliente, dataAniversarioCliente);
		*/
		
		sc.close();	
	}

}
