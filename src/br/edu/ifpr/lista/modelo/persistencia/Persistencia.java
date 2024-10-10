package br.edu.ifpr.lista.modelo.persistencia;

import java.util.List;

public interface Persistencia<T, K> {
	public boolean insert(T t);
	public boolean update(K k, T t);
	public boolean delete(K k);
	public int delete();
	public T select(K k);
	public List<T> select();
}
