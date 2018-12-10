package com.adonayg.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.adonayg.domain.Cv;

@Repository
public interface CvRepository extends JpaRepository<Cv, Long> {

}
