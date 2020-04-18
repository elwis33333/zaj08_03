# Design patterns

    • Decorator:
        ◦ Bardzo często używany w java.io
        ◦ przykłady BufferedReader i BifferedWriter
    • Strategy
        ◦ Zastosowany w Collection.sort()
        ◦  poprzez implementację interfejsu Comparator dostarczamy rówżnych zachowań
    • Observator
        ◦ Java posiada własne pakiety java.util.Observer oraz  java.util.Observable
        ◦ wyspecjalizowana wersja zastosowana zostła w Swing, gdy używamy np.: ActionListener
    • Singleton
        ◦ java.lang.Runtime – przykład wykorzystania w Java
    • Factory
        ◦ Przykładem jest BorderFactory z pakietu Swing
        ◦ Klasy wraperów i metody valueOf()
    • Builder
        ◦ W Java mamy przykład: StringBuilder
    • AbstractFactory i Factory
        ◦ najlepszy przykład użycia w JDK: Java is DocumentBuilderFactory and DocumentBuilder javax.xml.parsers package