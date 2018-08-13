package entity;

import java.io.Serializable;

/**
 * Created by Lusiliya on 2018/8/13.
 */
public class Customer implements Serializable {

    private String first_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }
}
