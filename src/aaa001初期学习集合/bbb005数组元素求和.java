package aaa001初期学习集合;

public class bbb005数组元素求和 {
    public static void main(String[] args) {
        int[] arr = {68, 27, 95, 88, 171, 996, 51, 210};
        int x = 0;
        int xx = 0;
        for (System.out.println("开始循环"); x < arr.length; x++) {
            if (arr[x] % 10 != 7 && arr[x] / 10 % 10 != 7 && arr[x] % 2 == 0) {
                xx += arr[x];
            }
            /*
            if(arr[x]%10==7||arr[x]/10%10==7){
                //x++;
            }else if(arr[x]%2==0){
                xx +=arr[x];
                //x++;
            }*/
        }
        System.out.println(xx + "循环结束");
    }
}
