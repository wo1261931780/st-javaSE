package c2stage_20220326.eee025hashmap案例2;

public class eee026学生类 {
    private String age;
    private String city;

    public eee026学生类() {
    }

    public eee026学生类(String age, String city) {
        this.age = age;
        this.city = city;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        eee026学生类 eee026学生类 = (eee026学生类) o;

        if (age != null ? !age.equals(eee026学生类.age) : eee026学生类.age != null) return false;
        return city != null ? city.equals(eee026学生类.city) : eee026学生类.city == null;
    }

    @Override
    public int hashCode() {
        int result = age != null ? age.hashCode() : 0;
        result = 31 * result + (city != null ? city.hashCode() : 0);
        return result;
    }
}
