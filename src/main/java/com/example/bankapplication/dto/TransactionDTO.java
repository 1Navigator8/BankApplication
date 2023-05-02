package com.example.bankapplication.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.sql.Timestamp;

@Value
public class TransactionDTO {
    String id;
    String type;
    String amount;
    String description;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;

    String debitAccountId;
    String creditAccountId;

}
