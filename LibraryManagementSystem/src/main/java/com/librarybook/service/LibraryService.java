package com.librarybook.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.librarybook.model.LibraryModel;
import com.librarybook.repository.LibraryRepo;

@Service
@Transactional
public class LibraryService {

	
	@Autowired
	LibraryRepo repo;
	
	public List<LibraryModel> listAll() {
		return repo.findAll();
	}

	public void save(LibraryModel libraryModel) {
		repo.save(libraryModel);
	}

	public LibraryModel get(int id) {
		return repo.findById(id).get();
	}

	public void delete(int id) {
		repo.deleteById(id);
	}
}
