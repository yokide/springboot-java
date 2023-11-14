package com.example.demo.web;


////import org.springframework.http.HttpMethod;
//import org.springframework.web.bind.annotation.GetMapping;
////import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.*;

import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//import org.springframework.http.HttpStatus;
//import javax.servlet.http.HttpServletRequest;


@RestController
public class HelloWorldController {
    @GetMapping(value = "/hello")
    public String giveyousomecolortosee1see(@RequestParam(defaultValue = "JAVA") String name){
        return "hello " + name + "!";
    }
}


//@RestControllerAdvice
//public class CustomExceptionHandler extends ResponseEntityExceptionHandler {
//    @ExceptionHandler(value = { NoHandlerFoundException.class })
//    protected ResponseEntity<Object> handleNotFound(NoHandlerFoundException ex, HttpHeaders headers, HttpStatus status, WebRequest request) {
//        // 返回自定义的404错误页面或数据
//        String errorMessage = "Page not found";
//        return new ResponseEntity<>(errorMessage, HttpStatus.NOT_FOUND);
//    }
//}