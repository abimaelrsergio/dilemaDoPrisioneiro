package br.com.abgi.enums;

public enum EnumTamanhos {

	TAMANHO_CROMOSSOMO(15),
	TAMANHO_DO_RETICULADO(10);

	private final int tamanho;

	EnumTamanhos(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getTamanho() {
		return tamanho;
	}
}
