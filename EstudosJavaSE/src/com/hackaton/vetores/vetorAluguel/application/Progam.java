package com.hackaton.vetores.vetorAluguel.application;

import java.util.Locale;
import java.util.Scanner;

import com.hackaton.vetores.vetorAluguel.entities.Estudante;


public class Progam {

	public static void main (String[] args) {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		 System.out.println("How many roms be rented?: ");
	        int n = sc.nextInt();

	        //setando 1000 quartos, para exemplo
	        Estudante[] vect = new Estudante[1000];

	        //o FOR to fazendo em cima do N que vc entrou ali em cima como a quantidade de quartos a serem alugados 
	        for (int i=0; i<n; i++) {
	            sc.nextLine();
	            System.out.println("Nome: ");
	            String nome = sc.next();
	            System.out.println("Email: ");
	            String mail = sc.next();
	            
	            //crio um local pra armazenar o valor do quarto e um boolean pra usar como verifica��o
	            Boolean roomNotAvailable = null;
	            Integer room = null;
	            do {
	               System.out.println("Quarto: ");
	               room = sc.nextInt(); 

	               //depois de pegar o valor, eu verifico se ele � maior que o maior n�mero do quarto
	               //se for, eu j� seto como n�o disponivel, coloco uma msg
	               //e dou CONTINUE pra ele pular pra verifica��o do while
	               if(room >= 1000) {
	                roomNotAvailable = true;
	                System.out.println("Quarto n�o existe");
	                continue;
	               }
	               //a mesma coisa do anterior verificando se o quarto est� com alguem
	               if(vect[room] != null) {
	                roomNotAvailable = true;
	                System.out.println("Quarto ocupado");
	                continue;
	               }

	               //se as duas verifica��es passaram eu seto o quarto como disponivel e isso faz sair do while
	               roomNotAvailable = false;
	            } while (roomNotAvailable);
	            //troco o i(agora ele serve pra controlar qual reserva t� sendo feita)
	            //pelo ROOM que � o quarto que foi selecionado
	            vect[room] = new Estudante(nome,mail);
		}
		
		for (int j=0; j<vect.length; j++ ) {
			if(vect[j] == null) continue;
			System.out.printf("No quarto " + j + " Esta o aluno " + vect[j].getNome() + "%nEmail " + vect[j].getMail());
		}
		
		sc.close();
	}
	
}
