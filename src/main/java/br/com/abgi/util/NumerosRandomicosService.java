package br.com.abgi.util;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class NumerosRandomicosService {

	/**
	 * Gerar randomicamente zero ou um com probabilidades iguais
	 * 
	 * @return
	 */
	public int gerarCom50() {

		return (int) (10 * Math.random()) & 1;
	}

	/**
	 * Gerar randomicamente o numero um com 75% de probabilidade e o zero com 25%
	 * 
	 * @return
	 */
	public int gerarCom75() {

		return gerarCom50() | gerarCom50();
	}

	public int gerar() {
		Random ran = new Random();
		return ran.nextInt(10) % 2;
	}
}
