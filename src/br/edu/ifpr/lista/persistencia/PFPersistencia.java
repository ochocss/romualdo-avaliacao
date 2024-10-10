package br.edu.ifpr.lista.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.lista.modelo.PessoaFisica;

public class PFPersistencia extends Persistencia<PessoaFisica> {	
	public PFPersistencia() { super(); }
	public PFPersistencia(List<PessoaFisica> list) { 
		this.list = new ArrayList<>();
		list.forEach(this::insert);
	}
	
	@Override
	public boolean insert(PessoaFisica obj) {
		if(!checkEquals(obj.getCpf())) {
			list.add(obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean update(int index, PessoaFisica obj) {
		if(!checkEquals(obj.getCpf()) && index >= 0 && index < list.size()) {
			list.set(index, obj);
			return true;
		}
		return false;
	}
	
	public boolean delete(String cpf) {
		for(PessoaFisica p : list) {
			if(p.getCpf().equals(cpf)) {
				list.remove(p);
				return true;
			}
		}
		return false;
	}

	public PessoaFisica select(String cpf) {
		for(PessoaFisica p : list) {
			if(p.getCpf().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
	
	private boolean checkEquals(String cpf) {
		for(PessoaFisica p : list) {
			if(p.getCpf().equals(cpf)) return true;
		}
		return false;
	}
}
