package io.kvh.as.groovy;

class People {
    String name
    int age
}

People p1 = new People();
People p2 = new People(name: "Luis", age: 29)//通过类似 map 的方式赋值参数

def foo(String p1, int p2 = 1) {
    println(p1)
    println(p2)
}

foo("hello")