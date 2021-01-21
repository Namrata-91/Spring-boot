package com.librarybook.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.librarybook.model.LibraryModel;

@Repository
public interface LibraryRepo extends JpaRepository<LibraryModel, Integer> {
}
