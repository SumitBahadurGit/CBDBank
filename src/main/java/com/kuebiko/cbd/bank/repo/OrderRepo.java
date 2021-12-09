package com.kuebiko.cbd.bank.repo;

import com.kuebiko.cbd.bank.entity.OrderEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<OrderEntity,Long> {
}
