package com.company.cc.account.service.dto;

import java.util.List;

public class AccountDTO {

    private Long id;

    private Long customerId;

    private long balance;

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

    public long getBalance() {
        return balance;
    }

    public AccountDTO setBalance(long balance) {
        this.balance = balance;
        return this;
    }

    public List<TransactionDTO> getTransactions() {
        return transactions;
    }

    public AccountDTO setTransactions(List<TransactionDTO> transactions) {
        this.transactions = transactions;
        return this;
    }
}
