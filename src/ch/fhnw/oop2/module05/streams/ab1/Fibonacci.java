package ch.fhnw.oop2.module05.streams.ab1;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String collect = Stream.iterate(new Tuple<Integer>(0, 1), t -> new Tuple<Integer>(t.t2, t.t1 + t.t2))
			.limit(30)
			.map(t -> t.t2)
			.map(String::valueOf)
			.collect(Collectors.joining(", "));
	
		System.out.println("Result: " + collect);

	}

}
