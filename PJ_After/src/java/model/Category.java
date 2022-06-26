/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Lehait
 */
public class Category {
    private int idcat;
    private String namecat;
    private String describe;

    public Category() {
    }

    public Category(int idcat, String namecat, String describe) {
        this.idcat = idcat;
        this.namecat = namecat;
        this.describe = describe;
    }

    public int getIdcat() {
        return idcat;
    }

    public void setIdcat(int idcat) {
        this.idcat = idcat;
    }

    public String getNamecat() {
        return namecat;
    }

    public void setNamecat(String namecat) {
        this.namecat = namecat;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    
       
}
