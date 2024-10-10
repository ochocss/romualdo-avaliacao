package br.edu.ifpr.lista.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public final class FormatUtils {
	public static String formatDate(LocalDate date) {
		return date.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
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
}
