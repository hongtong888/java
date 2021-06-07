package com.ht.study.demo;

import com.ht.study.pojo.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApi1 {

    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("张三", 18, 100),
                new Student("李四", 20, 120),
                new Student("王五", 22, 150));

        /**
         * 筛选和切片
         * filter 接口Lambda 从流程排除元素
         * limit --截断流
         * skip 跳过元素
         * distinct 筛选
         */
        Stream<Student> stream = students.stream()
                .filter((e) -> e.getAge() >= 20);
        stream.forEach(System.out::println);

        /**
         * 映射
         * map 接收Lambda表达式   接收一个函数作为参数，该函数会被应用到每个元素上，并将其映射成一个新的元素
         * flatMap  接收一个函数作为参数，将流中的每个值都换成另外一个流，然后将所有的流连接成一个流
         */

        List<String> list = students.stream().map(Student::getName).collect(Collectors.toList());
        list.forEach(a -> System.out.println(a));

//        Stream<Stream<Character>> streamStream = list.stream().map(StreamApi1::filterCharacter);
//        streamStream.forEach(sm ->{
//            sm.forEach(System.out::println);
//        });
        Stream<Character> characterStream = list.stream().flatMap(StreamApi1::filterCharacter);
        characterStream.forEach(System.out::println);

        /**
         * 排序  Stream<T> sorted();
         *       Stream<T> sorted(Comparator<? super T> comparator);
         */


    }

    public static Stream<Character> filterCharacter(String str){
        List<Character> list = new ArrayList<>();
        for (Character character : str.toCharArray()) {
            list.add(character);
        }
        return list.stream();
    }
}

