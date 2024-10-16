package br.edu.ifpr.lista.aplicacao;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import br.edu.ifpr.lista.modelo.PessoaFisica;
import br.edu.ifpr.lista.modelo.PessoaJuridica;
import br.edu.ifpr.lista.modelo.persistencia.impl.PFPersistencia;
import br.edu.ifpr.lista.utils.CpfUtils;
import br.edu.ifpr.lista.utils.Estado;

public class Main {
	PFPersistencia persist;

	Main() {
		String cpf = CpfUtils.generateCpf(Estado.SP);
		persist = new PFPersistencia(List.of(
				new PessoaFisica("Gabriel Nicolas Caleb Pinto",
						LocalDate.of(1966,Month.MARCH,27),
						cpf,
						"Rua Ednaldo", 190, "Barro", "Rolandia", "12345678")));
		System.out.println("initialized: " + persist.select());


		persist.insert(new PessoaFisica("Novo Povo",
				LocalDate.of(1966,Month.MARCH,27),
				CpfUtils.generateCpf(Estado.PR),
				"Rua Ednaldo", 190, "Barro", "Rolandia", "12345678"));
		System.out.println("inserted: " + persist.select());

		System.out.println("selected cpf " + cpf + ": " + persist.select(cpf));


		persist.update(cpf, new PessoaFisica("Senhor atualizado",
				LocalDate.of(1966,Month.MARCH,27),
				CpfUtils.generateCpf(Estado.SP),
				"Rua Ednaldo", 190, "Barro", "Rolandia", "12345678"));
		System.out.println("updated: " + persist.select());

		System.out.println("deleted " + persist.delete() + ": " + persist.select());
	}

	public static void main(String[] args) {
		new Main();

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
