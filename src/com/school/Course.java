package com.school;

public class Course {
	private String  course_name;
	private String  course_book;
	private String  course_id;
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getCourse_book() {
		return course_book;
	}
	public void setCourse_book(String course_book) {
		this.course_book = course_book;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public Course(String course_name, String course_book, String course_id) {
		super();
		this.course_name = course_name;
		this.course_book = course_book;
		this.course_id = course_id;
	}
	public Course() {
		super();
		// TODO 自动生成的构造函数存根
	}	
	
	
}
