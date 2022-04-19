package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Задание 1
          String firstName = "Ivan";
          String middleName = "Ivanovich";
          String lastName = "Ivanov";
          String fullName = lastName + " " + firstName + " " + middleName;
          System.out.println ("ФИО сотрудника — "+ fullName);

        //Задание 2
        String upper = fullName.toUpperCase();
        System.out.println ("Данные ФИО сотрудника для заполнения отчета — "+ upper);

        //Задание 3
        fullName = "Иванов Семён Семёныч";
        String fullNameReplace = fullName.replace('ё', 'е');
        System.out.println ("Данные ФИО сотрудника — "+ fullNameReplace);


//        String street = "Манежная";
//        street = street + " площадь";
//        System.out.println ("Адрес магазина – " + street);
//
//        String phone = "+960-415 75-37";
//        phone=phone.replace("-", "");
//        phone = phone.replace(" ", "");
//        phone = phone.replace("+", "");
//        if (phone.length() == 10) {
//            phone = "7" + phone;
//        }else if (phone.length() > 11) {
//            throw new RuntimeException("Телефон слишком длинный");
//        } else if (phone.length() < 10) {
//            throw new RuntimeException("Телефон слишком короткий");
//        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
//            throw new RuntimeException("Среди нас посторонний!");
//        }
//        System.out.println("phone = " + phone);
//        String expectedPhone = "79604157537";
//        if (phone.equals(expectedPhone)) {
//            System.out.println("Успех");
//        } else {
//            System.out.println("Неудача");

    }
}
