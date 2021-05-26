package com.kopo.project0521;

public class Student {
	int idx;
	String name;
	double middlescore;
	double finalscore;
	String created;

	Student() {

	}

	Student(String name, double middlescore, double finalscore, String created) {
		this.name = name;
		this.middlescore = middlescore;
		this.finalscore = finalscore;
		this.created = created;
	}
	
	Student(int idx, String name, double middlescore, double finalscore, String created) {
		this.idx = idx;
		this.name = name;
		this.middlescore = middlescore;
		this.finalscore = finalscore;
		this.created = created;
	}

}
