package exe02;
import java.util.Scanner;

public class Principal {
    private static Scanner sc;

	public static void main(String[] args) {
    	sc = new Scanner(System.in);
    	int op, idade, contador=1;
    	GrupoDePesquisa pesq = new GrupoDePesquisa();

    	while (contador <= 15){
    		System.out.println("Insira a opiniao e idade do espectador");
    		op = sc.nextInt();
    		idade = sc.nextInt();
    		pesq.recebeEspectador(op, idade);
    		contador++;
    	}

    	System.out.printf("Idade media de quem respondeu \"Otimo\": %.2f\n",pesq.idadeMediaOtimo());
    	System.out.println("Quantos responderam \"Regular\": "+pesq.quantidadeRegular()+".");
    	System.out.println("Porcentagem de quantos responderam \"Bom\": "+pesq.porcentagemBom()+"%.");
    	
    }
}

