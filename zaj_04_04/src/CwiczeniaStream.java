import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class CwiczeniaStream {
    public static void main(String[] args) {
//1
    List<Integer> num = Arrays.asList(1, 3, 4, 8, 9, 13, 14);
    num.stream().filter(x->x%2==1)
            .peek(System.out::println)//realizujemy operacje na elementach nie zmieniajac ich wartosci
            .map(x->x*10)
            .forEach(System.out::println);
//2
List<String> stringList = Arrays.asList("ala","kot", "aleksandra","samochód", "pies","azor");
stringList.stream()
        .filter(s->s.startsWith("a"))
        .map(s->s.substring(0,1).toUpperCase()+s.substring(1))
        .forEach(System.out::println);
// 3 zrobione  w trakcie zajec
//4
        stringList.forEach(x-> System.out.println(x));

        //lambda tworząca liste stringow
        Supplier<List<String>> generateStringList = () ->{
            List<String> list = new LinkedList<>();
            for (int i = 0; i < 5; i++) {
                String s="";
                Random rnd = new Random();
                for (int i1 = 0; i1 < rnd.nextInt(5)+2; i1++) { //wyrazy będą się składały z różnej ilości znaków od 2 do 6
                    //65-90 litery w ascii
                    s+=(char)(rnd.nextInt(90-65)+65);
                }
                list.add(s);
            }
            return list;
        };
        System.out.println(generateStringList.get());
        //pobieramy liste za pomoca wyrazenia regularnego po czym tworzymy strumien i uzywamy metody forEach
        generateStringList.get().stream().forEach(System.out::println);
        //5
        System.out.println("");
        generateStringList.get().stream().sorted().forEach(s -> System.out.println(s+" "+s.length()));
//6
        List<String> stringList3 = Arrays.asList("ala","kot", "aleksandra","samochód", "pies","azor");
        System.out.println(filterWords(stringList3));
//7
        Map<String,String> map1 = new HashMap<>();
        map1.put("a","1");
        map1.put("b","2");
        map1.put("c","3");
        map1.entrySet().//pobieramy zbior wpisow mapy
                stream().//tworzymy strumien
                forEach((e)-> System.out.println(e.getKey()+" "+e.getValue()));
        //8 - uzywamy suppliera z 4 zadania
        String sx =generateStringList.get().stream().collect(Collectors.joining(" "));
        System.out.println(sx);
//9
        List<String> stringList4 = Arrays.asList("ala","kot", "aleksandra","samochód", "pies","azor");
Map<String,Integer> map = stringList4.stream()
        .collect(Collectors.toMap(Function.identity(), s -> s.length()));//pierwszy argument metody toMap to klucz, a 2 to wartość
        //Function.identity() jest tożsame z s->s, czyli zwraca to co wczodzi bez zmian
        System.out.println(map);
        //10a -wyświetl cały plik
/*
        try (Stream<String> lines = new BufferedReader(new FileReader("C:\\Users\\admin\\IdeaProjects\\zaj07_03\\src\\main\\java\\tadeusz.txt")).lines()) {
            lines.forEach(System.out::println);
        }
             catch(FileNotFoundException e){
                 e.printStackTrace();
        }
*/
        //10b
        try (Stream<String> linesB = new BufferedReader(new FileReader("C:\\Users\\admin\\IdeaProjects\\zaj07_03\\src\\main\\java\\tadeusz.txt")).lines()) {
            Long numOfLines= linesB.filter(s->s.startsWith("I"))
                    .count();
            System.out.println("Liczba linni zaczynających się na i: " +numOfLines);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
//10c
        try (Stream<String> linesC = new BufferedReader(new FileReader("C:\\Users\\admin\\IdeaProjects\\zaj07_03\\src\\main\\java\\tadeusz.txt")).lines()) {
           //metoda flatmap służy do "spłaszczania strumienia"
            //przyjmuje element strumienia a nastepszie zwraca strumien
            //wykonuje sie dla kazdego elementu strumienia
            //w tym przypadku s jest String stanowiacy linie ksiazki
            //w metodzie dana linnia jest rozbijana na wyrazy
            //po uzyciu metody split() uzyskujemy tablice stringow
            //nastepnie tablice stringow zmieniamy na strumien
            linesC.flatMap(s->Arrays.stream(s.split(" ")))
                    .forEach(System.out::println);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }



    }
    private static List<String> filterWords(List<String> list){
        return list.stream()
                .filter(s->s.startsWith("a"))
                .collect(Collectors.toList());
    }
}
