package com.thinkitive.springbootjpadata.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(
        name = "products",
        schema = "ecommerce"
)
public class Product1 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "product_name")
    private String name;
    @Column(name = "product_desc")
    private String desciption;
    @Column(name = "product_price")
    private BigDecimal price;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
