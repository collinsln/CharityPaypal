//package com.Charity.Charity.Controller;
//
//import com.Charity.Charity.Model.Transactions;
//import com.Charity.Charity.Service.TransactionService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//import java.util.Optional;
//
//@RestController
//@RequestMapping("/api/transactions")
//public class TransactionController {
//
//    @Autowired
//    private TransactionService transactionService;
//
//    @GetMapping
//    public ResponseEntity<List<Transactions>> getAllTransactions() {
//        List<Transactions> transactions = transactionService.getAllTransactions();
//        return new ResponseEntity<>(transactions, HttpStatus.OK);
//    }
//
//    @GetMapping("/{id}")
//    public ResponseEntity<Transactions> getTransactionById(@PathVariable("id") Long id) {
//        Optional<Transactions> transaction = transactionService.getTransactionById(id);
//        return transaction.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//    }
//
//    @PostMapping("/add")
//    public ResponseEntity<Transactions> createTransaction(@RequestBody Transactions transaction) {
//        try {
//            Transactions createdTransaction = transactionService.createTransactions(transaction);
//            return new ResponseEntity<>(createdTransaction, HttpStatus.CREATED);
//        } catch (Exception e) {
//            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//        }
//    }
//
//    @PutMapping("/update/{id}")
//    public ResponseEntity<Transactions> updateTransaction(@PathVariable("id") Long id, @RequestBody Transactions transaction) {
//        if (!transactionService.getTransactionById(id).isPresent()) {
//            return ResponseEntity.notFound().build();
//        }
//        transaction.setTransactionId(id);
//        Transactions updatedTransaction = transactionService.updateTransactions(transaction);
//        return new ResponseEntity<>(updatedTransaction, HttpStatus.OK);
//    }
//
//    @DeleteMapping("/delete/{id}")
//    public ResponseEntity<Void> deleteTransaction(@PathVariable("id") Long id) {
//        if (!transactionService.getTransactionById(id).isPresent()) {
//            return ResponseEntity.notFound().build();
//        }
//        transactionService.deleteTransaction(id);
//        return ResponseEntity.noContent().build();
//    }
//}
