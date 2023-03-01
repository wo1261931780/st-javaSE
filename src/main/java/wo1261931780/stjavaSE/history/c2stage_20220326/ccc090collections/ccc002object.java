package wo1261931780.stjavaSE.history.c2stage_20220326.ccc090collections;

import java.util.Comparator;

/**
 * Created by Intellij IDEA.
 * Project:index.pb
 * Package:c2stage_20220326.ccc090collections
 * User:  wo1261931780@gmail.com
 * Time:  2022-03-16-10  ÐÇÆÚÁù
 */
public class ccc002object implements Comparator<ccc002object> {
    private int age;
    private String name;

    public ccc002object() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int compare(ccc002object o1, ccc002object o2) {
        return o1.age - o2.age;
    }
    //
    // public int compare(String name) {
    //     return ;
    // // }
    //
    // @Override
    // public Comparator<ccc002object> reversed() {
    //     return Comparator.super.reversed();
    // }
}
