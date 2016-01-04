package io.kvh.as.groovy;

def playList() {
    def lst = ["a", 2, true]//支持不同类型元素

    println(lst)
}

playList()

def playArray() {
    def intArr = [1, 2, 3] as int[]//显示声明
    String[] strArr = ["a", "b"]//另外一种方式

    println(intArr)
    println(strArr)
}

playArray()

def playMap() {
    def map = [a: "a", b: "b"]

    println(map)

    def key = "name"
    def map2 = [key: 'a']//未使用
    def map3 = [(key): 'a']//使用

    println(map2)
    println(map3)
}

playMap()