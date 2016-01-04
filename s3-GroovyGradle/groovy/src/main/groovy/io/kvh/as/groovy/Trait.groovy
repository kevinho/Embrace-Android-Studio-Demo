package io.kvh.as.groovy;

trait Fly {
    void fly() {
        println("fly")
    }
}

trait Walk {
    void walk() {
        println("walk")
    }
}

class Duck implements Fly, Walk {

}

Duck duck = new Duck()
duck.fly()
duck.walk()