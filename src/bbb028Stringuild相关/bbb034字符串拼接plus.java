package bbb028StringuildÏà¹Ø;

public class bbb034×Ö·û´®Æ´½Óplus {
    public static void main(String[] args) {
        int[] arr={1,5,41,32,154,564,654,86};
        StringBuilder xx=new StringBuilder("[");
        for (int x=0;x<arr.length;x++){
            if (x==arr.length-1) {
                xx.append(arr[x]+"]");
            }else {
                xx.append(arr[x]+",");
            }
        }
//        System.out.println(xx+"]");
//        xx.append("]");
        System.out.println(xx);
        String a=xx.toString();
        System.out.println(a);
    }
}
