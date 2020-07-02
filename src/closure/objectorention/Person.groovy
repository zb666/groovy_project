package closure.objectorention

class Person implements DefaultAction{

    String name;
    Integer age;

    def increTestAge(Integer year){
        this.age = year
    }

    @Override
    void test() {
    }

}


