package com.java_base;

public class Operator1 {
    public static void main(String[] args) {

//        1. 대입 연산, 부호 연산자
            int num = 100;
            num = +10;
            num = 10;
            num = -10;

//        2. 산술 연산자, 증가/감소 연산자
        System.out.println("== 산술 연산자, 증가/감소 연산자 ==");
        int numX = 10;
        int numY = 3;
        int result = 0;
        result = numX + numY;
        result = numX - numY;
        result = numX * numY;
        result = numX / numY;
        result = numX % numY;
        System.out.println("result = " + result);

        int numZ = 1;
        System.out.println(numZ++);;   // 증가 하기전 기본 값이 먼저 시작  1
        System.out.println(numZ);      // 2

        numZ = 1;
        System.out.println(++numZ);   // 증가를 하고 값이 시작 2
        System.out.println(numZ);     // 2

        numZ = 1;
        System.out.println(numZ--);   // 증가를 하고 값이 시작 1
        System.out.println(numZ);     // 0

        numZ = 1;
        System.out.println(--numZ);   // 감소를를 하고 값이 시작 0
        System.out.println(numZ);     // 0

//        3. 관계 연산자
        System.out.println("== 관계 연산자 ==");
        int numA = 10;
        int numB = 9;

        System.out.println(numA > numB);
        System.out.println(numA < numB);
        System.out.println(numA == numB);
        System.out.println(numA != numB);

//        4. 논리 연산자
        System.out.println("== 논리 연산자 ==");
        System.out.println((10 > 9) && (1 == 0));   // 둘다 맞아야 true
        System.out.println((10 > 9) || (1 == 0));   // 하나라도 맞으면 true

//        5. 복합 대입 연산자
        System.out.println("== 복합 대입 연산자 ==");
        int num1 = 10;
        int num2 = 5;
        num1 += num2;
//        num1 = num1 + num2      위와 같은 의미
        System.out.println("num1 = " + num1);
        num1 -= num2;
        num1 += num2;

//        6. 삼항 연산자
        System.out.println("== 삼항 연산자 ==");
        int a = 100;
        String aResult = (a == 100) ? "yes" : "no";
        System.out.println("aResult = " + aResult);  // 조건이 참이면 : 왼쪽 거짓이면 : 오른쪽

    }
}
