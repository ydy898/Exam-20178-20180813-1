package dao;

import entity.Film;
import entity.Language;
import util.DBManger;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DaoImpl implements Dao {
	public boolean login(String name) {
		boolean flag = false;
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			con = DBManger.getConnection();
			String sql = "select * from customer where first_name = ? ";
			ps = con.prepareStatement(sql);
			ps.setString(1,name);
			rs = ps.executeQuery();
			if(rs.next()){
				flag = true;
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			DBManger.dbClose(rs, ps, con);
		}
		return flag;
	}

	public boolean insert(Film entity) {
		boolean flag = false;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBManger.getConnection();
			String sql = "insert into film(title,description,language_id) values (?,?,?)";
			ps = con.prepareStatement(sql);
			int index = 1;
			ps.setString(index++, entity.getTitle());
			ps.setString(index++, entity.getDescription());

			Integer id = findIdByName(entity.getLanguage());
			ps.setString(index++, id.toString());
			int n = ps.executeUpdate();
			if (n > 0) {
				flag = true;
			}
			DBManger.dbClose1(ps, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean delete(Film entity) {
		boolean flag = false;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBManger.getConnection();
			Integer id = entity.getFilm_id();
			String sql = "delete from film where film_id=?";
			ps = con.prepareStatement(sql);
			ps.setString(1, id.toString());
			int n = ps.executeUpdate();
			if (n > 0) {
				flag = true;
			}
			DBManger.dbClose1(ps, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	public boolean update(Film entity) {
		boolean flag = false;
		Connection con = null;
		PreparedStatement ps = null;
		try {
			con = DBManger.getConnection();
			String sql = "update film set title =?,description =?,language_id =(select language_id from language where name=?) where film_id =?";
			ps = con.prepareStatement(sql);
			ps.setString(1, entity.getTitle());
			ps.setString(2, entity.getDescription());
			ps.setString(3, entity.getLanguage());
			ps.setInt(4, entity.getFilm_id());

			int n = ps.executeUpdate();
			if (n > 0) {
				flag = true;
			}
			DBManger.dbClose1(ps, con);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return flag;
	}

	@Override
	public List<Film> show() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Film film = null;
		List<Film> list = null;
		try {
			con = DBManger.getConnection();
			String sql = "select f.film_id,f.title,f.description,l.name from film f,language l where f.language_id=l.language_id";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			film = new Film();
			list = new ArrayList<Film>();
			while(rs.next()){
				film = new Film();
				film.setFilm_id(rs.getInt("film_id"));
				film.setTitle(rs.getString("title"));
				film.setDescription(rs.getString("description"));
				film.setLanguage(rs.getString("name"));
				list.add(film);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
//		for(int i=0;i<list.size();i++){
//			System.out.println(list.get(i));
//		}
		return list;
	}

	@Override
	public List<Language> languageShow() {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Language language = null;
		List<Language> list = null;
		try {
			con = DBManger.getConnection();
			String sql = "select language_id,name from language";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			language = new Language();
			list = new ArrayList<Language>();
			while(rs.next()){
				language = new Language();
				language.setLanguage_id(rs.getInt("language_id"));
				language.setLanguage(rs.getString("name"));
				list.add(language);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	@Override
	public Integer findIdByName(String name) {
		Connection con = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		Language language = null;
		try {
			con = DBManger.getConnection();
			String sql = "select language_id from language where name=?";
			ps = con.prepareStatement(sql);
			ps.setString(1,name);
			rs = ps.executeQuery();
			if(rs.next()){
				language = new Language();
				language.setLanguage_id(rs.getInt("language_id"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return language.getLanguage_id();
	}

}
