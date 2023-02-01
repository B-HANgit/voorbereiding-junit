package nl.han.ica.oose.dea.testedfizzbuzz;

public class FizzBuzzExecutor {

    public String execute(int i){
        String s = "";
        if (i % 3 == 0){ s += "Fizz";}
        if (i % 5 == 0){ s += "Buzz";}
        if (s.isEmpty()){
            s = Integer.toString(i);
        }
        return s;
    }
}
