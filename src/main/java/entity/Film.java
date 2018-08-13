package entity;

import java.io.Serializable;

public class Film implements Serializable{
 private static final long serialVersionUID = 1L;
 private Integer film_id;
 private String title;
 private String description;
 private String language;
 public Film() {
     super();
 }

    public Film(String title, String description, String language) {
        this.title = title;
        this.description = description;
        this.language = language;
    }

    public Film(Integer film_id, String title, String description, String language) {
        this.film_id = film_id;
        this.title = title;
        this.description = description;
        this.language = language;
    }

    public Integer getFilm_id() {
        return film_id;
    }

    public void setFilm_id(Integer film_id) {
        this.film_id = film_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "Film{" +
                "film_id=" + film_id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", language='" + language + '\'' +
                '}';
    }
}

