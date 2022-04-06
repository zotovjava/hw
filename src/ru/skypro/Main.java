package ru.skypro;

public class Main {

    public static void main(String[] args) {






                //Задание 1 (пока не разобрался как добавить русский язык в консоль, поэтому пока на англ.)
                int clientOS = 0;
                if (clientOS == 0) {
                    System.out.println("Z1 - Install the iOS version of the app by following the link");
                } else if (clientOS == 1) {
                    System.out.println("Z1 - Install the Android version of the app by following the link");
                }
                //Задание 2
                int clientOS1 = 1;
                int clientDeviceYear = 2020;
                if (clientOS1 == 0 && clientDeviceYear >= 2015) {
                    System.out.println("Z2 - Install the iOS version of the app by following the link");
                }
                if (clientOS1 == 0 && clientDeviceYear < 2015) {
                    System.out.println("Z2 - Install the iOS light-version of the app by following the link");
                }
                if (clientOS1 == 1 && clientDeviceYear >= 2015) {
                    System.out.println("Z2- Install the Android version of the app by following the link");
                }
                if (clientOS1 == 1 && clientDeviceYear < 2015) {
                    System.out.println("Z2 - Install the Android light-version of the app by following the link");
                }
                //Задание 3
                int year = 2022;
                if ((year % 4 == 0) && (year % 100 != 0) || (year % 400 == 0)) {
                    System.out.println("Z3 - leap year");
                } else {
                    System.out.println("Z3 - non - leap year");
                }
                //Задание 4
                int deliveryDistance = 20;
                if (deliveryDistance <= 20) {
                    System.out.println("Z4 - need 1 day");
                } else if (deliveryDistance > 20 && deliveryDistance < 60) {
                    System.out.println("Z4 - need 2 days");
                } else if (deliveryDistance >= 60 && deliveryDistance <= 100) {
                    System.out.println("Z4 - need 3 days");
                }
                //Задание 5
                int monthNumber = 10;
                switch (monthNumber) {
                    case 12:
                    case 1:
                    case 2:
                        System.out.println("Z5 - winter");
                        break;
                    case 3:
                    case 4:
                    case 5:
                        System.out.println("Z5 - spring");
                        break;
                    case 6:
                    case 7:
                    case 8:
                        System.out.println("Z5 - summer");
                        break;
                    case 9:
                    case 10:
                    case 11:
                        System.out.println("Z5 - autumn");
                        break;
                    case 13:
                }

            }

        }





