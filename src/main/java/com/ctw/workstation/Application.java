package com.ctw.workstation;

import jakarta.persistence.criteria.CriteriaBuilder;
import org.apache.commons.lang3.RandomStringUtils;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Application {
    public static void main(String[] args) {

//        List<String> list = List.of("Java", "FS", "Academy", "CTW", "BMW", "/", "-");
//        List<String> numbers = Arrays.asList("43", "21", "54", "89", "137", "142", "751", "89", "137");
//
//        var newList = list
//                .stream()
//                .filter(w -> {
//                    return w.matches("[a-zA-Z]+");
//                })
//                .map(w -> w.toUpperCase())
//                .collect(Collectors.toSet());
//
//        var newNumbers = numbers.
//                stream()
//                .map(Integer::parseInt)
//                .collect(Collectors.toList());
//
//        Map<String, List<Integer>> numberGroups=
//                newNumbers.stream().collect(Collectors.groupingBy(num -> num % 2 != 0 ? "ODD" : "EVEN"));
//        System.out.println(numberGroups);
//        System.out.println("Total ODD: " + numberGroups.get("ODD").size());
//        System.out.println("Total EVEN: " + numberGroups.get("EVEN").size());
//
//
//        int length = 10; // Desired length of the random string
//        String randomString = RandomStringUtils.randomAlphanumeric(length);
//        Optional<String> optionalStr = Optional.of(randomString);
//
//        String myNull = null;
//        Optional<String> optionalNull = Optional.empty();
//
//        optionalStr.ifPresent((name) -> {
//            System.out.println(name);
//        });
//
//        optionalNull.ifPresent((nullName) -> {
//            System.out.println(nullName);
//        });
//
//        optionalNull.ifPresentOrElse((nullName) -> {
//            System.out.println(nullName);
//        }, ()-> {
//            System.out.println("It's empty");
//        });
//
//        System.out.println("Random String: " + randomString);
//
//        //-------------
//
//        Predicate<String> predicate = (w) -> { return w.matches("[a-zA-Z]+");};
//        UnaryOperator<String> toUpperCase = (w) -> { return w.toUpperCase();};
//        Function<String, Integer> getLength = (upperCaseW) -> { return upperCaseW.length();};
//        Function<Integer, String> inBrackets = (lengthW) -> {return "("+lengthW+")";};
//
//        var composeFunction = toUpperCase.andThen(getLength.andThen(inBrackets));
//
//        var outcome = list
//                .stream()
//                .filter(predicate)
//                .map(composeFunction).toList();
//
//        System.out.println(outcome);
//
//        var composition = list
//                .stream()
//                .mapToLong(s -> s.codePoints().count())
//
//                .toArray();
//        System.out.println("Size of each string: " + Arrays.toString(composition));
//


    }

}
