package io.kvh.as.groovy;

def defaultIt() {
    3.times {
        println it
    }
}

defaultIt()

def closureObj() {
    def obj = { a ->
        ++a
    }
    println obj.call(1)
}

closureObj()