package com.bankingApp.ServiceImpl;

import com.bankingApp.dto.TransactionDto;
import com.bankingApp.entity.Transaction;
import com.bankingApp.repository.TransactionRepository;
import com.bankingApp.service.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    TransactionRepository transactionRepository;
    @Override
    public void saveTransaction(TransactionDto transactionDto) {
Transaction transaction = Transaction.builder()
        .transactionType(transactionDto.getTransactionType())
        .accountNumber(transactionDto.getAccountNumber())
        .amount(transactionDto.getAmount())
        .status("SUCCESS")
        .build();
transactionRepository.save(transaction);
System.out.println("Transaction Saved Successfully");
    }
}
