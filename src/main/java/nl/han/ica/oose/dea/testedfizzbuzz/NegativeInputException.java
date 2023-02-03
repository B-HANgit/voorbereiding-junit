package nl.han.ica.oose.dea.testedfizzbuzz;

import java.util.concurrent.ExecutionException;

public class NegativeInputException extends RuntimeException {

    public NegativeInputException (String msg){
        super(msg);
    }

}
