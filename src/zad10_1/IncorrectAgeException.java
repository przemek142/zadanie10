package zad10_1;


//wyjątek, który powinien być rzucony, jeśli ktoś
//        przy próbie utworzenia obiektu Person przekaże do konstruktora wiek mniejszy niż 1
//        Zmień typ wyjątków na kontrolowane i napraw błędy, które potencjalnie pojawiły
//        się w projekcie. Obsłuż wyjątki jeśli to możliwe.
public class IncorrectAgeException extends RuntimeException{
    public IncorrectAgeException(){
        super("Incorect age. Age must me higher or equal 1");
    }
}
