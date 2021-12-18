package com.hospital.demo.advice;

import java.util.NoSuchElementException;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MyControllerAdvice{
@ExceptionHandler(NullPointerException.class)
	public ResponseEntity<String> handleEmptyInput(NullPointerException nullpointerexception){
       
	return  new ResponseEntity<String>("Input field is Empty,Please look into it", HttpStatus.BAD_REQUEST);
}

@ExceptionHandler(NoSuchElementException.class)
public ResponseEntity<String> handleNoSuchElementException(NoSuchElementException elementException){
   
return  new ResponseEntity<String>("No such element is present,Please look into it", HttpStatus.BAD_REQUEST);

}
}