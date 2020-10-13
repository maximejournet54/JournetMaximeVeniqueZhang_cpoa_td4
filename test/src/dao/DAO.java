package dao;

import java.util.ArrayList;

public interface DAO<T> {
	public abstract boolean create(Object T);
	public abstract boolean delete(Object T);
	public abstract boolean update(Object T);
	public abstract T getById(int id);
	public abstract ArrayList<T> findAll();
}
