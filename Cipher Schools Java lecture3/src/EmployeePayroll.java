/* 
 * Ask the User to enter the BasicPay (Salary)
 * If the BasicPay is greater or equal to 5000 then
 * his 
 * HRA will be 10% of BasicPay
 * DA will be 20% of BasicPay
 * If the BasicPay is lesser than 5000
 * Then his
 * HRA will be 20% of BasicPay
 * DA will be 30% of BasicPay'
 * Find the GrossPay
 * 
 * Input:5600
 * HRA:?
 * DA:?
 * GrossPay: ?


 

import java.util.Scanner;

public class EmployeePayroll {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int bp, hra, da, gp;
        System.out.println("Enter Basicpay of employees:-");
        bp=in.nextInt();
        if(bp>=5000){
        hra= 10*bp/100;
        da= 20*bp/100;}
        else{
        hra=20*bp/100;
        da=30*bp/100;}
        gp=bp+hra+da;
        System.out.println("HRA:"+hra+" DA:"+da+" Gross pay:"+gp);
    }
}

*/