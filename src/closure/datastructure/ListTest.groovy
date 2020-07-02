package closure.datastructure

def list = [1,3,2,5,4]
list.sort({a,b->
    a>b?a:b
})
println list
