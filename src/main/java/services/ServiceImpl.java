package services;

import dao.Dao;
import dao.DaoImpl;
import entity.Film;
import entity.Language;

import java.util.List;

public class ServiceImpl implements Service {

	private Dao dao = new DaoImpl();

	public boolean login(String name) {
		return dao.login(name);
	}

	public boolean insert(Film entity) {
		return dao.insert(entity);
	}

	public boolean delete(Film entity) {
		return dao.delete(entity);
	}


	public boolean update(Film entity) {
		return dao.update(entity);
	}

	@Override
	public List<Film> show() {
		return dao.show();
	}

	@Override
	public List<Language> languageShow() {
		return dao.languageShow();
	}

	@Override
	public Integer findIdByName(String name) {
		return dao.findIdByName(name);
	}
}
