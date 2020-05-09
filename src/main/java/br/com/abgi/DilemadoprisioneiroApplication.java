package br.com.abgi;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.abgi.enums.EnumConfiguracao;
import br.com.abgi.model.Individuo;

@SpringBootApplication
public class DilemadoprisioneiroApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DilemadoprisioneiroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Executando...");

		int tamanhoReticulado = EnumConfiguracao.TAMANHO_DO_RETICULADO.getTamanho();

		Individuo[][] matrizA = new Individuo[tamanhoReticulado][tamanhoReticulado];
		Individuo[][] matrizB = new Individuo[tamanhoReticulado][tamanhoReticulado];

		// Percorre a linha da matriz
		for (int linha = 0; linha < tamanhoReticulado; linha++) {

			// Percorre a coluna da matriz
			for (int coluna = 0; coluna < tamanhoReticulado; coluna++) {

				Individuo individuo = new Individuo();
				matrizA[linha][coluna] = individuo;
				matrizB[linha][coluna] = individuo;
				System.out.print(" | " + Arrays.toString(matrizA[linha][coluna].getProbabilidadeDeCooperacao()));
			}
			System.out.println();
		}
	}

}
