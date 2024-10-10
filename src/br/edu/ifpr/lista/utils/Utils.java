package br.edu.ifpr.lista.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class Utils {
	public static String formatDate(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("d/MM/u"));
	}
	
	public static String formatCpf(String cpf) {
		return cpf.substring(0, 3) + "."
				+ cpf.substring(3, 6) + "."
				+ cpf.substring(6, 9) + "-"
				+ cpf.substring(9);
	}
	
	public static String formatCnpj(String cnpj) {
		return cnpj.substring(0, 2)  + "."
				 + cnpj.substring(2, 5)  + "."
				 + cnpj.substring(5, 8)  + "/"
				 + cnpj.substring(8, 12) + "-"
				 + cnpj.substring(12);
	}
	
	public static String formatCep(String cep) {
		return cep.substring(0, 5) + "-" + cep.substring(5);
	}
	
	public static boolean checkCpf(String cpf) {
		if(cpf.length() != 11) {
			return false;
		}
		
		for(Character c : cpf.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean checkCnpj(String cnpj) {
		if(cnpj.length() != 14) {
			return false;
		}
		
		for(Character c : cnpj.toCharArray()) {
			if(!Character.isDigit(c)) {
				return false;
			}
		}
		return true;
	}
}
