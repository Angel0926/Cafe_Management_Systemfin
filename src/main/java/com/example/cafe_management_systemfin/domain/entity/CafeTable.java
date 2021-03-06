package com.example.cafe_management_systemfin.domain.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "cafe_table")
public class CafeTable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "table_name", unique = true, nullable = false)
    private String tableName;

    @Column(name = "reserve", nullable = false)
    private boolean reserve;

    @JsonManagedReference
    @OneToMany(
            mappedBy = "cafeTable",
            fetch = FetchType.LAZY,
            cascade = CascadeType.PERSIST,
            orphanRemoval = true
    )
    private List<Order> orders;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;


    public CafeTable() {

    }

    public CafeTable(Long id, String tableName, boolean reserve, List<Order> orders, User user) {
        this.id = id;
        this.tableName = tableName;
        this.reserve = reserve;
        this.orders = orders;
        this.user = user;
    }

    public CafeTable(Long id, String tableName, boolean reserve) {
        this.id = id;
        this.tableName = tableName;
        this.reserve = reserve;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTableName() {
        return tableName;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public boolean isReserve() {
        return reserve;
    }

    public void setReserve(boolean reserve) {
        this.reserve = reserve;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CafeTable cafeTable = (CafeTable) o;
        return reserve == cafeTable.reserve && Objects.equals(id, cafeTable.id) && Objects.equals(tableName, cafeTable.tableName) && Objects.equals(orders, cafeTable.orders) && Objects.equals(user, cafeTable.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tableName, reserve, orders, user);
    }

    @Override
    public String toString() {
        return "CafeTable{" +
                "id=" + id +
                ", tableName='" + tableName + '\'' +
                ", reserve=" + reserve +
                ", orders=" + orders +
                ", user=" + user +
                '}';
    }
}
