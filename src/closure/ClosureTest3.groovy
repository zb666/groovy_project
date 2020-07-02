package closure

String str = "1 2 3 5"
def result = str.find{
    String s -> s.isNumber()
}

def numResult = str.any {
    it.isNumber()
}
print("result: $numResult")

