package c2stage_20220113.ccc034Commonly_used_api;

public class ccc001object {
    /**
     * 默认里面有extends object
     * public class ccc035object extends object{
     */
    int age;
    String name;

    public ccc001object() {
    }

    public ccc001object(int age, String name) {
        this.age = age;
        this.name = name;
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
    //因为调用的是这里的object命令，所以在此重写

    /**
     * 下面的tostring命令，在不重写的情况下，
     * 我直接得到结果：“c2stage_20220113.ccc034Commonly_used_api.ccc035object@776ec8df”
     * 从实际开发角度出发，我们不需要这样的结果，
     * 因此，为了方便展示，一般需要重写一次tostring方法
     */
    @Override
    public String toString() {
        return "ccc035object{" + "age=" + age + ", name='" + name + '\'' + '}';
    }
    //结果是：“ccc035object{age=20, name='junw'}”
    // 再补充一下，因为默认所有类都继承object，而object中就有tostring方法，
    // 所以这里直接重写tostring方法即可
    /*
    object中的源代码写法：
        //--------------------------------------------
        public String toString() {
            return getClass().getName() + "@" + Integer.toHexString(hashCode());
            //这里是最终结果，返回的是堆内存中，类名+@+代码的哈希值（16进制地址）
            //结果为：“c2stage_20220113.ccc034Commonly_used_api.ccc035object@776ec8df”
        }
        //--------------------------------------------
    */
    // 这种技术是通用技术，直接右键，选中参数生成即可完成重写

}
