package com.company.cc.customer.service.dto;

import java.util.List;

public class AccountDTO {

    private Long id;

    private Long customerId;

    private double initialCredit;

    private List<TransactionDTO> transactions;


    public Long getId() {
        return id;
    }

    public AccountDTO setId(Long id) {
        this.id = id;
        return this;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public AccountDTO setCustomerId(Long customerId) {
        this.customerId = customerId;
        return this;
    }

    public List<TransactionDTO> getTransactions() {
        return transactions;
    }

    public AccountDTO setTransactions(List<TransactionDTO> transactions) {
        this.transactions = transactions;
        return this;
    }

    public double getInitialCredit() {
        return initialCredit;
    }

    public AccountDTO setInitialCredit(double initialCredit) {
        this.initialCredit = initialCredit;
        return this;
    }
}
