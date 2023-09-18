package com.bankingApp.service;

import com.bankingApp.dto.TransactionDto;
import com.bankingApp.entity.Transaction;

public interface TransactionService {
    void saveTransaction(TransactionDto transactionDto);
}
