package br.com.abgi;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.abgi.enums.EnumTamanhos;
import br.com.abgi.model.Individuo;
import br.com.abgi.util.NumerosRandomicosService;

@SpringBootApplication
public class DilemadoprisioneiroApplication implements CommandLineRunner {

	@Autowired
	private NumerosRandomicosService numerosRandomicosService;

	public static void main(String[] args) {
		SpringApplication.run(DilemadoprisioneiroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Executando...");

		int tamanhoCromossomo = EnumTamanhos.TAMANHO_CROMOSSOMO.getTamanho();
		int tamanhoReticulado = EnumTamanhos.TAMANHO_DO_RETICULADO.getTamanho();

		Individuo[][] matrizA = new Individuo[tamanhoReticulado][tamanhoReticulado];
		Individuo[][] matrizB = new Individuo[tamanhoReticulado][tamanhoReticulado];

		// Percorre a linha da matriz
		for (int linha = 0; linha < tamanhoReticulado; linha++) {

			// Percorre a coluna da matriz
			for (int coluna = 0; coluna < tamanhoReticulado; coluna++) {

				Individuo individuo = new Individuo();

				// copleta o cromossomo do indivíduo aleatóriamente
				for (int posicaoCromossomo = 0; posicaoCromossomo < tamanhoCromossomo; posicaoCromossomo++) {

					int[] probabilidadeDeCooperacao = individuo.getProbabilidadeDeCooperacao();
					probabilidadeDeCooperacao[posicaoCromossomo] = numerosRandomicosService.gerarCom75();
				}

				matrizA[linha][coluna] = individuo;
				matrizB[linha][coluna] = individuo;
				System.out.print(" | " + Arrays.toString(matrizA[linha][coluna].getProbabilidadeDeCooperacao()));
			}
			System.out.println();
		}
	}

}
