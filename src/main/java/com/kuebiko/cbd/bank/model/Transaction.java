package com.kuebiko.cbd.bank.model;

import java.util.Date;

public class Transaction {
    private Long invoice;
    private Date date;
    private Boolean successful;

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
        return successful;
    }

    public void setSuccessful(Boolean successful) {
        this.successful = successful;
    }
}
