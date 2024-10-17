package br.edu.ifpr.lista.utils;

import java.util.Random;

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
	
	private static int getDv(int[] cpfArr, int dv) {
		int sum = 0;
		for(int i = 0; i < 8+dv; i++) {
			sum += cpfArr[i]*(9+dv-i);
		}
		
		if(sum % 11 < 2) {
			return 0;
		}

		return 11 - sum % 11;
	}
	
	public static boolean isValid(String cpf) {
		if(!checkFormat(cpf)) {
			return false;
		}
		
		int[] cpfArr = new int[11];
		
		for(int i = 0; i < 11; i++) {
			cpfArr[i] = Integer.valueOf(cpf.charAt(i)) - '0';
		}
		
		//dv1
		if(getDv(cpfArr, 1) != cpfArr[9]) {
			return false;
		}
		
		//dv2
		return getDv(cpfArr, 2) == cpfArr[10];
	}
	
	public static String generateCpf(Estado e) {
		int[] cpf = new int[11];
		
		Random rand = new Random();
		for(int i = 0; i < 8; i++) {
			cpf[i] = rand.nextInt(10);
		}
		cpf[8] = e.getNumero();
		cpf[9] = getDv(cpf, 1);
		cpf[10] = getDv(cpf, 2);
		
		String str = "";
		for(int c : cpf) {
			str += String.valueOf(c);
		}
		return str;
	}
}
