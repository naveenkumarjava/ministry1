package com.org.cts.repository;

import com.org.cts.model.Ministry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MinistryRepo extends JpaRepository<Ministry,Integer> {
}
