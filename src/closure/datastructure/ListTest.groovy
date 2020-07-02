package closure.datastructure

def list = [1,3,2,5,4]
list.sort({a,b->
    a>b?b:a
})
println list

def sortStringList = ['aaaadda','bbbbb','ccccc','d']
sortStringList.sort({it->
    return it.size()
})
println sortStringList


