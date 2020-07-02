package closure

/**
 * 三个重要变量
 * this: 闭包定义处的类
 * owner: 闭包定义处的类或者对象：  当闭包存在嵌套情况的时候,Owner值得是最外层的对象
 * delegate: 代表任意对象，delegate默认为owner指向的对象,可以指向外部的任意对象
 */
class Person{
    def static innerClosure() {
        def outClosure = {
            def owner = {
                print 'methodClassClosure: '+this+"\n"
                print 'methodClassClosure: '+owner+"\n"
                print 'methodClassClosure: '+delegate
            }
            owner.call()
        }
        outClosure.call()
    }
}
Person.innerClosure()
