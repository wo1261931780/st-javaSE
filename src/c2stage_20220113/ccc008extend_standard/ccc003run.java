package c2stage_20220113.ccc008extend_standard;

public class ccc003run {
    public static void main(String[] args) {
        ccc002student x=new ccc002student();
        x.setName("aa");
        x.setAge(11);
        x.setClassnum("22");
        System.out.println(x.getName()+"--"+x.getAge()+"--"+x.getClassnum());
        x.search_class();//推荐类名.方法名
        // 用上面的方法进行访问
        x.see_class();
    }
}
