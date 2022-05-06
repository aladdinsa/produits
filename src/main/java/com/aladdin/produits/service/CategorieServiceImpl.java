package com.aladdin.produits.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aladdin.produits.entites.Categorie;
import com.aladdin.produits.repos.CategorieRepository;

@Service
public class CategorieServiceImpl implements CategorieService {
	@Autowired
	CategorieRepository categorieRepository;

	@Override
	public List<Categorie> getAllCategories() {
		return categorieRepository.findAll();
	}

}
