package com.javaex.ex07;

public class Ex01 {

	//일반메소드
	public static void main(String[] args) {

		int a = 3;
		System.out.println(a);
		
		Integer i = new Integer(3);
		System.out.println(i);
		
		Integer sum = new Integer(3)+new Integer(3);
		System.out.println(sum);
		
		Integer v01 = 3;  // new Integer(3)  박싱 (박스가 없는데 박스작업을 한다)
		System.out.println(v01);
		
		Integer i01 = new Integer(999); //i01은 주소
		int b = i01;					//언박싱 
		System.out.println(b);
		
		System.out.println("----------------------------");
		
		
		//덜 좋은 방식 --> 필요없는 99를 넣어야한다.
		//Integer r01 = new Integer(99);
		Integer r01 = 99; //박싱
		int result = r01.parseInt("12345");
		System.out.println(result + 3); //문자열을 숫자로 변경
		
		
		//조금 더 좋은 방식(문자열을 숫자(정수)로 바꾸는 법) static 공부하기기기기
		int result02 = Integer.parseInt("12345");
		System.out.println(result02 + 1);
		
		//////////////////////////////////////////////////////////////////////////////////////
		
		//정수 --> 문자열   12345 --> "12345"
		
		//덜 좋은 방식 --> 필요없는 "안녕"을 넣어야한다.
		String s = new String("안녕");
		String sNum = s.valueOf(12345);
		System.out.println(sNum + 1);
		
		
		//조금 더 좋은 방식(정수-->*문자열) static 공부
		String sNum2 = String.valueOf(12345);
		System.out.println(sNum2+1);
		                 
		//(실수-->*문자열) static 공부, 메소드 오버로딩
		String sNum3 = String.valueOf(1234.3546);
		System.out.println(sNum3+1);
		
		//숫자-->문자열
		//System.out.println(12345+"1");
		String sNum4 = 12345 + "";
		System.out.println(sNum4 + 1);
		
		
		
		
		
		
	}

}
