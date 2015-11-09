package exe01;

import java.util.Scanner;

public class Principal {
    private static Scanner sc;

	public static void main(String[] args) {
    	sc = new Scanner(System.in);
    	int contador = 1;
    	String resp, sex;
    	GrupoDePesquisa pesq = new GrupoDePesquisa();
    	
    	while(contador <= 15){
    		System.out.println("Insira a resposta(SIM ou NAO) e sexo(M ou F) do entrevistado: ");
    		resp = sc.nextLine();
    		sex = sc.nextLine();
    		pesq.recebePessoa(resp, sex);
    		contador++;
    		
    	}
    	
    	System.out.println("Pessoas que responderam Sim: "+pesq.pessoasSim(0)+".");
    	System.out.println("Pessoas que responderam Nao: "+pesq.pessoasNao(0)+".");
    	System.out.println("Pessoas do sexo feminino que responderam Sim: "+pesq.pessoasSim(1)+".");
    	System.out.println("Porcentagem de pessoas do sexo Masculino que responderam Nao entre"
    			+ "todas as pessos do sexo masculino analisadas: "+pesq.pessoasNao(1)+"%.");
    	
	}
	
}
