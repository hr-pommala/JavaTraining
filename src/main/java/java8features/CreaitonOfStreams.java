package java8features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

//java.lang is implicit import by java
public class CreaitonOfStreams {

	public static void main(String[] args) throws IOException {
		
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
		String[] words = {"apple", "banana", "cherry"};
        
        // 1.Create a stream from the collection (List)
        numbers.stream().forEach(System.out::println);  // Prints: 1 2 3 4 5
       
       // Create a stream from an array
        Arrays.stream(words).forEach(System.out::println);  // Prints: apple banana cherry
        
       /**************** Stream.of() *******/
        
        Stream<String> fruitStream = Stream.of("Apple", "Banana", "Cherry");
       
        fruitStream.forEach(System.out::println);  // Prints: Apple Banana Cherry
        
        //fruitStream.forEach(System.out::println);  // Prints: Apple Banana Cherry
        
       
        /****************IterateStream *******/
        // Create an infinite stream of even numbers starting from 0
        Stream<Integer> evenNumbers = Stream.iterate(0, n -> n + 2);

        // Limit the stream to first 5 even numbers
        evenNumbers.limit(5).forEach(System.out::println);  // Prints: 0 2 4 6 8
        evenNumbers.limit(5).forEach(System.out::println);  // Prints: 0 2 4 6 8
        
        // evenNumbers.limit(5).forEach(System.out::println);  // Prints: 0 2 4 6 8
        
        
        /****************GenerateStream *******/
        // Create an infinite stream of random numbers
        Stream<Double> randomNumbers = Stream.generate(Math::random);

        // Limit the stream to first 5 random numbers
        randomNumbers.limit(5).forEach(System.out::println);  // Prints: random numbers
        
        /****************GenerateStream *******/
        
        Path filePath = Paths.get("examples.txt");
        Stream<String> linesStream = Files.lines(filePath);

        linesStream.forEach(System.out::println);  // Prints each line of the file
        
        
        /****************ConcatStreams *******/
        
        Stream<String> stream1 = Stream.of("One", "Two", "Three");
        Stream<String> stream2 = Stream.of("Four", "Five", "Six");

        // Concatenate two streams
        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);
        concatenatedStream.forEach(System.out::println);  // Prints: One Two Three Four Five
        
        /****************StreamBuilder *******/
        Stream<String> stream = Stream.<String>builder()
                .add("Java")
                .add("Python")
                .add("JavaScript")
                .build();

	}

}
