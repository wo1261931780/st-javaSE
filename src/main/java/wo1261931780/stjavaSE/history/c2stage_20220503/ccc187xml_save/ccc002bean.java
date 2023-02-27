package wo1261931780.stjavaSE.history.c2stage_20220503.ccc187xml_save;

/**
 * Created by Intellij IDEA.
 * Project:st-java.github.io
 * Package:c2stage_20220503.ccc187xml_case
 * User:  wo1261931780@gmail.com
 * Time:  2022-05-14-18  星期二
 */
public class ccc002bean {
    private int id;
    private boolean vip;
    private String name;
    private String gender;
    private String email;

    public ccc002bean() {
    }

    public ccc002bean(int id, boolean vip, String name, String gender, String email) {
        this.id = id;
        this.vip = vip;
        this.name = name;
        this.gender = gender;
        this.email = email;
    }

    @Override
    public String toString() {
        return "ccc002bean{" + "id=" + id + ", vip=" + vip + ", name='" + name + '\'' + ", gender='" + gender + '\''
                + ", email='" + email + '\'' + '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVip() {
        return vip;
    }

    public void setVip(boolean vip) {
        this.vip = vip;
    }
}


//~ Formatted by Jindent --- http://www.jindent.com
