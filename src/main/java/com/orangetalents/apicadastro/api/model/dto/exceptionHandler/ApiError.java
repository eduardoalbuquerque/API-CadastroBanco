package com.orangetalents.apicadastro.api.model.dto.exceptionHandler;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;
import java.util.List;

@Getter
public class ApiError {

    private LocalDateTime dateTime;
    private HttpStatus status;
    private String message;
    private List<String> errors;

    public ApiError(HttpStatus status,  List<String> errors) {
        super();
        this.dateTime = LocalDateTime.now();
        this.status = status;
        this.message = "Por favor verificar campos enviados";
        this.errors = errors;
    }

}
