package com.techchefs.javaapp.lamda;

import java.util.function.Consumer;

import lombok.extern.java.Log;

@Log
public class TestStudent {

	public static void main(String[] args) {
		Student st = new Student("ssss", 70, 80, 65);
		Consumer<Student> c = s -> {
			double avg = (s.sub1 + s.sub2 + s.sub3) / 3.0;
			log.info(s.name + "   " +avg);
		};
		c.accept(st);
	}

}
