package model.exceptions;

public class BusinessException extends RuntimeException {


    //Transforma o erro em string
    public BusinessException(String msg) {
        super(msg);
    }

}
