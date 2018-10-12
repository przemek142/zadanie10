package zad10_1;

public class ObjectCreationExeption extends RuntimeException{
    public ObjectCreationExeption(String text){
        super("Error in object creation, check: " + text);

    }
}
