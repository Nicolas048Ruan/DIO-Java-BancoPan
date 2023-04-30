package ApiRest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class EmployeeNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(EmployeeException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String employeeNotFpundHandler(EmployeeException ex) {
        final String message= ex.getMessage();
        return message;
    }    
}