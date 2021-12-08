package com.kuebiko.cbd.bank.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TransactionData {
    private Long invoice;  //same to orderNum from OrderData
    private String date;
    private boolean successful;

}
