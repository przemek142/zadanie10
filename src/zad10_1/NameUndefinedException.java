package zad10_1;

//wyjątek, który powinien być rzucony, jeśli
//ktoś przy próbie utworzenia obiektu Person przekaże do konstruktora imię
//lub nazwisko będące nullem lub mające mniej niż 2 znaki
public class NameUndefinedException extends Exception{
    public NameUndefinedException(String text){
        super("Name too short. Must be longer than 2. Error in " + text);
    }
}
