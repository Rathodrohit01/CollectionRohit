package com.dao;

import java.util.ArrayList;
import java.util.List;

import com.entity.Student;

public class StudentDao {
	public List<Student> getAllstudents() {
		List<Student> db = new ArrayList<Student>();

		db.add(new Student(1, "rohit", 98));
		db.add(new Student(2, "kunal", 78));
		db.add(new Student(3, "Shubham", 95));
		db.add(new Student(4, "rahul", 91));
		db.add(new Student(5, "mahesh", 97));
		return db;

	}
}