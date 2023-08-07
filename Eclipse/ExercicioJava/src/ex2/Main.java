package ex2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Pessoa> pArray = new ArrayList<>();
		String resposta;
		int escolha = 0;
		do {
			System.out.println("Escolha uma opção | cadastrar pessoas - 1 | listar pessoas - 2: ");
			escolha = Integer.parseInt(s.nextLine());
			
			switch (escolha) {
			case 1: {
				System.out.println("Cadastre as pessoas ");
				
				boolean x = false;
				do {
					Pessoa p = new Pessoa();
					Endereco e = new Endereco();
					
					System.out.println("Nome: ");
					p.setNome(s.nextLine());
					
					System.out.println("Email: ");
					p.setEmail(s.nextLine());
					
					System.out.println("Telefone: ");
					p.setTelefone(s.nextLine());
					
					System.out.println("Nome da cidade: ");
					e.setNomeCidade(s.nextLine());
					
					System.out.println("Número da casa: ");
					e.setNumero(Integer.parseInt(s.nextLine()));
					
					System.out.println("Rua: ");
					e.setRua(s.nextLine());
					
					pArray.add(new Pessoa(p, e));
					
					System.out.println("\nDeseja cadastrar mais um?: ");
				     resposta = s.nextLine();
					
				} while(resposta.equalsIgnoreCase("Sim"));
				break;
			}
			case 2: {
				for (Pessoa pessoa : pArray) {
					System.out.println(pessoa.toString(pessoa, pessoa.getE()));
				}
				break;
			}
			}
		} while(escolha != 1 || escolha != 0);
		
		
		
		
		}
		}

