package com.tinycompany.tinywheels.agencyapi.controllers;
import com.tinycompany.tinywheels.agencyapi.models.ClientAccount;
import com.tinycompany.tinywheels.agencyapi.repository.ClientAccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/ClientAccount")
public class ClientAccountController {



        @Autowired
        ClientAccountRepository clientAccountRepository;

        // Create operation
        @PostMapping
        public ResponseEntity<ClientAccount> createClientAccount(@RequestBody ClientAccount clientaccount) {
            ClientAccount savedclientaccount = clientAccountRepository.save(clientaccount);
            return new ResponseEntity<>(savedclientaccount, HttpStatus.CREATED);
        }

    // FindById
    @GetMapping("/{id}")
    public ResponseEntity<ClientAccount> getClientAccount(@PathVariable Long id) {
        Optional<ClientAccount> ClientAccount = clientAccountRepository.findById(id);
        if (ClientAccount.isPresent()) {
            return new ResponseEntity<>(ClientAccount.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // FindAll
    @GetMapping
    public ResponseEntity<List<ClientAccount>> getAllClientAccount(){
        List<ClientAccount> ClientAccount = clientAccountRepository.findAll();
        return ResponseEntity.ok(ClientAccount);
    }

    // Update operation
    @PutMapping("/{id}")
    public ResponseEntity<ClientAccount> updateclientaccount(@PathVariable Long id, @RequestBody ClientAccount ClientAccount) {
        Optional<ClientAccount> existingClientAccount = clientAccountRepository.findById(id);
        if (existingClientAccount.isPresent()) {
            ClientAccount.setId(Math.toIntExact(id));
            ClientAccount savedclientaccount = clientAccountRepository.save(ClientAccount);
            return new ResponseEntity<>(savedclientaccount, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete operation
    @DeleteMapping("/{id}")
    public ResponseEntity<ClientAccount> deleteclientaccount(@PathVariable Long id) {
        Optional<ClientAccount> clientaccount = clientAccountRepository.findById(id);
        if (clientaccount.isPresent()) {
            clientAccountRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    }

