package br.edu.ifpr.lista.modelo;

import java.time.LocalDate;
import java.util.Objects;

import br.edu.ifpr.lista.utils.Utils;

public class PessoaJuridica extends Pessoa {
	private String nomeFantasia;
	private String cnpj;

	public PessoaJuridica() {super();}
	public PessoaJuridica(String nome, LocalDate nascimento, String cnpj, String nomeFantasia, String nomeDaRua, Integer numero, String bairro, String cidade, String cep) {
		super(nome, nascimento, nomeDaRua, numero, bairro, cidade, cep);
		this.nomeFantasia = nomeFantasia;
		this.cnpj = cnpj;
	}
	
	public String getCnpj() {
		return cnpj;
	}
	
	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	public String getNomeFantasia() {
		return nomeFantasia;
	}
	
	public void setNomeFantasia(String nomeFantasia) {
		this.nomeFantasia = nomeFantasia;
	}
	
	@Override
	public String toString() {
		return "PessoaJuridica [nomeFantasia=" + nomeFantasia + ", cnpj="
			   + Utils.formatCnpj(cnpj) + ", " + super.toString() + "]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof PessoaJuridica that)) {
			return false;
		}

		if (!super.equals(o)) {
			return false;
		}

        return Objects.equals(nomeFantasia, that.nomeFantasia) && Objects.equals(cnpj, that.cnpj);
	}
}
