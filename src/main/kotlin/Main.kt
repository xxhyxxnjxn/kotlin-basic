package com.hyeonjin

/**
 * 코틀린에서 변수 선언은 val,var을 사용한다.
 * val : 변수를 선언할 때 지정한 값에서 더 이상 변경하지 않아야 하는 경우
 * var : 변수의 값을 바꿀 수 있어야 하는 경우
 *
 * val test : String = "변수 선언 방법"
 * 변수 선언 키워드 / 변수 이름 / 데이터 타입 / 값
 * 이 순서대로 선언한다.
 *
 * 코틀린은 reference data type을 사용한다. (int x Int o (레퍼런스 타입) / Int로 사용하면 컴파일 과정에서 int로 변경해줌)
 * 레퍼런스 데이터 타입은 객체(메모리)를 생성하고 데이터를 할당하는 방식을 의미한다.
 * 다만 참초형으로 생성된 객체는 컴파일 과정에서 기본형으로 대체되어 문제 없이 사용될 수 있따.
 *
 * 데이터 타입의 최상위 클래스로는 Any가 있다.
 *
 * 정수형 데이터 타입 : Long(64), Int(32), short(16), byte(8)
 * 기본적으로 Int로 추론된다. L을 붙이면 Long타입으로 추론한다.
 *
 * 실수형 데이터 타입 : Double(64), Float(32)
 * 기본적으로 Double로 추론된다.
 *
 *
 */
fun main() {  // -> public static void main (String[] args)이랑 똑같은 역할
    println("Hello World!")
}
