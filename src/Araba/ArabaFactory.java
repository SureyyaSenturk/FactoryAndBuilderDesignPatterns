package Araba;

public class ArabaFactory {
    public ArabaFactory(){

    }

    public static Araba createFactory(Class aClass) throws IllegalAccessException,InstantiationException{
        return (Araba) aClass.newInstance();
    }
}
