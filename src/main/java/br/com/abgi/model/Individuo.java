package br.com.abgi.model;

import java.util.Random;

import br.com.abgi.enums.EnumConfiguracao;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode
public class Individuo {

	private int[] probabilidadeDeCooperacao; // genoma para a probabilidade de cooperação
	private float valorDoGenoma; // valor do genoma
	private int fitness;// Aptidão do indivíduo

	public Individuo() {
		probabilidadeDeCooperacao = new int[EnumConfiguracao.TAMANHO_CROMOSSOMO.getTamanho()];
		iniciarProbabilidadeDeCooperacao();
	}

	private void iniciarProbabilidadeDeCooperacao() {

		int tamanhoCromossomo = EnumConfiguracao.TAMANHO_CROMOSSOMO.getTamanho();

		for (int posicaoCromossomo = 0; posicaoCromossomo < tamanhoCromossomo; posicaoCromossomo++) {

			getProbabilidadeDeCooperacao()[posicaoCromossomo] = new Random().nextInt(11) % 2;

		}
	}
}
