package br.com.abgi;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.abgi.enums.EnumTamanhos;
import br.com.abgi.model.Individuo;

@SpringBootApplication
public class DilemadoprisioneiroApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(DilemadoprisioneiroApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Executando...");
		
		int tamanhoReticulado = EnumTamanhos.TAMANHO_DO_RETICULADO.getTamanho();
		
		Individuo[][] matrizA = new Individuo[tamanhoReticulado][tamanhoReticulado];
		Individuo[][] matrizB = new Individuo[tamanhoReticulado][tamanhoReticulado];
		
		for(int linha = 0; linha < tamanhoReticulado; linha++) {
			for (int coluna = 0; coluna < tamanhoReticulado; coluna++) {
				System.out.print(" | " + coluna);
			}
			System.out.println();
		}
	}

}
