package com.javaex.ex06;

public class EX02 {

	public static void main(String[] args) {

		String a = " abcd";
		String b = ",efg ";
		
		/*
		System.out.println(a+b);
		System.out.println(a.concat(b)); // a문자열에 b문자열을 합쳐라
		
		System.out.println(b+a);
		System.out.println(b.concat(a));// b문자열에 a문자열을 합쳐라
		*/
		
		// 실험을 위해 a값을 바꾼다.
		a = a.concat(b);                    //문자열을 합친다.
		System.out.println(a);
		
		a = a.trim();			            //문자 양쪽 끝의 공백 제거한다. 중간의 공백을 없애지 못함. (회원가입 만들 때 많이 사용)
		System.out.println(a);
		
		a = a.replace("ab", "45");          //a의 문자열에서 ab를 12로 바꾼다.
		System.out.println(a);
		System.out.println("-----------------------------------");
		
		String[] sArray = a.split(","); // ","를 기준(기준은 내가 정할 수 있음)으로 나눠서 배열(주소)에 담아달라.
		for(int i=0; i<sArray.length; i++) {  // 그리고 배열의 주소를 리턴한다.
			System.out.println(sArray[i]);
		}
		
		System.out.println(a);
		System.out.println("-----------------------------------");
		
		
		String str = "Hello JAVA!";
		String result01 = str.substring(3);  // 입력한 방번호 부터 출력
		System.out.println(result01);
		
		String result02 =str.substring(1, 7); // 방번호 1부터 6(7전)까지 출력
		System.out.println(result02); 
		
		char c = str.charAt(0); //0번째 방 출력
		System.out.println(c);
		
		
		
		
	}

}
