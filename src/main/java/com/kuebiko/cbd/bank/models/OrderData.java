package com.kuebiko.cbd.bank.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OrderData {
    private Long orderNum;
    private String product ;
    private String quantity;
    private String orderId;  //same as id in personal details model
    private String date;
    private String price;
    private Float sales;
    private  Float tax;
}
