package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Pessoa> pArray = new ArrayList<>();
		
		System.out.println("Cadastre as pessoas (0 para sair)");
		
		do {
			Pessoa p = new Pessoa();
			Endereco e = new Endereco();
			
			System.out.println("Nome: ");
			p.setNome(s.nextLine());
			p.setEmail(s.nextLine());
			p.setTelefone(s.nextLine());
			e.setNomeCidade(s.nextLine());
			e.setNumero(s.nextInt());
			e.setRua(s.nextLine());
			
			
		} while(true);
	}

}
