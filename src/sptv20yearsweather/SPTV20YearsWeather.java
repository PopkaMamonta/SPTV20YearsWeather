
package sptv20yearsweather;

import java.util.Random;


public class SPTV20YearsWeather {
    public static enum month{
        Январь,Февраль,Март,Апрель,Май,Июнь,Июль,Август,Сентябрь,Октябрь,Ноябрь,Декабрь
    }
    public static void main(String[] args) {
        Random random=new Random();
        int min=-20,max=20,dayInMonth=0;
        int[][] yearWeather=new int[12][];
        System.out.print("         ");
        for (int i = 0; i < 31; i++) {
            System.out.printf("%4d",i+1);
        }
        System.out.println("");
        System.out.print("         ");
        for (int i = 0; i < 125; i++) {
            System.out.print("-");
        }
        System.out.println("");
        yearWeather[0]=new int[31];
        yearWeather[1]=new int[28];
        yearWeather[2]=new int[31];
        yearWeather[3]=new int[30];
        yearWeather[4]=new int[31];
        yearWeather[5]=new int[30];
        yearWeather[6]=new int[31];
        yearWeather[7]=new int[30];
        yearWeather[8]=new int[31];
        yearWeather[9]=new int[30];
        yearWeather[10]=new int[31];
        yearWeather[11]=new int[30];
        for (int i = 0; i < yearWeather.length; i++) {
            double mid=0,sum=0;
            switch (i) {
                case 0:min=-20;max=-5;dayInMonth=31;break;
                case 1:min=-15;max=0;dayInMonth=28;break;
                case 2:min=-10;max=5;dayInMonth=31;break;
                case 3:min=-5;max=10;dayInMonth=30;break;
                case 4:min=0;max=15;dayInMonth=31;break;
                case 5:min=5;max=20;dayInMonth=30;break;
                case 6:min=10;max=25;dayInMonth=31;break;
                case 7:min=10;max=20;dayInMonth=30;break;
                case 8:min=0;max=15;dayInMonth=31;break;
                case 9:min=-5;max=10;dayInMonth=30;break;
                case 10:min=-10;max=5;dayInMonth=31;break;
                case 11:min=-15;max=0;dayInMonth=30;break;
                
            }
            System.out.printf("%8s:",month.values()[i]);
            for (int j = 0; j < yearWeather[i].length; j++) {
                yearWeather[i][j]=random.nextInt(max-min+1)+min;
                sum+=yearWeather[i][j];
                System.out.printf("%4d",yearWeather[i][j]);
            }
            mid=sum/dayInMonth;
            switch(dayInMonth){
                case 28:
                    System.out.printf("               |Middle temperature: %.2f",mid);
                    break;
                case 31:
                    System.out.printf("   |Middle temperature: %.2f",mid);
                    break;
                default:
                    System.out.printf("       |Middle temperature: %.2f",mid);
                    break;
            }
            System.out.println();
        }
    }
    
}
