package com.example.loginpagehw.impl;

import com.example.loginpagehw.Dto.LoginEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ILoginRepo extends JpaRepository<LoginEntity, Long> {
}
