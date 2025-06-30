package com.bank.DTO;

import com.bank.Entities.Operation;
import jakarta.persistence.Column;
import lombok.Data;

@Data
public class OperationDTO {

    private int id;

    private String name;

    private Double moneyCount;

    public OperationDTO(Operation operation) {
        this.id = operation.getId();
        this.name = operation.getName();
        this.moneyCount = operation.getMoneyCount();
    }
}
