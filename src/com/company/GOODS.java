package com.company;

public enum GOODS {
        CHOCOLATE_BAR((35), ((int)(Math.random()*50)), (5),"Шоколадный батончик"),
        CHEEPS((60), ((int)(Math.random()*50)), (4),"Чипсы"),
        WATER((18), ((int)(Math.random()*50)), (3),"Вода"),
        CANDY((45), ((int)(Math.random()*50)),(2), "Конфета"),
        SODA((35),((int)(Math.random()*50)), (1),"Газировка");

        private String description;
        private int price ;
        private int amount ;
        private int button;

        GOODS(int price, int amount, int button, String description) {
            this.description = description;
            this.price = price;
            this.amount = amount;
            this.button = button;
        }

        public String getDescription() {
                return description;
        }

        public int getAmount() {
                return amount;
        }

        public int getPrice() {
                return price;
        }

        public int getButton() {
                return button;
        }
}
