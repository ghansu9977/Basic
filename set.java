 class Person{
    
    private String name;
    private int age;

    public String getname(){
        return name;
    }

    public int getage(){
        return age;
    }

    public void SetName(String name){
        this.name = name;
    }

    public void SetAge(int age){
        this.age = age;
    }
}

class TestMain{
    public static void main(String[]args){
        Person p = new Person();
        p.SetName("jack");
        p.SetAge(20);

        String n = p.getname();
        int a = p.getage();

        System.out.println("Name: "+n);
        System.out.println("Age: "+a);
    }
}
