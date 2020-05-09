package br.com.abgi.model;

import br.com.abgi.enums.EnumTamanhos;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Individuo {
	
	private int[] probabilidadeDeCooperacao; // genoma para a probabilidade de cooperação
	private float valorDoGenoma;             // valor do genoma
	
	public Individuo() {
		probabilidadeDeCooperacao = new int[EnumTamanhos.TAMANHO_CROMOSSOMO.getTamanho()];
	}
}
