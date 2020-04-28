package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesafioApplication {

	private static final int SERIE_FIB = 350;

	//método @Desafio("Fibonacci")
	public static List<Integer>fibonacci() {
		List<Integer> result = new ArrayList<>();
		int i = 1;
		result.add(0);
		result.add(1);

		while (i < SERIE_FIB) {
			i = generateFibo(result);
			result.add(i);
		}
		return result;
	}

	//@Desafio("isFibonnaci")
	public static Boolean isFibonacci(Integer number){
		return fibonacci().contains(number);
	}

	private static int generateFibo(List<Integer> result){
		return sumElement(result.get(result.size() -1), result.get(result.size() -2));
	}

	private static int sumElement(int after, int before){
		return Integer.sum(after, before);
	}

}

