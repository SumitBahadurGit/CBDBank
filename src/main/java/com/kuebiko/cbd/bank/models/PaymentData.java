package com.kuebiko.cbd.bank.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentData {
    private String paymentId;
    private String type;
    private Float Amount;
}
