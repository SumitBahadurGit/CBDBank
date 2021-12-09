package com.kuebiko.cbd.bank.service;

public interface BaseServiceIf<U,V> {

    void find(Long paymentId, Long userId);
    U save(V data);
}
