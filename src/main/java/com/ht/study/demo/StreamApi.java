package com.ht.study.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

    public static void main(String[] args) {
        //流的创建通过Collection集合提供的stream()或者paralleSream()
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        //通过Arrays中的静态方法
        String[] arr = new String[10];
        Stream<String> stream2 = Arrays.stream(arr);

        //无限流
        Stream<Integer> stream1 = Stream.iterate(0, (x) -> x + 2);
        stream1.forEach(System.out::println);

    }
}
