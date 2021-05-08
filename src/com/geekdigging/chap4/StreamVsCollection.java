package com.geekdigging.chap4;

import java.util.*;

import java.util.List;
import java.util.stream.Stream;

public class StreamVsCollection {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Java8", "Lambdas", "In", "Action");
        Stream<String> s = names.parallelStream();
        s.forEach(System.out::println);
    }
}
