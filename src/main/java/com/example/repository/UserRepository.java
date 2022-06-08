package com.example.repository;

import com.example.domain.OneUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<OneUser, Long> {
    OneUser findByEmail(String email);

}
