package com.javaex.ex02;

public class Point {
	
	//필드
	private int x;
	private int y;
	
	
	//생성자
	public Point() {
		super();  //Object클래스의 기본 생성자 호출 생략가능
	}


	public Point(int x, int y) {
		super();  //Object클래스의 기본 생성자 호출 생략가능
		this.x = x;
		this.y = y;
	}


	//메소드gs
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}

	
	
	//재정의 오버라이딩이랑은 다름
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
	
	
}
