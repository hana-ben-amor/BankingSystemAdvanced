package com.hana.accounts.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class ErrorResponseDTO {
    // what is the api path that my client application is calling
    private String apiPath;
    private HttpStatus errorCode;
    private String errorMessage;
    private LocalDateTime errorTime;
}
