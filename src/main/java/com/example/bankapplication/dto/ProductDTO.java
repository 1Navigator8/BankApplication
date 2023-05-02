package com.example.bankapplication.dto;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Value;

import java.sql.Timestamp;

@Value
public class ProductDTO {
    String id;
    String name;
    String status;
    String currencyCode;
    String interestRate;
    String productLimit;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp createdAt;
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
    Timestamp updatedAt;

}
