package br.edu.ifpr.lista.modelo.persistencia.impl;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.lista.modelo.PessoaJuridica;
import br.edu.ifpr.lista.modelo.persistencia.Persistencia;

public class PJPersistencia implements Persistencia<PessoaJuridica, String> {
	protected List<PessoaJuridica> list;
	
	public PJPersistencia() {
		list = new ArrayList<>();
	}
	
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
	public boolean update(String cnpj, PessoaJuridica obj) {
		if(list.contains(obj)) {
			return false;
		}
		
		int length = list.size();
		for(int i = 0; i < length; i++) {
			PessoaJuridica pj = list.get(i);
			if(pj.getCnpj().equals(cnpj)) {
				list.set(i, obj);
				return true;
			}
		}
		
		return false;
	}
	
	@Override
	public boolean delete(String cpf) {
		for(PessoaJuridica p : list) {
			if(p.getCnpj().equals(cpf)) {
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
	public PessoaJuridica select(String cpf) {
		for(PessoaJuridica p : list) {
			if(p.getCnpj().equals(cpf)) {
				return p;
			}
		}
		return null;
	}
	
	@Override
	public List<PessoaJuridica> select() {
		return new ArrayList<PessoaJuridica>(list);
	}
	
	private boolean checkEquals(String cpf) {
		for(PessoaJuridica p : list) {
			if(p.getCnpj().equals(cpf)) return true;
		}
		return false;
	}
}
