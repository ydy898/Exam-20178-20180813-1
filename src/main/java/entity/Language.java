package entity;

import java.io.Serializable;

/**
 * Created by Lusiliya on 2018/8/13.
 */
public class Language implements Serializable {
    private Integer language_id;
    private String language;

    public Integer getLanguage_id() {
        return language_id;
    }

    public void setLanguage_id(Integer language_id) {
        this.language_id = language_id;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
