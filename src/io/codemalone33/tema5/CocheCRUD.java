package io.codemalone33.tema5;

import java.util.List;

import io.codemalone33.app.Coche;

public interface CocheCRUD {
	
	public void save(Coche c);
	
	public List<Coche> findAll();
	
	public void delete(Coche c);

}
