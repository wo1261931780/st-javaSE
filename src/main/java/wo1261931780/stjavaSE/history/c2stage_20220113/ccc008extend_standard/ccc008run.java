package wo1261931780.stjavaSE.history.c2stage_20220113.ccc008extend_standard;

public class ccc008run {
    public static void main(String[] args) {
        ccc007student x=new ccc007student();
        x.setName("aa");
        x.setAge(11);
        x.setClassnum("22");
        System.out.println(x.getName()+"--"+x.getAge()+"--"+x.getClassnum());
        x.search_class();//推荐类名.方法名
        // 用上面的方法进行访问
        x.see_class();
    }
}
