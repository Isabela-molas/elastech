package org.example.aula1610;

public class TesteSingleton {
    private static TesteSingleton instancia; //variavel q vai receber um obj

    private TesteSingleton(){

    }

    public static TesteSingleton getInstancia(){
        if (instancia == null){
            instancia = new TesteSingleton();
        }
        return instancia;
    }



}
