package br.edu.ifpr.lista.persistencia;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.lista.modelo.PessoaFisica;

public abstract class Persistencia<T> {
	protected List<T> list;
	
	public Persistencia() {
		list = new ArrayList<>();
	}
	
	public Persistencia(List<T> list) {
		this.list = new ArrayList<>();
		list.forEach(this::insert);
	}
	
	public boolean insert(T obj) {
		if(!list.contains(obj)) {
			list.add(obj);
			return true;
		}
		return false;
	}
	
	public boolean update(int index, T obj) {
		if(index < 0 || index >= list.size()) {
			return false;
		}

		if(!obj.equals(list.get(index))) {
			list.set(index, obj);
			return true;
		}
		return false;
	}
	
	public int delete(T obj) {
		int size = list.size();
		
		list.clear();
		
		return size;
	}
	
	public List<T> select() {
		return new ArrayList<T>(list);
	}
}
