package br.edu.ifpr.lista.utils;

public class CnpjUtils {
	public static boolean checkFormat(String cnpj) {
		int length = cnpj.length();
		
		if(length != 14) {
			return false;
		}
		
		for(int i = 0; i < length; i++) {
			if(!Character.isDigit(cnpj.toCharArray()[i])) {
				return false;
			}
		}
		
		return true;
	}
}
