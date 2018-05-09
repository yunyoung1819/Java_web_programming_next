package com.study.young;

/**
 * 문자열 계산기 구현을 통한 테스트와 리팩토링
 * 
 * 계산기 코드는 실제로 서비스를 담당하는 프로덕션 코드와 
 * 이 프로덕션 코드가 정상적으로 동작하는지 확인하기 위한 main()으로 나뉜다.
 * main()은 프로그래밍을 실행하기 위한 목적과 프로덕션 코드가 정상적으로 동작하는지
 * 확인하는 테스트 목적으로 나뉜다.
 * 
 * 이 계산기 코드의 첫번째 문제점은 프로덕션 코드와 테스트 코드(main()메소드)가 
 * 같은 클래스에 위치하고 있다는 것이다.
 * 
 * 이 문제를 해결하기 위한 첫 번째 단계로 프로덕션 코드(Calculator 클래스)와 
 * 테스트 코드(CalculatorTest)를 분리할 수 있다.
 */
public class Calculator {
	int add(int i, int j) {
		return i + j;
	}
	
	int subtract(int i, int j) {
		return i - j;
	}
	
	int multiply(int i, int j) {
		return i * j;
	}
	
	int divide(int i, int j) {
		return i / j;
	}
}
