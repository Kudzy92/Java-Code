package app.kudzy.service;

public interface FabonacciService< T extends Number > {
    <T extends Number >  String fabonacciSequenceCreator(T maxNumber);
}
