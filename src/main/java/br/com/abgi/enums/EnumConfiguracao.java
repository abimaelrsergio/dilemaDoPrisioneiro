package br.com.abgi.enums;

public enum EnumConfiguracao {

	TAMANHO_CROMOSSOMO(15),
	TAMANHO_DO_RETICULADO(10),
	TOTAL_ITERACOES(5000);

	private final int tamanho;

	EnumConfiguracao(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}
}
