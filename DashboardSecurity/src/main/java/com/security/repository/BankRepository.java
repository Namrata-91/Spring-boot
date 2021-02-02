package com.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.security.model.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer>{

}
