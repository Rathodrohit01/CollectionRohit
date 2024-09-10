package com.service;

import java.util.ArrayList;
import java.util.List;

import com.dao.StudentDao;
import com.entity.Student;

public class StudentService {

	StudentDao dao = null;

	public List<Student> getAllStudentservice() {
		dao = new StudentDao();
		List<Student> db = dao.getAllstudents();
		return db;

	}

	public List<Student> getAllstudentnameservice(String ch) {
		List<Student> db1 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllstudents();
		for (Student s : db) {
			if (s.getName().startsWith(ch)) {
				db1.add(s);
			}

		}
		return db1;
	}

	public List<Student> getAllMaximummarks() {
		List<Student> db2 = new ArrayList<Student>();
		dao = new StudentDao();
		List<Student> db = dao.getAllstudents();
		int max = 0;
		Student s = null;
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i).getMarks() > max) {
				max = db.get(i).getMarks();
				s = db.get(i);
			}
		}
		db2.add(s);
		return db2;
	}

//	public List<Student> getAllMinmummarks() {
//		List<Student> db3 = new ArrayList<Student>();
//		dao = new StudentDao();
//		List<Student> db = dao.getAllstudents();
//		int min = 1;
//		Student s = null;
//		for (int i = 0; i < db.size(); i++) {
//			if (db.get(i).getMarks() > min) {
//				min = db.get(i).getMarks();
//				s = db.get(i);
//			}
//		}
//		db3.add(s);
//		return db3;
//	}
}