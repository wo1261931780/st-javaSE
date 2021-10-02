package ccc032常用api;

public class ccc037equals {
    public String name;
    public int age;

    public ccc037equals() {
    }

    public ccc037equals(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        //this----x
        //o---xx
        if (this == o) {
            return true;
        }
        //这里是比较地址
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        //先比较o(也就是xx)是否为null，为null则直接为false
        //然后比较两个的class是否是同一个，不是则false
        ccc037equals that = (ccc037equals) o;
        //向下转型，把o(也就是xx)给that，现在that为xx

        if (age != that.age) {
            return false;
        }
        //这里把x的age和that(xx)的age比较，不同就返回false
        //这个应该是相比较int类型的数据
        return (name != null) ? (name.equals(that.name)) : (that.name == null);
        //这里比较x的name是否是null，不是则继续进行
        //然后利用string中的equals比较x和xx的内容是否相同
        //相同则直接返回即可
    }
}
