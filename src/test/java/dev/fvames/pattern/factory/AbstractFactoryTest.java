package dev.fvames.pattern.factory;

import dev.fvames.pattern.factory.abstractFactory.*;

public class AbstractFactoryTest {

    public static void main(String[] args) {


        LanguageFactory javaFactory = new JavaFactory();
        javaFactory.createClass().createClass();
        javaFactory.createMethod().createMethod();

        LanguageFactory pythonFactory = new PythonFactory();
        pythonFactory.createClass().createClass();
        pythonFactory.createMethod().createMethod();


    }
}
