package com.kuebiko.cbd.bank.model;
import java.util.Date;

public class Transaction {

    private Long invoice;  //same to orderNum from OrderData
    private Date date;
    private boolean successful;

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

    public boolean isSuccessful() {
        return successful;
    }

    public void setSuccessful(boolean successful) {
        this.successful = successful;
    }
}
