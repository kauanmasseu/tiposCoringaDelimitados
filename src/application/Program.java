package application;

import java.util.ArrayList;
import java.util.List;

public class Program {

    public static void main(String[] args) {

        List<Object> myObjs = new ArrayList<>();
        myObjs.add("Maria");
        myObjs.add("Alex");

        //Contravariancia, aceita adicionar elementos na lista mas não aceita acessar a lista.
        List<? super Number> myNums = myObjs;

        myNums.add(10);
        myNums.add(3.14);

        Number x = myNums.get(0);


    }
}
