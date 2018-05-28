public class Person {
    private String name;
    private int age;
    public Person() {
        super();
        // TODO Auto-generated constructor stub
    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    /**
     * 重写父类的equals()方法，用来判断两个人是否相等
     */
    public boolean equals(Object o){
        System.out.println("+++++++++++++");
        /*boolean b = false;

        if(o instanceof Person){

            Person p = (Person)o;

            if(age == p.getAge() && name.equals(p.getName())){

                b = true;
            }
        }

        return b;*/

        if (o == null) return false;
        if (!(o instanceof Person)) return false;

        Person p = (Person) o;
        if (name.equals(p.getName()) && age == p.getAge()){
            return true;
        } else {
            return false;
        }

    }   // equals


    public int hashCode(){

        System.out.println("-------" + (17 + age) );
        System.out.println();
        return 17 + age ;
    }
}
