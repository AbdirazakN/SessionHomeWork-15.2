import java8.announcement.Annoucement;
import java8.devices.Laptop;
import java8.devices.Phone;
import java8.home.Home;
import java8.transport.Airplane;
import java8.transport.Car;
import java8.transport.Helicopter;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // * 1. java -8  деген пакет ачып анын ичине announcement, home, transport, devices деген пакеттерди тузунуз.
        //* 2. announcement пакетинде Announcement деген класс тузунуз.Анын полялары:
        //* { private  String name; private String image; private double price; private String description; }
        //* 3.Devices пакетинин ичинде Announcement ти мурасстаган Phone(){ private String product;
        //* private int memory; },Laptop(){ private String operatingSystem; } деген  касстарды тузунуз!
        //* 4.home пакетинин ичинде Home(){ private String homeType; private int maxGuest;} деген класс ачыныз.
        //* 5.transport пакетинин ичинде Car(){ private String colour; private LocalDate yearOfIssue; }
        //* final class Airplane(){ Car классын extends кылсын озунун полясы жок } Helicopter (){ Airplane классын мурастасын }
        //* деген класс тузунуз. Laptop,Phone,Home,Airplane,Car,Helicopter  ар бирине 2 ден объект тузуп,
        //* поляларын     толтурунуз.Methods : 1- Announcement  классынын ичинде public static double maxPrice(double price1,
        // double price2){ } метод тузунуз метод тузунуз
        // *  2-public static void findByPrice(int price ,Phone[]phones,Laptop[]laptops,Home[]homes,Car[]cars,Helicopter[]helicopters){
        // *      бул метод  консолдон баасын берсек ошол баасы бар бардык обектерди консолго чыгарып берсин }
        // *  3-public static void findByName(String name ,Phone[]phones,Laptop[]laptops,Home[]homes,Car[]cars,Helicopter[]helicopters){
        // *      бул метод консолдон атын жазсак ошол  обектер чыгышы керек */

        Phone phone1 = new Phone("Iphone","\uD83D\uDE0E",50000,"Amazing phone","14 PRO Max",256);
        Phone phone2 = new Phone("Samsung","\uD83E\uDD29",52500,"Great phone","S21",128);
        Phone[] phones = {phone1,phone2};

        Laptop laptop1 = new Laptop("MacBook", "\uD83D\uDE0D",129000,"Wonderful laptop","Mac OS");
        Laptop laptop2 = new Laptop("Acer", "\uD83E\uDD16",1520000,"Productive laptop","Windows");
        Laptop[] laptops = {laptop1,laptop2};

        Home home1 = new Home("Ihlas","\uD83C\uDFE2",3500000,"Great Home","Multi-storey",10);
        Home home2 = new Home("Chaos","\uD83C\uDFE0",12000000,"Amazing Home","House",25);
        Home[] homes = {home1,home2};

        Car car1 = new Car("Mercedes-Benz","\uD83D\uDE98",15000000,"Wonderful Car","Black", LocalDate.of(2010,3,6));
        Car car2 = new Car("BMW","\uD83D\uDE99",170000,"Fast Car","Purple", LocalDate.of(2020,8,28));
        Car[] cars = {car1,car2};

        Airplane airplane1 = new Airplane("Supermarine Spitfire","\uD83D\uDEE9",125000000,"Fast Airplane","White", LocalDate.of(2015,1,14));
        Airplane airplane2 = new Airplane("Airbus A320","✈️",23000000,"Large Airplane","Blue", LocalDate.of(2004,11,16));
        Airplane[] airplanes = {airplane1,airplane2};

        Helicopter helicopter1 = new Helicopter("MD 500 Defender","\uD83D\uDE81",13500000,"Fast Helicopter","Brown",LocalDate.of(2012,12,23));
        Helicopter helicopter2 = new Helicopter("Boeing AH-64 Apache","\uD83D\uDE81",115000000,"Large Helicopter","Red",LocalDate.of(1999,7,9));
        Helicopter[] helicopters = {helicopter1,helicopter2};

        Annoucement[] annoucements = {phone1,phone2,laptop1,laptop2,home1,home2,car1,car2,helicopter1,helicopter2,airplane1,airplane2};

        findByPrice (12000000,annoucements);
        findByName("Ihlas",annoucements);
        findMaxPrice(annoucements);
        findMinPrice(annoucements);
        findByCategory("Home",annoucements);
        findByOperatingSystem("Windows",laptops);
        findByMemory(128,phones);
        findBySymbol('A',annoucements);
    }

    public static void findByPrice(double price, Annoucement[] annoucements){

        for (Annoucement annoucement:annoucements) {
            if (annoucement.getPrice() == price){
                System.out.println("  Find by price:  "+annoucement);
            }
        }
    }
    public static void findByName(String name, Annoucement[] annoucements){
        for (Annoucement annoucement:annoucements) {
            if (annoucement.getName() == name){
                System.out.println("  Find by name: "+annoucement);
            }
        }
    }
    public static void findMaxPrice(Annoucement[] annoucements){
        long maxPrice = 0;
        for (Annoucement annoucement:annoucements) {
            maxPrice = (long) Math.max(annoucement.getPrice(),maxPrice);
        }
        System.out.println("  The highest price is:  "+maxPrice);
        for (Annoucement annoucement:annoucements) {
            if (annoucement.getPrice() == maxPrice) {
                System.out.println(annoucement);
            }
        }
    }
    public static void findMinPrice(Annoucement[] annoucements){
        long minPrice = (long) annoucements[0].getPrice();
        for (int i = 0;i < annoucements.length;i++) {
            minPrice = (long) Math.min(annoucements[i].getPrice(),minPrice);
        }
        System.out.println("  The lowest price is:  "+minPrice);
        for (Annoucement annoucement:annoucements) {
            if (annoucement.getPrice() == minPrice) {
                System.out.println(annoucement);
            }
        }
    }
    public static void findByCategory(String category,Annoucement[] annoucements){

        if (annoucements.getClass().equals(annoucements)){
            for (Annoucement annoucement:annoucements) {
                    System.out.println("  Find by Category:  "+annoucement);
                }
        }
    }
    public static void findByOperatingSystem(String operatingSystem, Laptop[] laptops){
            for (Laptop laptop:laptops) {
                if (laptop.getOperatingSystem() == operatingSystem){
                    System.out.println("  Find laptop by OS:  "+laptop);
            }
        }
    }

    public static void findByMemory(int memory,Phone[] phones){
        for (Phone phone:phones) {
            if (phone.getMemory() == memory){
                System.out.println("  Find phone by memory:  "+phone);
            }
        }
    }
    public static void findBySymbol(char symbol,Annoucement[] announcements){
        for (Annoucement annoucement:announcements) {
            if (annoucement.getName().charAt(0) == symbol){
                System.out.println("  Find  announcements by Alphabet:  "+annoucement);
            }
        }
    }
}