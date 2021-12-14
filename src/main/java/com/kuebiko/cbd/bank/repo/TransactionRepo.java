package com.kuebiko.cbd.bank.repo;

import com.kuebiko.cbd.bank.entity.TransactionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepo extends JpaRepository<TransactionEntity, Long> {
}
