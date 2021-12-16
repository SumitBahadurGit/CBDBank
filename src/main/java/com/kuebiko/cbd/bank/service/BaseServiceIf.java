package com.kuebiko.cbd.bank.service;

public interface BaseServiceIf<U,V> {

    U find(Long paymentId, Long userId);
    U save(V data) throws Exception;
    U find(Long userId);
}
