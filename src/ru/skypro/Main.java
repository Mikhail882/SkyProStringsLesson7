package ru.skypro;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //������� 1
          String firstName = "Ivan";
          String middleName = "Ivanovich";
          String lastName = "Ivanov";
          String fullName = lastName + " " + firstName + " " + middleName;
          System.out.println ("��� ���������� � "+ fullName);

        //������� 2
        String upper = fullName.toUpperCase();
        System.out.println ("������ ��� ���������� ��� ���������� ������ � "+ upper);

        //������� 3
        fullName = "������ ���� ������";
        String fullNameReplace = fullName.replace('�', '�');
        System.out.println ("������ ��� ���������� � "+ fullNameReplace);


//        String street = "��������";
//        street = street + " �������";
//        System.out.println ("����� �������� � " + street);
//
//        String phone = "+960-415 75-37";
//        phone=phone.replace("-", "");
//        phone = phone.replace(" ", "");
//        phone = phone.replace("+", "");
//        if (phone.length() == 10) {
//            phone = "7" + phone;
//        }else if (phone.length() > 11) {
//            throw new RuntimeException("������� ������� �������");
//        } else if (phone.length() < 10) {
//            throw new RuntimeException("������� ������� ��������");
//        } else if (phone.length() == 11 && phone.charAt(0) != '7') {
//            throw new RuntimeException("����� ��� �����������!");
//        }
//        System.out.println("phone = " + phone);
//        String expectedPhone = "79604157537";
//        if (phone.equals(expectedPhone)) {
//            System.out.println("�����");
//        } else {
//            System.out.println("�������");

    }
}
