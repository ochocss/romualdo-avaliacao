package br.edu.ifpr.lista.modelo.persistencia.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.lista.modelo.PessoaFisica;
import br.edu.ifpr.lista.modelo.persistencia.Persistencia;

public class PFPersistencia implements Persistencia<PessoaFisica, String> {
	protected List<PessoaFisica> list;
	
	public PFPersistencia() { 
		this.list = new ArrayList<>();
	}
	
	public PFPersistencia(List<PessoaFisica> list) { 
		this.list = new ArrayList<>();
		list.forEach(this::insert);
	}
	
	@Override
	public boolean insert(PessoaFisica obj) {
		if(!checkAlreadyExists(obj.getCpf())) {
			list.add(obj);
			return true;
		}
		return false;
	}

	@Override
	public boolean update(String cpf, PessoaFisica obj) {
		if(list.contains(obj)) {
			return false;
		}
		
		int length = list.size();
		for(int i = 0; i < length; i++) {
			PessoaFisica pf = list.get(i);
			if(pf.getCpf().equals(cpf)) {
				list.set(i, obj);
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean delete(String cpf) {
		for(PessoaFisica p : list) {
			if(p.getCpf().equals(cpf)) {
				list.remove(p);
				return true;
			}
		}
		return false;
	}

	@Override
	public int delete() {
		int size = list.size();
		
		list.clear();
		
		return size;
	}
	
	@Override
	public PessoaFisica select(String cpf) {
		for(PessoaFisica p : list) {
			if(p.getCpf().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
	
	@Override
	public List<PessoaFisica> select() {
		return new ArrayList<PessoaFisica>(list);
	}
	
	private boolean checkAlreadyExists(String cpf) {
		for(PessoaFisica p : list) {
			if(p.getCpf().equals(cpf)) return true;
		}
		return false;
	}
}
