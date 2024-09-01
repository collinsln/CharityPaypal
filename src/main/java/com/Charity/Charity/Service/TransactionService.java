//package com.Charity.Charity.Service;
//
//import com.Charity.Charity.Model.Transactions;
//import com.Charity.Charity.Repository.TransactionRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//import java.util.Optional;
//
//@Service
//public class TransactionService {
//    @Autowired
//    private TransactionRepository transactionRepository;
//
//    public List<Transactions>getAllTransactions(){
//        return transactionRepository.findAll();
//    }
//    public Optional<Transactions>getTransactionById(Long id){
//        return transactionRepository.findById(id);
//    }
//
//    public Transactions createTransactions(Transactions transactions){
//        return transactionRepository.save(transactions);
//    }
//
//    public Transactions updateTransactions (Transactions transactions){
//        return transactionRepository.save(transactions);
//    }
//
//    public void deleteTransaction(Long id){
//       transactionRepository.deleteById(id);
//    }
//}
