package com.java_base;

public class typeString {
    public static void main(String[] args) {

//        1. 자료형 - 문자열
        System.out.println("== 문자열 ==");
        String s1 = "Hello World";
        System.out.println("s1 = " + s1);
        String s2 = "012345";
        System.out.println("s2 = " + s2);

//        1-2. equals
        String s3 = "Hi";
        String s4 = "Hi";
        System.out.println(s3.equals(s4));
        System.out.println(s3 == s4);
        String s5 = new String("Hi");
        System.out.println(s3.equals(s5));   // 다른 객체여도 값은 같기에 true
        System.out.println(s3 == s5);      // 값은 같지만 다른 객체 이기에 false

//        1-2. indexOf
        String s6 = "Hello! World!";
        System.out.println(s6.indexOf("!"));
        System.out.println(s6.indexOf("!", s6.indexOf("!") + 1)); // 두번째 ! 의 인덱스 위치 찾아줘

//        1-3. replace
        String s7 = s6.replace("Hello", "Bye");
        System.out.println("s7 = " + s7);

//        1-4. subString
        System.out.println(s7.substring(0,3));               // subString 원하는 인덱스 위치에 있는 문자 뽑아준다. endIndex = 인덱스 - 1 위치 만큽
        System.out.println(s7.substring(0, s7.indexOf("!") + 1));

//        1-5. toUpperCase
        System.out.println(s7.toUpperCase());

//        2. 자료형 - StringBuffer             // 여러번 메모리 생성되는 걸 방지해주면서 효율적으로 값 변경 가능
        System.out.println("== StringBuffer ==");
        StringBuffer sb1 = new StringBuffer();
        sb1.append("01234");
        System.out.println("sb1 = " + sb1);
        sb1.append("56789");
        System.out.println("sb1 = " + sb1);

        String a = "01234";
        String b = "56789";
        String bak = a;  // a 가 아래 a += b 를 통해 변화하기전에는 true 같지만
        System.out.println(a == bak);

        a += b;
        System.out.println(a);  // String 으로도 변경 가능하지만 새로운 객체를 계속 생성하기에 메모리 비 효율적 (속도도 딜레이)
        System.out.println(a == bak);    // 변화하고 난 후 a 는 false 같지 않다. (객체를 새로 만들었기 때문)

//        3. 자료형 - 배열
        System.out.println("== 배열 ==");
        int[] myArray1 = {1, 2, 3, 4, 5};
        System.out.println(myArray1[0]);
        System.out.println(myArray1[1]);
        System.out.println(myArray1[2]);
        System.out.println(myArray1[3]);
        System.out.println(myArray1[4]);

        char[] myArray2 = {'a', 'b', 'c', 'd', 'e'};
        System.out.println(myArray2[2]);

        String[] myArray3 = new String[3];
        myArray3[0] = "Hello";
        myArray3[1] = " ";
        myArray3[2] = "World";
        System.out.println(myArray3[0] + myArray3[1] + myArray3[2]);
    }
}
