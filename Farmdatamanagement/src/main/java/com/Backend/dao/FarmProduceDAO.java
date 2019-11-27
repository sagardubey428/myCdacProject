package com.Backend.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Backend.model.Farmproduce;



public interface FarmProduceDAO extends JpaRepository<Farmproduce, Integer> {

}
