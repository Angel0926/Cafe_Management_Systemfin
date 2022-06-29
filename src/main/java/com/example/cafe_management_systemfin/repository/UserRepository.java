package com.example.cafe_management_systemfin.repository;

import com.example.cafe_management_systemfin.domain.entity.User;
import com.example.cafe_management_systemfin.domain.enums.RoleType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    @Query("select u from User u where u.username = ?1")
    Optional<User> findByUsername(String username);

    List<User> findAllByRoleType(RoleType roleType);
}

