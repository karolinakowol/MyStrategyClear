/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mystrategy;

import data.DataGenerator;
import sort.methods.Bubblesort;
import sort.methods.Insertionsort;
import sort.methods.Quicksort;
import sort.methods.Selectionsort;

/**
 *
 * @author LeopardProMK
 */
public class Client {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        /* Algorytmy sortowania */
        // http://www.algorytm.org/algorytmy-sortowania/
        
        
        double[] dataNonSort = DataGenerator.generate(100000);
        double[] datacopy= dataNonSort.clone();
        
        /*Bubblesort.Sort(dataNonSort);
        Insertionsort.Sort(dataNonSort);
        Quicksort.Sort(dataNonSort, 0, 0);
        Selectionsort.Sort(dataNonSort); */
        
       /* Wzorzec Stratega */
        //...
        
        Context c = new Context(new Bubblesort());      
        System.out.println("Bubblesort Time:" + c.Sort(dataNonSort));
        
        Context c2 = new Context(new Insertionsort());
        dataNonSort = datacopy.clone();
        System.out.println("Insertionsort Time:" + c2.Sort(dataNonSort) );
             
        Context c3 = new Context(new Quicksort());
        dataNonSort= datacopy.clone();
        System.out.println("Quicksort Time:" + c3.Sort(dataNonSort) );
        
        Context c4 = new Context(new Selectionsort());
        dataNonSort= datacopy.clone();
        System.out.println("Selectionsort Time:" + c4.Sort(dataNonSort) );
        
    }
}
/* Odpowiedzi na pytania:

1. Proszę o podanie głównego celu zastosowania wzorca strategii:

Pozwala na tworzenie rodziny algorytmów umieszczonych w osobnych klasach, 
dając możliwość wymiany obiektów tych klas między nimi.

2. Czy istnieje możliwość zmiany algorytmu w czasie działania programu?

Tak, umożliwia to zastosowanie Strategii, jednak należałoby stworzyć odpowiednią metodę.

3. W jaki sposób wzorzec enkapsuluje poszczególne algorytmy?

W postaci klas, gdzie dane przekazywane są przez klasę Context i interfejs

4. Kiedy stosować wzorzec strategii?

Gdy możemy znaleźć różne rozwiązania dla różnych przypadków dla tego samego typu danych np. przy sortowaniu,
sprawdzanie który algorytm radzi sobie najlepiej w różnych przypadkach, ale na jednych danych.

*/