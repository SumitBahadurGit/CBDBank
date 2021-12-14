package com.kuebiko.cbd.bank.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
public class TransactionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long invoice;

    @Column
    private Date date;

    @Column
    private Boolean isSuccessful;

    public Long getInvoice() {
        return invoice;
    }

    public void setInvoice(Long invoice) {
        this.invoice = invoice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getSuccessful() {
        return isSuccessful;
    }

    public void setSuccessful(Boolean successful) {
        this.isSuccessful = successful;
    }
}
