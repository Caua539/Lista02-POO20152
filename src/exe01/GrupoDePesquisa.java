package exe01;


public class GrupoDePesquisa {
	private Pessoa[] pessoas = new Pessoa[15];
	private int quantidadePessoas = 0;
	
	public void recebePessoa (String resp, String sex){
		if(quantidadePessoas < pessoas.length){
			Pessoa novoPessoa = new Pessoa();
			novoPessoa.setResposta(resp);
			novoPessoa.setSexo(sex);
			pessoas[quantidadePessoas] = novoPessoa;
			quantidadePessoas++;
		}
	}
		
	public int pessoasSim (int op){
		int contadorSim=0;
		int contadorSimF=0;
		for(int i = 0; i < pessoas.length; i++){
			if(pessoas[i].getResposta().equals("SIM")){
				contadorSim++;
				if (pessoas[i].getSexo().equals("F")) contadorSimF++;
			}
		}
		if(op != 0) return contadorSimF;
		else return contadorSim;
	}
	
	public int pessoasNao (int op){
		int contadorNao=0;
		int contadorNaoM=0;
		int contadorM=0;
		for(int i = 0; i < pessoas.length; i++){
			if(pessoas[i].getResposta().equals("NAO")){
				contadorNao++;
				if(pessoas[i].getSexo().equals("M")) contadorNaoM++;
			}
			if (pessoas[i].getSexo().equals("M")) contadorM++;
		}
		contadorNaoM = (contadorNaoM*100)/contadorM; 
		if (op != 0) return contadorNaoM;
		else return contadorNao;
	}
	
	
}
	
