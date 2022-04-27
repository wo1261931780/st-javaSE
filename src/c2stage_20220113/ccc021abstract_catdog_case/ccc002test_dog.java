package c2stage_20220113.ccc021abstract_catdog_case;

public class ccc002test_dog extends ccc001test_animal {

    @Override
    public void eat(ccc001test_animal x) {
        System.out.println(x.getName() + x.getAge());
        System.out.println("×ÓÀà½áÊø");
    }
}
