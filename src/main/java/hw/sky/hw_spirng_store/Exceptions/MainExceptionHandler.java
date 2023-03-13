package hw.sky.hw_spirng_store.Exceptions;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class MainExceptionHandler {
    @ExceptionHandler(NumberFormatException.class)
    public String NumberFormatExceptionHandler(NumberFormatException e)
    {
        return "Ошибка: Неверно введенный символ";
    }

}
