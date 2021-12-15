package com.kuebiko.cbd.bank.dao;

public interface DaoIf<U> {

    U save(U payment);
    U find(Long id);
    U find(Long id, Long userId);

}
