package br.edu.ifpr.lista.modelo;

import java.time.LocalDate;
import java.util.Objects;

import br.edu.ifpr.lista.utils.FormatUtils;

public class PessoaFisica extends Pessoa {
	private String cpf;
	
	public PessoaFisica() {super();}
	public PessoaFisica(String nome, LocalDate nascimento, String cpf, String nomeDaRua, Integer numero, String bairro, String cidade, String cep) {
		super(nome, nascimento, nomeDaRua, numero, bairro, cidade, cep);
		this.cpf = cpf;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	@Override
	public String toString() {
		return "PessoaFisica [cpf=" + FormatUtils.formatCpf(cpf) + ", " + super.toString() + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof PessoaFisica that)) {
			return false;
		}

		if (!super.equals(o)) {
			return false;
		}

        return Objects.equals(cpf, that.cpf);
	}
}
