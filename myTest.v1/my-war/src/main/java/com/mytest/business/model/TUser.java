package com.mytest.business.model;

import java.io.Serializable;

public class TUser implements Serializable {
    private static final long serialVersionUID = 1L;

    private Integer id;

    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * java.lang.Object#toString()
     */
    public String toString() {
        return "TUser [ id=" + id + ",   name=" + name + " ] ";
    }
}