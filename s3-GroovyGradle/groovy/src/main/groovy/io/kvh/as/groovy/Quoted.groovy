package io.kvh.as.groovy;

/**
 * Created by bugtags.com on 16/1/3.
 */

def quoted() {
    def singleQ = 'hello, single quot'// 声明为java.lang.String
    def doubleQ = "hello, double quot ${singleQ}"// 如果有${},则为groovy.lang.GString，支持变量替换;否则为java.lang.String
    def tripleQ = '''hello,
triple quot'''// 允许多行，而不需要+号

    println singleQ
    println doubleQ
    println tripleQ
}

quoted()
