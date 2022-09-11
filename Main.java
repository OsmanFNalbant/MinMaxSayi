import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] list = {15,12,788,1,-1,-778,2,0};
        System.out.println("Bir sayı giriniz:");
        int a = sc.nextInt() , b=99999999,k=-99999999;
        for(int i =0; i<8; i++)
        {
            if(a < list[i]) {
                if(list[i]<b){
                    b=list[i];
                }
            }
            if(a > list[i])
            {
                if(k<list[i]){
                    k=list[i];
                }
            }
        }
        System.out.println("Girilen sayı : "+a);
        System.out.println(a+" Girilen sayıdan küçük en yakın sayı : "+b);
        System.out.println(a+" Girilen sayıdan büyük en yakın sayı : "+k);
        sc.close();
    }
}
