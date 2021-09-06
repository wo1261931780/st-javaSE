package ccc033冒泡排序;

public class ccc035demo {
    public static void main(String[] args) {
        int[] arr={12,4,165,1,564,864,1,5,7,8};
        System.out.println("start-----------");
        for (int x=0;x< arr.length-1;x++){
//            System.out.println("rank begin---------");
            for (int x1=0;x1< arr.length-x-1;x1++){
                if (arr[x1]>arr[x1+1]){
//                    System.out.println("第"+x1+"次比较");
                    int temp=arr[x1];
                    arr[x1]=arr[x1+1];
                    arr[x1+1]=temp;
                }else{
                }
            }
        }
        System.out.println("排序后："+array(arr));
    }
    public static String array(int[] arr){
        StringBuilder xx=new StringBuilder();
        xx.append("[");
        for (int i=0;i< arr.length-1;i++){
            if (i== arr.length-1){
                xx.append(arr[i]);
            }else {
                xx.append(arr[i]).append(",");
            }
        }
        xx.append("]");
//        System.out.println(xx);
        String s=xx.toString();
        return s;
    }
}
