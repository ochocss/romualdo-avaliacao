package br.edu.ifpr.lista.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.lista.modelo.PessoaJuridica;

public class PJPersistencia extends Persistencia<PessoaJuridica> {
	public PJPersistencia() { super(); }
	public PJPersistencia(List<PessoaJuridica> list) { 
		this.list = new ArrayList<>();
		list.forEach(this::insert);
	}
	
	@Override
	public boolean insert(PessoaJuridica obj) {
		if(!checkEquals(obj.getCnpj())) {
			list.add(obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean update(int index, PessoaJuridica obj) {
		if(!checkEquals(obj.getCnpj()) && index >= 0 && index < list.size()) {
			list.set(index, obj);
			return true;
		}
		return false;
	}
	
	public boolean delete(String cpf) {
		for(PessoaJuridica p : list) {
			if(p.getCnpj().equals(cpf)) {
				list.remove(p);
				return true;
			}
		}
		return false;
	}

	public PessoaJuridica select(String cpf) {
		for(PessoaJuridica p : list) {
			if(p.getCnpj().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
	
	private boolean checkEquals(String cpf) {
		for(PessoaJuridica p : list) {
			if(p.getCnpj().equals(cpf)) return true;
		}
		return false;
	}
}
