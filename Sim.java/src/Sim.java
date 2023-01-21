import java.util.Scanner;

public class Sim {
    public static void main(String[] args){
       Scanner sc;
        sc = new Scanner(System.in);

        System.out.println(" Welcome to our program to find phone numbers");
        System.out.print("please enter the code of a phone number here  : +964- ");
        try{
        int cod_num=sc.nextInt();
        System.out.print("Enter the phone number here : ");
        int tel_num=sc.nextInt();

      int korek[]={750,751};

        int asiacell[] ={770,771,772,773,774,775,};
        int zain[]={780,781,782,783,784};

        int a=0;
        while(tel_num!=0){
            tel_num=tel_num/10;
            a++;}


        if (a>7){
            System.out.println(" Sorry The phone  number is wrong ");}
            else if (cod_num ==korek[0]||cod_num==korek[1]){

            System.out.println("The number is Korek Tellicom");}


            else if(cod_num==asiacell[0]||cod_num==asiacell[1]||cod_num==asiacell[2]||cod_num==asiacell[3]||cod_num==asiacell[4]||cod_num==asiacell[5]){
                    System.out.println(" The number is Asiacell");

        }
            else if(cod_num==zain[0]||cod_num==zain[1]||cod_num==zain[2]||cod_num==zain[3]||cod_num==zain[4]){
            System.out.println("THe phone number is zain");
        }

        else{
            System.out.println("Sorry The code number is wrong");}
        }catch (Exception ex){
            System.out.println(" Sorry The phone  number  incorrect !!! ");
        } }}



