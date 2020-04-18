import java.util.Arrays;
import java.util.List;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ExampleOfStream {
    public static void main(String[] args) {
        System.out.println("Sequential");
        IntStream.range(1, 10).forEach(System.out::println);
        System.out.println("Parallel");
        IntStream.range(1, 10)
                .parallel()
                .forEach(System.out::println);
//przykład 1
        //tworzymy strumien danych od 1 do 9 - dodajemy do nich 100 - wyswietlamy
IntStream.range(1,10).parallel()
        .map(x->x+100)
        .sequential() //jak to zakomentujesz to wyświetlanie będzie niesekwencyjne
        .forEach(System.out::println);
    //przykład 2
        List<Integer> results = IntStream.range(1,10)
                .parallel()
                .map(x->x+100)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(results);
        //stworzmy klase anonimowa z metoda rekurencyjna do silni
        //strumien intow od 1 do 30
        //obliczamy silnie ruwnolegle i sekwencyjnie
        //zamieniamy na liste
        // wyswietlamy wynik
        UnaryOperator<Integer> factorial = new UnaryOperator<Integer>(){
            @Override
                    public Integer apply(Integer n){
                if(n<=2) return n;
                else return n*apply(n-1);
            }
        };
        List<Integer> factorialResults = IntStream.range(1,20)
                //.parallel()
                .map(factorial::apply)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(factorialResults);
        //stworzmy klase anonimowa z metoda rekurencyjna do obliczania liczb fibonacheigo
        //strumien intow od 20 do 30
        //wykonamy obliczenia ruwnolegle i sekwencyjnie
        //zamieniamy na liste
        // wyswietlamy wynik
        UnaryOperator<Long> calculateFibonacciNumber = new UnaryOperator<Long>(){
            @Override
            public Long apply(Long n){
                if(n<=1) return n;
                else return apply(n-1)+apply(n-2);
            }
        };
        List<Long> fibonacciResults = LongStream.range(20,30)
                //.parallel()
                .map(calculateFibonacciNumber::apply)
                .boxed()
                .collect(Collectors.toList());
        System.out.println(fibonacciResults);
        long t1 = System.currentTimeMillis();
        List<Long> fibonacciResults2 = Arrays.stream((new Long[]{42L,42L,42L}))
                //.parallel()  //prawie 3 krotna różnica w czasie wykonania dzisęki parallel
                .map(calculateFibonacciNumber::apply)
                .collect(Collectors.toList());
        long t2 = System.currentTimeMillis();
        System.out.println("Processing time: " +(t2-t1) +" ms");
        System.out.println(fibonacciResults2);

    }

}
