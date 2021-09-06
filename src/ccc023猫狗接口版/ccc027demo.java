package ccc023猫狗接口版;

import java.util.Scanner;

public class ccc027demo {
    public static void main(String[] args) {
        System.out.println("please type name of your cat");
        Scanner name1 = new Scanner(System.in);
        String namecat = name1.nextLine();
        System.out.println("please type age of your cat");
        Scanner age1 = new Scanner(System.in);
        int agecat = age1.nextInt();
        ccc026接口 cat = new ccc024cat(agecat, namecat);
        System.out.println(namecat + "已经" + agecat + "岁了");
        cat.jump();
        ccc024cat a = (ccc024cat) cat;//向下转型，把父类对象cat给子类对象a
        ((ccc024cat) cat).eat();//相当于a.eat
        System.out.println("-----------------stripe");
        System.out.println("please type name of your dog");
        Scanner name2 = new Scanner(System.in);
        String namedog = name2.nextLine();
        System.out.println("please type age of your dog");
        Scanner age2 = new Scanner(System.in);
        int agedog = age2.nextInt();
        ccc026接口 dog = new ccc025dog(agedog, namedog);
        System.out.println(namedog + "已经" + agedog + "岁了");
        dog.jump();
        ccc025dog b = (ccc025dog) dog;
        ((ccc025dog) dog).eat();
    }
}
