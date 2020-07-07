package com.alex.TestJPA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alex.TestJPA.Models.model.Limba;
import com.alex.TestJPA.Models.model.Termen;

public interface TermenRepository extends JpaRepository<Termen, Long> {

}
