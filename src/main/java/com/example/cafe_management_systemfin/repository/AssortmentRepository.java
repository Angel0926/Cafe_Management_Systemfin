package com.example.cafe_management_systemfin.repository;

import com.example.cafe_management_systemfin.domain.entity.Assortment;
import com.example.cafe_management_systemfin.domain.enums.AssortmentType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AssortmentRepository extends JpaRepository<Assortment, Long> {
    Optional<Assortment> findByName(String name);
    List<Assortment> findAllByAssortmentType(AssortmentType assortmentType);

}
