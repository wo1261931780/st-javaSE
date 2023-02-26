package c2stage_20220113.ccc021abstract_catdog_case;

public class ccc024Dog extends ccc022animal {
    @Override
    public void eat() {
        System.out.println("meat----------");
    }
    public void dog1(){}
    public void dog1(int age,String name){
        super.setAge(age);
        super.setName(name);
    }
}
