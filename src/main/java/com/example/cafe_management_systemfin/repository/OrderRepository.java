package com.example.cafe_management_systemfin.repository;

import com.example.cafe_management_systemfin.domain.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

    @Query("select o from Order o where o.dateTime = ?1")
    List<Order> findAllByDate(Date date);
}
