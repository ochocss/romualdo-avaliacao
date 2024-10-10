package br.edu.ifpr.lista.aplicacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import br.edu.ifpr.lista.modelo.PessoaFisica;
import br.edu.ifpr.lista.modelo.PessoaJuridica;
import br.edu.ifpr.lista.persistencia.PFPersistencia;

public class Main {
	public static void main(String[] args) {		
		PFPersistencia persist = new PFPersistencia(List.of(
				new PessoaFisica("Gabriel Nicolas Caleb Pinto",
                        LocalDate.of(1966,Month.MARCH,27),
                        "09918133016", 
                        "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678"), 
				new PessoaFisica("Gabriel Nicolas Caleb Pinto",
                        LocalDate.of(1966,Month.MARCH,27),
                        "09910433016", 
                        "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678"), 
				new PessoaFisica("Gabriel Nicolas Caleb Pinto",
                        LocalDate.of(1966,Month.MARCH,27),
                        "02910133016", 
                        "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678"), 
				new PessoaFisica("Gabriel Nicolas Caleb Pinto",
                        LocalDate.of(1966,Month.MARCH,27),
                        "09110133016", 
                        "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678"), 
				new PessoaFisica("Gabriel Nicolas Caleb Pinto",
                        LocalDate.of(1966,Month.MARCH,27),
                        "09910133016", 
                        "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678")));
		
		System.out.println(persist.select());
		
		
		List<PessoaJuridica> pjLista = List.of(
				new PessoaJuridica("Casas Pernambucanas",
                    	  LocalDate.of(1908,Month.SEPTEMBER,25),
                          "51181391000129",
                          "Arthur Lundgren Tecidos S.A.",
                          "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678"),
				new PessoaJuridica("Casas Pernambucanas",
                    	  LocalDate.of(1908,Month.SEPTEMBER,25),
                          "51181391000129",
                          "Arthur Lundgren Tecidos S.A.",
                          "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678"),
				new PessoaJuridica("Casas Pernambucanas",
                    	  LocalDate.of(1908,Month.SEPTEMBER,25),
                          "51181391000129",
                          "Arthur Lundgren Tecidos S.A.",
                          "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678"),
				new PessoaJuridica("Casas Pernambucanas",
                    	  LocalDate.of(1908,Month.SEPTEMBER,25),
                          "51181391000129",
                          "Arthur Lundgren Tecidos S.A.",
                          "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678"),
				new PessoaJuridica("Casas Pernambucanas",
                    	  LocalDate.of(1908,Month.SEPTEMBER,25),
                          "51181391000129",
                          "Arthur Lundgren Tecidos S.A.",
                          "Rua Ednaldo", 190, "Barro", "Rolandia", "12345678")
				);
	}
}
