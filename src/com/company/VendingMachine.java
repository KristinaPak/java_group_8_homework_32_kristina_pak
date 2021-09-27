package com.company;

import java.util.Scanner;

public class VendingMachine {
    static int money = 0;

    public static void menu(){
        System.out.println("              В автомате доступны");
        String f = "|%25s|%10s|%10s|";
        System.out.println("+-------------------------+----------+----------+");
        System.out.println(String.format(f, "товар", "цена", "количество"));
        System.out.println("+-------------------------+----------+----------+");
        System.out.println(String.format(f,GOODS.SODA.getDescription(), GOODS.SODA.getPrice(), GOODS.SODA.getAmount()));
        System.out.println(String.format(f, GOODS.CANDY.getDescription(), GOODS.CANDY.getPrice(), GOODS.CANDY.getAmount()));
        System.out.println(String.format(f, GOODS.WATER.getDescription(), GOODS.WATER.getPrice(), GOODS.WATER.getAmount()));
        System.out.println(String.format(f, GOODS.CHEEPS.getDescription(), GOODS.CHEEPS.getPrice(), GOODS.CHEEPS.getAmount()));
        System.out.println(String.format(f, GOODS.CHOCOLATE_BAR.getDescription(), GOODS.CHOCOLATE_BAR.getPrice(), GOODS.CHOCOLATE_BAR.getAmount()));
        System.out.println("+-------------------------+----------+----------+");
        actions();
    }

    static void actions() throws IllegalArgumentException {
        String f = "|%25s|%10s|%10s|";
        Scanner s = new Scanner(System.in);


        System.out.println("Что хотите сделать:");
        System.out.println("1 - закинуть монет");
        System.out.println("2 - купить товар");
        System.out.println("3 - выйти");
        int h = s.nextInt();
        if (h == 1) {
            addMoney();
            System.out.println("На вашем счету " + money + " монет");
            menu();
            actions();
        } else if (h == 2) {
            System.out.println("Что хотите купить?(введите кнопку)");
            String frm = "|%25s|%5s|%3s|%3s|";
            System.out.println("+-------------------------+-----+---+---+");
            System.out.println(String.format(frm,GOODS.SODA.getDescription() ,GOODS.SODA.getPrice() , " - " , GOODS.SODA.getButton()));
            System.out.println(String.format(frm,GOODS.CANDY.getDescription() , GOODS.CANDY.getPrice(), " - " , GOODS.CANDY.getButton()));
            System.out.println(String.format(frm,GOODS.WATER.getDescription() , GOODS.WATER.getPrice(), " - " , GOODS.WATER.getButton()));
            System.out.println(String.format(frm,GOODS.CHEEPS.getDescription() , GOODS.CHEEPS.getPrice(), " - " , GOODS.CHEEPS.getButton()));
            System.out.println(String.format(frm,GOODS.CHOCOLATE_BAR.getDescription() , GOODS.CHOCOLATE_BAR.getPrice(), " - " , GOODS.CHOCOLATE_BAR.getButton()));
            System.out.println("+-------------------------+-----+---+---+");
            int bg = s.nextInt();
            if (bg == 1){
                System.out.println("          Вы купили газировку");
                System.out.println("+-------------------------+----------+----------+");
                System.out.println(String.format(f, "товар", "цена", "количество"));
                System.out.println("+-------------------------+----------+----------+");
                System.out.println(String.format(f,GOODS.SODA.getDescription(), GOODS.SODA.getPrice(), GOODS.SODA.getAmount() - 1));
                System.out.println(String.format(f, GOODS.CANDY.getDescription(), GOODS.CANDY.getPrice(), GOODS.CANDY.getAmount()));
                System.out.println(String.format(f, GOODS.WATER.getDescription(), GOODS.WATER.getPrice(), GOODS.WATER.getAmount()));
                System.out.println(String.format(f, GOODS.CHEEPS.getDescription(), GOODS.CHEEPS.getPrice(), GOODS.CHEEPS.getAmount()));
                System.out.println(String.format(f, GOODS.CHOCOLATE_BAR.getDescription(), GOODS.CHOCOLATE_BAR.getPrice(), GOODS.CHOCOLATE_BAR.getAmount()));
                System.out.println("+-------------------------+----------+----------+");
                menu();
                actions();
            } else if (bg == 2) {
                System.out.println("          Вы купили конфету");
                System.out.println("+-------------------------+----------+----------+");
                System.out.println(String.format(f, "товар", "цена", "количество"));
                System.out.println("+-------------------------+----------+----------+");
                System.out.println(String.format(f,GOODS.SODA.getDescription(), GOODS.SODA.getPrice(), GOODS.SODA.getAmount() ));
                System.out.println(String.format(f, GOODS.CANDY.getDescription(), GOODS.CANDY.getPrice(), GOODS.CANDY.getAmount()-1));
                System.out.println(String.format(f, GOODS.WATER.getDescription(), GOODS.WATER.getPrice(), GOODS.WATER.getAmount()));
                System.out.println(String.format(f, GOODS.CHEEPS.getDescription(), GOODS.CHEEPS.getPrice(), GOODS.CHEEPS.getAmount()));
                System.out.println(String.format(f, GOODS.CHOCOLATE_BAR.getDescription(), GOODS.CHOCOLATE_BAR.getPrice(), GOODS.CHOCOLATE_BAR.getAmount()));
                System.out.println("+-------------------------+----------+----------+");
                menu();
                actions();
            } else if (bg == 3) {
                System.out.println("             Вы купили воду");
                System.out.println("+-------------------------+----------+----------+");
                System.out.println(String.format(f, "товар", "цена", "количество"));
                System.out.println("+-------------------------+----------+----------+");
                System.out.println(String.format(f,GOODS.SODA.getDescription(), GOODS.SODA.getPrice(), GOODS.SODA.getAmount() ));
                System.out.println(String.format(f, GOODS.CANDY.getDescription(), GOODS.CANDY.getPrice(), GOODS.CANDY.getAmount()));
                System.out.println(String.format(f, GOODS.WATER.getDescription(), GOODS.WATER.getPrice(), GOODS.WATER.getAmount()-1));
                System.out.println(String.format(f, GOODS.CHEEPS.getDescription(), GOODS.CHEEPS.getPrice(), GOODS.CHEEPS.getAmount()));
                System.out.println(String.format(f, GOODS.CHOCOLATE_BAR.getDescription(), GOODS.CHOCOLATE_BAR.getPrice(), GOODS.CHOCOLATE_BAR.getAmount()));
                System.out.println("+-------------------------+----------+----------+");
                menu();
                actions();
            } else if (bg == 4) {
                System.out.println("          Вы купили чипсы");
                System.out.println("+-------------------------+----------+----------+");
                System.out.println(String.format(f, "товар", "цена", "количество"));
                System.out.println("+-------------------------+----------+----------+");
                System.out.println(String.format(f,GOODS.SODA.getDescription(), GOODS.SODA.getPrice(), GOODS.SODA.getAmount() ));
                System.out.println(String.format(f, GOODS.CANDY.getDescription(), GOODS.CANDY.getPrice(), GOODS.CANDY.getAmount()));
                System.out.println(String.format(f, GOODS.WATER.getDescription(), GOODS.WATER.getPrice(), GOODS.WATER.getAmount()));
                System.out.println(String.format(f, GOODS.CHEEPS.getDescription(), GOODS.CHEEPS.getPrice(), GOODS.CHEEPS.getAmount()-1));
                System.out.println(String.format(f, GOODS.CHOCOLATE_BAR.getDescription(), GOODS.CHOCOLATE_BAR.getPrice(), GOODS.CHOCOLATE_BAR.getAmount()));
                System.out.println("+-------------------------+----------+----------+");
                menu();
                actions();
            } else if (bg == 5) {
                System.out.println("        Вы купили шоколадный батончик");
                System.out.println("+-------------------------+----------+----------+");
                System.out.println(String.format(f, "товар", "цена", "количество"));
                System.out.println("+-------------------------+----------+----------+");
                System.out.println(String.format(f,GOODS.SODA.getDescription(), GOODS.SODA.getPrice(), GOODS.SODA.getAmount() ));
                System.out.println(String.format(f, GOODS.CANDY.getDescription(), GOODS.CANDY.getPrice(), GOODS.CANDY.getAmount()));
                System.out.println(String.format(f, GOODS.WATER.getDescription(), GOODS.WATER.getPrice(), GOODS.WATER.getAmount()));
                System.out.println(String.format(f, GOODS.CHEEPS.getDescription(), GOODS.CHEEPS.getPrice(), GOODS.CHEEPS.getAmount()));
                System.out.println(String.format(f, GOODS.CHOCOLATE_BAR.getDescription(), GOODS.CHOCOLATE_BAR.getPrice(), GOODS.CHOCOLATE_BAR.getAmount()-1));
                System.out.println("+-------------------------+----------+----------+");
                menu();
                actions();
            } else {
                throw new  IllegalArgumentException("Введен неверный символ");
            }
        } else if(h == 3) {
            System.out.println("Спасибо, приходите еще");
        } else{
            throw new  IllegalArgumentException("Введен неверный символ");
        }
    }

    public static void addMoney(){
        System.out.print(String.format("У вас сейчас %s на сколько хотите пополнить ", money));
        Scanner s = new Scanner(System.in);

        Integer moneyOne = s.nextInt();
        money = money + moneyOne;
        System.out.println("-------------------Вы пополнили "+ money + "---------------");
    }

}
