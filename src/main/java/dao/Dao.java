package dao;


import entity.Film;
import entity.Language;

import java.util.List;

public interface Dao {

    public boolean login(String name);

    public boolean insert(Film entity);

    public boolean delete(Film entity);

    public boolean update(Film entity);

    public List<Film> show();

    public List<Language> languageShow();

    public Integer findIdByName(String name);
	
}

