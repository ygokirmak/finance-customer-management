package com.company.cc.transaction.resource;


import com.company.cc.transaction.exceptions.EntityAlreadyExistsException;
import com.company.cc.transaction.exceptions.EntityNotFoundException;
import com.company.cc.transaction.service.TransactionService;
import com.company.cc.transaction.service.dto.TransactionDTO;
import com.company.cc.transaction.service.dto.TransactionSummaryDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
@RequestMapping("/api")
public class TransactionSummaryResource {

    private final Logger log = LoggerFactory.getLogger(TransactionSummaryResource.class);

    private final TransactionService transactionService;

    public TransactionSummaryResource(TransactionService transactionService) {
        this.transactionService = transactionService;
    }


    /**
     * GET  /transaction-summaries/:id : get summary for customer "id".
     *
     * @param id the id of the customer to retrieve summary
     * @return the ResponseEntity with status 200 (OK) and with body the TransactionSummaryDTO, or with status 404 (Not Found)
     */
    @GetMapping("/transaction-summaries/{id}")
    public ResponseEntity getCustomer(@PathVariable Long id) throws EntityNotFoundException {
        log.debug("REST request to get summary for customer : {}", id);
        TransactionSummaryDTO transactionSummaryDTO = transactionService.getSummaryByCustomerId(id);

        if( transactionSummaryDTO == null ){
            return new ResponseEntity(HttpStatus.NOT_FOUND);
        }else{
            return ResponseEntity.ok().body(transactionSummaryDTO);
        }
    }


}