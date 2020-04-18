import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.lang.management.BufferPoolMXBean;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.regex.Pattern;
import java.util.stream.*;

public class ExampleMethods {
    public static void main(String[] args) {
        //Strumien na podstawie kolekcji
        Stream<Integer> stream1 = new LinkedList<Integer>().stream();
        Stream<Integer> stream1a = Arrays.asList(1,2,3).stream();
        stream1a.forEach(System.out::print);
        //strumien na podstawie tablicy
        System.out.println("");
        Stream<Integer> stream2 = Arrays.stream(new Integer[]{1,2,3,4,5,6});
        stream2.forEach(System.out::print);
        System.out.println("");
        //strumien na podstawie lancucha znakow ktory jest rozdzielony z uzyciem Regex
        Stream<String> stream3 = Pattern.compile(" ").splitAsStream("some longer sentence");
        stream3.forEach(System.out::println);
        System.out.println("");
        //Strumienie typow prostych
        DoubleStream doubleStream = DoubleStream.of(1.0, 2.0, 3.0);
        IntStream intStream = IntStream.range(1, 200);
        LongStream longStream = LongStream.generate(() -> 1L); //tworzy stumien nieskonczonych danych
        doubleStream.forEach(System.out::print);
        System.out.println("");
        intStream.forEach(System.out::print); //wypisuje od 1 do 199
        System.out.println("");
        longStream.limit(5).forEach(System.out::print); //limit ogranicza ilość użytych elementów
        System.out.println("");

        //tworzenie strumieni danych losowych nieskonczonycj
        DoubleStream randomDoubles = new Random().doubles();
        IntStream randomInt = new Random().ints();
        LongStream randomLOng = new Random().longs();
        randomDoubles.limit(3).forEach(System.out::println); //limit ogranicza ilość użytych elementów
        System.out.println("");
        randomInt.limit(3).forEach(System.out::println); //limit ogranicza ilość użytych elementów
        System.out.println("");
        randomLOng.limit(3).forEach(System.out::println); //limit ogranicza ilość użytych elementów
        System.out.println("");
        //tworzyy strumien losowych intow i filtrujemy go zeby uzyskac liczby z danego zakresu
        new Random().ints()
                .filter(x->x<1000)
                .filter(x->x>0)
                .limit(3)
                .forEach(System.out::println);
        new Random().ints(5 ,10).limit(3).forEach(System.out::println);
//tworzymy strumien nieskonc
        DoubleStream randomNumbers = new Random().doubles();
        //pusty strumien nieskonczonych zmiennych losowych typu double
        List<Double> listOFRandomNumbers = randomNumbers
                .limit(10)//ograniczamy ilosc liczb do 10
                .map(x->x*2-1) //przemnażamy wszystkie liczby i odejmujemy od nich 1
        .filter(x->x<0)//wybieramy liczby tylko mniejsze od 1
        .boxed() //opakowanie typu
        .collect(Collectors.toList()); //zmieniamy na listę
        System.out.println(listOFRandomNumbers);

        Stream.empty();
        //Strumien danych z pliku
        try (Stream<String> lines = new BufferedReader(new FileReader("file.txt")).lines()) {
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}