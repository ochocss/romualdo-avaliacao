package br.edu.ifpr.lista.utils;

public final class CpfUtils {
	public static boolean checkFormat(String cpf) {
		int length = cpf.length();
		
		if(length != 11) {
			return false;
		}
		
		for(int i = 0; i < length; i++) {
			if(!Character.isDigit(cpf.toCharArray()[i])) {
				return false;
			}
		}
		
		return true;
	}
	
	public static boolean isValid(String cpf) {
		if(!isValid(cpf)) {
			return false;
		}
		
		int[] cpfArr = new int[11];
		
		for(int i = 0; i < 11; i++) {
			cpfArr[i] = Integer.valueOf(cpf.substring(i, i));
		}
		
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			sum += cpfArr[i]*10-i;
		}
		// TODO resto
		if(sum*10/11 != cpfArr[9]) {
			return false;
		}
		
		//parte 2
		sum = 0;
		for(int i = 0; i < 9; i++) {
			sum += cpfArr[i]*11-i;
		}
		
		return sum == cpfArr[10];
	}
}
