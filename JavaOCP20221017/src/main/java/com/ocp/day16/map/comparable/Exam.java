package com.ocp.day16.map.comparable;

import java.util.Objects;

public class Exam {
	
	private String subject;
	private Integer score;
	
	public Exam() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Exam(String subject, Integer score) {
		super();
		this.subject = subject;
		this.score = score;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	// Standard implementations for overriding the method of "public int hashCode(){ ... }"
	// For more detail of hashCode, please follow up the previously lecture at
	// package: com.ocp.day11_2
	@Override
	public int hashCode() {
		int hash = 7;
		hash = 31 * hash + Objects.hashCode(this.subject);
		hash = 31 * hash + this.score;
		return hash;
	}

	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Exam other = (Exam) obj;
		return Objects.equals(score, other.score) && Objects.equals(subject, other.subject);
	}

//	@Override
//	public int compareTo(Exam o) {
//		return score - o.score;	
//	}

	@Override
	public String toString() {
		return "Exam [subject=" + subject + ", score=" + score + "]";
	}
}
