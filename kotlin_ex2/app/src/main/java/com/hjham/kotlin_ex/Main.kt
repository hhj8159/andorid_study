package com.hjham.kotlin_ex

fun main() {
    // val(상수), var

    var num1: Int = 5;
    var num2 = 10;
    var num3 = num1 + num2;
    var num4 = "abcd"; // type assign

    println("hello world");
    println(num3);

    if (num1 > num2) {
        println("num1이 더 큼")
    } else {
        println("num2이 더 큼")
    }

    // when > switch
    when (num1) {
        5 -> println("value 5")
        10 -> println("value 10")
        // default
        else -> println("invalid value")
    }

    // 결과할당
    var result = when (num3) {
        10 -> "value is 10"
        15 -> "value is 15"
        else -> "unknown"
    }
    println(result)

    /*
    case 1:
    case 2:
    */
    val day = "화"
    when (day) {
        "월", "화", "수", "목", "금" -> println("weekday")
        "토", "일" -> println("weekend")
    }

    // 범위조건
    //score = 85
    // A, B, C
    var score = 85;
    if (score >= 90) {
        println("A")
    } else if (score >= 80) {
        println("B")
    } else {
        println("C")
    }

    when (score) {
        in 90..100 -> println("A")
        in 80..89 -> println("B")
        else -> println("C")
    }

    // is 타입체크
    println(score is Int)
    var value: Any = "hello";

    result = when (value) {
        is String -> "I'm String"
        is Char -> "I'm Char"
        is Double -> "I'm Double"
        else -> "unknown"
    }
    println(result)

    // odd, even
    when {
        num1 % 2 == 1 -> println("odd")
        num1 % 2 == 0 -> println("even")
        else -> println("??")
    }
    println(getGrade(95))

    for (x in 2..9) {
        println("------------ ${x}단 ------------")
        for (y in 1..9)
            println("${x} * ${y} = ${x * y}")
    }

    // list inmutable
    // Stream.of(...).toList() >> immutable List
    // mutableListOf(1,2,3,"ac")

    // array
    val numbers = arrayOf(1, 2, 3, 4, 5)
    val numbers2 = Array(5) { 0 }
    for (x in numbers2) {
        println(x)
    }
    println(numbers2.joinToString())
    // List<int>
    // 기본 자료형 대상외 함수
    doubleArrayOf()

    // array -> index
    println(numbers[2])
    println(numbers.size)

    // numbers의 값 내부를 변경
    // 1번 인덱스의 값을 10으로
    // 3번 인덱스의 값을 20으로 변경 후 출력
    numbers[1] = 10;
    numbers[3] = 20;
    numbers.withIndex();
    for ((i, value) in numbers.withIndex()) {
        println("index : ${i}, value : ${value}")
    }
    println(numbers.joinToString())
    println(numbers.sortedArray().joinToString())
    println(numbers.sortedArrayDescending().joinToString())

    // map, sum
    println(numbers.map { i -> i + i })
    println(numbers.map { i -> i + i }.toIntArray())
    numbers.map { i -> i + i }.forEach { i -> println(i) };

    val animal = Animal("곰", 3);
    val person = Person("sd", 12);
    person.age = 30;
    person.name = "새똥이"

    println(animal)
    println(person)
    person.info()

    val student = Student(1, "kd")
    println(student) // data는 data저장목적 toString equal 자동세팅

    Obj.c++;
    println(Obj.c)
    Obj.c++;
    println(Obj.c)

    val a = fun() { println("Hello A") }
    a()

    val b: () -> Unit = { println("Hello B") }
    b()

    val c: (Int) -> Int = {it * it};
    println(c(5))

    val d : (Int, Int) -> Int = {a, b -> a + b}
    println(d(3, 4))
}
fun getGrade(score:Int): String = when(score) {
    in 90..100 -> "A"
    in 80..89 -> "B"
    else -> "C"
}

class Animal (
    var name:String,
    var count:Int
)

open class Person {
    var name:String = ""
    var age = 0

    init {
        // 초기화 블록
    }
    
    constructor(name:String, age:Int) {
        this.name = name
        this.age = age
    }

    fun info() {
        println("name : ${name} age : ${age}")
    }
}

// -- data, object

data class Student (val no:Int, val name:String)

// singleton
object Obj {
    var c = 0;
}