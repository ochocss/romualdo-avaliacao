package br.edu.ifpr.lista.modelo;

import java.time.LocalDate;
import java.util.Objects;

import br.edu.ifpr.lista.utils.FormatUtils;

public abstract class Pessoa {
	protected String nome;
	protected LocalDate nascimento;
	protected Endereco endereco;
	
	public Pessoa() {}
	public Pessoa(String nome, LocalDate nascimento, String nomeDaRua, Integer numero, String bairro, String cidade, String cep) {
		this.nome = nome;
		this.nascimento = nascimento;
		this.endereco = new Endereco(nomeDaRua, numero, bairro, cidade, cep);
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	public LocalDate getNascimento() {
		return nascimento;
	}
	
	public String getNome() {
		return nome;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	public void setNascimento(LocalDate nascimento) {
		this.nascimento = nascimento;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", nascimento=" + FormatUtils.formatDate(nascimento) + ", " + endereco +"]";
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}

		if (!(o instanceof Pessoa pessoa)) {
			return false;
		}

        return Objects.equals(nome, pessoa.nome) &&
				Objects.equals(nascimento, pessoa.nascimento) &&
				Objects.equals(endereco, pessoa.endereco);
	}
}
