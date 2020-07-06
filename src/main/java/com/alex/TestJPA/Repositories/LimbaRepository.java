package com.alex.TestJPA.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.alex.TestJPA.Data.model.Limba;

@Component
public interface LimbaRepository extends JpaRepository<Limba, Long> {

}
