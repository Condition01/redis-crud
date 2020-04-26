//package br.com.training.redis.handlers;
//
//import org.springframework.http.HttpHeaders;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//import java.util.Collections;
//import java.util.List;
//
//@ControllerAdvice
//public class RestResponseEntityExceptionHandler
//        extends ResponseEntityExceptionHandler {
//
//    @ExceptionHandler({ NumberFormatException.class })
//    public final ResponseEntity<Object> handleExceptions(Exception ex, WebRequest request) {
//        HttpHeaders headers = new HttpHeaders();
//
//
//            HttpStatus status = HttpStatus.NOT_FOUND;
//            NumberFormatException numberFmEx = (NumberFormatException) ex;
//
//            return handleUserNotFoundException(numberFmEx, headers, status, request);
//
//    }
//
//    protected ResponseEntity<Object> handleUserNotFoundException(NumberFormatException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        List<String> errors = Collections.singletonList(ex.getMessage());
//        return ResponseEntity.badRequest().body(ex.getMessage());
//    }
//
//
//}