package com.kuebiko.cbd.bank.repo;

import com.kuebiko.cbd.bank.entity.PaymentEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepo extends JpaRepository<PaymentEntity,Long> {
}
