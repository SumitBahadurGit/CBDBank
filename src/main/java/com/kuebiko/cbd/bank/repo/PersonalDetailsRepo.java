package com.kuebiko.cbd.bank.repo;

import com.kuebiko.cbd.bank.entity.PersonalDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonalDetailsRepo extends JpaRepository<PersonalDetailsEntity,Long> {
}
