package com.chaikouski.ecology.repo;

import com.chaikouski.ecology.model.Associate;
import com.chaikouski.ecology.model.AutoExhausts;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AutoExhaustsRepo extends JpaRepository<AutoExhausts, Long> {

    List<AutoExhausts> findByAssociate(Associate associate);

}
