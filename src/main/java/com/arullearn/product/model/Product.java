package com.arullearn.product.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Product {
    private Long id;
    
    @NotNull
    private String title;
    private boolean sold;
    
    public Product() {
    }
   
    public Product(Long id, String title, boolean sold) {
        this.id = id;
        this.title = title;
        this.sold = sold;
    }
    
    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public boolean isSold() {
        return sold;
    }
    public void setSold(boolean sold) {
        this.sold = sold;
    }

    
    
}
