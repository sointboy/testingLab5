package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products ={"Молоко","Хлеб","Крупа"};
        int[] prices = {50,25,15};

        int[]prod = new int[products.length];

        int sumProduct=0;
        int currentprice=0;
        int prodnum=0;
        int prodcount=0;

        for(int i=0; i < products.length; i++){
            System.out.println(i+ 1+ ". " + products[i]+ " - " + prices[i] + " рублей");
        }
        while (true){
            System.out.println("Введите номер продукта и его количество:");
            String input = scanner.nextLine();
            if(input.equals("end")){
                break;
            }
            String[]cart=input.split(" ");
            prodnum=Integer.parseInt(cart[0])-1;
            prodcount= Integer.parseInt(cart[1]);

            prod[prodnum]=prodcount;

            currentprice=prices[prodnum];

            sumProduct=sumProduct+prod[prodnum]*currentprice;
        }
        for (int i = 0; i<products.length;i++){
            if(prod[i]>0){
                System.out.println("Товар: " + products[i]+" Цена " + prices[i]+ " Кол-во " + prod[i]+ " Сумма - " + prices[i]*prod[i] + " рублей");
            }
        }
        System.out.println("Сумма - " + sumProduct+ " рублей");
    }
}