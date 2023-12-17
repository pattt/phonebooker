package com.phonebooker;

import com.phonebooker.openapi.model.Error;
import org.postgresql.util.PSQLException;
import org.springdoc.api.OpenApiResourceNotFoundException;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ErrorController extends ResponseEntityExceptionHandler {

    @ExceptionHandler({PSQLException.class, OpenApiResourceNotFoundException.class, DataIntegrityViolationException.class})
    @ResponseStatus(value = HttpStatus.NOT_FOUND)
    public Error resourceNotFoundException(Exception ex) {
        Error message = new Error(HttpStatus.NOT_FOUND.value(), "Resource not found");
        return message;
    }
}
