package closure

//匿名内联函数，也成为闭包。 闭包是将函数内部和函数外部连接起来的桥梁
def closure = {
    print "hello ${it}"
    return "123"
}

def result = closure.call("Closure Bob")
print "Result: $result"