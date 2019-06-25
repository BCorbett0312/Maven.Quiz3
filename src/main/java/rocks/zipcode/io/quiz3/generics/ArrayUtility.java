package rocks.zipcode.io.quiz3.generics;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author leon on 09/12/2018.
 */
public class ArrayUtility<SomeType> {
    private final SomeType[] array;

    public ArrayUtility(SomeType[] array) {
        this.array = array;
    }





    public SomeType findOddOccurringValue() {
        Stream<SomeType> myStream = Arrays.stream(array);
        List<SomeType> thisList = myStream.filter(e -> getNumberOfOccurrences(e)%2 != 0).collect(Collectors.toList());

        return thisList.get(0);
    }

    public SomeType findEvenOccurringValue() {
        Stream<SomeType> myStream = Arrays.stream(array);
        List<SomeType> thisList = myStream.filter(e -> getNumberOfOccurrences(e)%2 == 0).collect(Collectors.toList());


        return thisList.get(0);
    }

    public Integer getNumberOfOccurrences(SomeType valueToEvaluate) {
        Stream<SomeType> myStream = Arrays.stream(array);
        List<SomeType> myList = myStream.filter(e -> e == valueToEvaluate).collect(Collectors.toList());

        return myList.size();
    }

    public SomeType[] filter(Function<SomeType, Boolean> predicate) {
        Stream<SomeType> myStream = Arrays.stream(array);




        return myStream.filter((val) -> predicate.apply(val)).toArray((i) ->(SomeType[]) Array.newInstance(array[0].getClass(),i));
    }
}
