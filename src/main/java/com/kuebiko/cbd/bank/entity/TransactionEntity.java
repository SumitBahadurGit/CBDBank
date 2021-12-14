package com.kuebiko.cbd.bank.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoice;

    @Column
    private Date transactionDate;

    @Column
    private Boolean isSuccessful;

    public Long getInvoice() {
        return invoice;
    }

    public void setInvoice(Long invoice) {
        this.invoice = invoice;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public Boolean getIsSuccessful() {
        return isSuccessful;
    }

    public void setIsSuccessful(Boolean isSuccessful) {
        this.isSuccessful = isSuccessful;
    }
}
