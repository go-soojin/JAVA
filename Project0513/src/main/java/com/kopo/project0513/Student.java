package com.kopo.project0513;

public class Student {
	int idx; // DB테이블에 들어갈 고유값
	String name;
	int score;

	Student(){
		
	}
	
	Student(String name, int score) {
		this.name = name;
		this.score = score;
	}

}
