package exe02;
public class GrupoDePesquisa {

	private Espectador[] espectadores = new Espectador[15];
	private int quantidadeEspectadores;


	public void recebeEspectador (int op, int idade){
		if(quantidadeEspectadores < espectadores.length){
			Espectador novoEspectador = new Espectador();
			novoEspectador.setOpiniao(op);
			novoEspectador.setIdade(idade);
			espectadores[quantidadeEspectadores] = novoEspectador;
			quantidadeEspectadores++;
		}

	}

	public double idadeMediaOtimo(){
		double idademedia1 = 0;
		int numeroOtimo=0;
		for(int i = 0; i < espectadores.length; i++){
			if (espectadores[i].getOpiniao() == 3){
				idademedia1 = idademedia1 + espectadores[i].getIdade();
				numeroOtimo++;
			}
		}
		idademedia1 = idademedia1 / numeroOtimo;

		return idademedia1;
	}

	public int quantidadeRegular(){
		int quantReg = 0;
		for(int i = 0; i < espectadores.length; i++){
			if (espectadores[i].getOpiniao() == 1){
				quantReg++;
			}
		}

		return quantReg;
	}

	public int porcentagemBom(){
		int porcentagem;
		int quantBom = 0;
		for(int i = 0; i < espectadores.length; i++){
			if (espectadores[i].getOpiniao() == 2){
				quantBom++;
			}
		}

		porcentagem = (quantBom * 100) / espectadores.length;

		return porcentagem;
	}

}