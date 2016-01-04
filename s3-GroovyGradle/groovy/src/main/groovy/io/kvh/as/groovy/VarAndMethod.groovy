package io.kvh.as.groovy;

/**
 * Created by bugtags.com on 16/1/3.
 */

def varAndMethod() {
    def a = 1//不显式声明变量类型
    a = "abc"//运行时改变类型

    println a//无需；结束一行代码
    a = 4//最后一行作为返回值
}
def ret = varAndMethod()//文件内运行方法

println ret