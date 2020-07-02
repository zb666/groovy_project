package closure.datastructure

def range = 1..10
range.from
range.to

def gradeTest(Number score){
    def result
    switch (score){
        case 0..60:
            result = '不及格'
            break
        case 60..100:
            result = '优秀'
            break
        default:
            result = '输入异常了  老铁'
    }
    print('result: '+result)
}

gradeTest(75)
gradeTest(20)
gradeTest(50)
