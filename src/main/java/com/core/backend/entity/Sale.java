package com.core.backend.entity;

import com.core.backend.entity.Customer;
import com.core.backend.entity.Product;
import com.core.backend.entity.User;
import com.core.backend.entity.Payment;
import com.core.components.list.ListModule;
import com.core.components.list.isFieldList;
import com.core.custom.FormPgto;
import com.core.custom.StatusSale;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @isFieldList(isVisible = ListModule.ALL, label = "Valor", order = 1)
    private Float totalValue;
    @isFieldList(isVisible = ListModule.ALL, label = "Data", order = 0)
    private Date date;
    private String description;
    private String installments;

    @ManyToOne
    @isFieldList(isVisible = ListModule.ALL, label = "Cliente", order = 2)
    private Customer customer;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="sales_has_products", joinColumns=
    @JoinColumn(name="sale_id"), inverseJoinColumns=
    @JoinColumn(name="product_id"))
    private List<Product> products;

    @ManyToOne
    private User seller;

    @Enumerated(EnumType.ORDINAL)
    private StatusSale status;

    @Enumerated(EnumType.ORDINAL)
    private FormPgto formPgto;

    @OneToMany
    private List<Payment> payments;

    public Sale() {
    }

    public Sale(Float totalValue, Date date, String description, String installments, Customer customer, List<Product> products, User seller, StatusSale status) {
        this.totalValue = totalValue;
        this.date = date;
        this.description = description;
        this.installments = installments;
        this.customer = customer;
        this.products = products;
        this.seller = seller;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Float getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(Float totalValue) {
        this.totalValue = totalValue;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInstallments() {
        return installments;
    }

    public void setInstallments(String installments) {
        this.installments = installments;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    public User getSeller() {
        return seller;
    }

    public void setSeller(User seller) {
        this.seller = seller;
    }

    public StatusSale getStatus() {
        return status;
    }

    public void setStatus(StatusSale status) {
        this.status = status;
    }
}
