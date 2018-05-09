package com.study.young;

import org.junit.Test;

/**
 * 테스트를 담당하는 별도의 클래스를 추가했지만 
 * main() 메소드 하나에서 프로덕션 코드의 여러 메소드를 동시에 테스트하고 있다.
 * 이는 프로덕션 코드의 복잡도가 증가하면 증가할수록 main() 메소드의 복잡도도
 * 증가하고 결과적으로 main()메소드를 유지하는데 부담이 된다.
 *
 * 이 같은 문제를 해결하기 위해 다음과 같이 테스트 코드를 
 * 각 메소드 별로 분리할 수도 있다.
 */
public class CalculatorTest {
	// 프로젝트에 JUnit 라이브러리를 추가한 후 새로운 CalculatorTest를 추가한다
	// JUnit을 사용하려면 라이브러리를 추가해야한다.
	// JUnit은 테스트 메소드에 @Test 애노테이션을 추가한다.
	@Test
	public void add() {
		Calculator cal = new Calculator();
		System.out.println(cal.add(6, 3));
	}
	
	// JUnit 기반으로 테스트 코드를 구현하면 CalculatorTest 클래스가 가지는
	// 전체 메소드를 한번에 실행할 수도 있으며 add(), subtract() 메소드
	// 각각을 실행할 수도 있다.
	// 각각의 테스트 메소드를 독립적으로 실행할 수 있기 때문에
	// 현재 내가 구현하고 있는 프로덕션 코드의 메소드만 실행해볼 수 있다.
	@Test 
	public void subtract() {
		Calculator cal = new Calculator();
		System.out.println(cal.subtract(6, 3));
	}
}
