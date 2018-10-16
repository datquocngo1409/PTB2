package ptb2;

import java.util.Scanner;

public class PTB2 {
    
    static void GiaiPTB1(float a, float b){
        if(a==0 && b==0) System.out.println("Phuong trinh co vo so nghiem");
        else if(a==0 && b!=0) System.out.println("Phuong trinh vo nghiem");
        else System.out.println("Phuong trinh co nghiem duy nhat x = "+(-b/a));
    }
    
    static void GiaiPTB2(float a, float b, float c){
        if(a==0) GiaiPTB1(b, c);
        else{
            float denta = b*b-4*a*c;
            if(denta > 0) System.out.println("Phuong trinh co 2 nghiem \nx1 = "+((-b+Math.sqrt(denta))/(2*a))+"\nx2 = " + ((-b-Math.sqrt(denta))/(2*a)));
            else if (denta==0) System.out.println("Phuong trinh co nghiem kep x = "+(-b/(2*a)));
            else System.out.println("Phuong trinh vo nghiem");
        }
    }
    
    public static void main(String[] args) {
        float a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap he so a b c: ");
        a=sc.nextFloat();
        b=sc.nextFloat();
        c=sc.nextFloat();
        GiaiPTB2(a, b, c);
    }
    
}
