package com.chaikouski.ecology.repo;

import com.chaikouski.ecology.model.Associate;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssociateRepo extends JpaRepository<Associate, Long>{

    List<Associate> findByPosition(String position);

    List<Associate> findByLastName(String lastName);
}
