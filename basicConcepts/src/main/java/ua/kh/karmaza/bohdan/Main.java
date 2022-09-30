package ua.kh.karmaza.bohdan;

public class Main {
    public static void main(String[] args) {
    SamsungPhone SamsungPhone = new SamsungPhone("Samsung Galaxy", "s20", "128 GB", "8 GB");
        System.out.println("My Phone is " + SamsungPhone.name + " " + SamsungPhone.model);
    SamsungPhone.call("Boss");
    SamsungPhone.sendMessage("Hi, wat's up?", "Jake");
        System.out.println("Oh, what a sunset!");
    SamsungPhone.makePhoto();
        System.out.println("Wow, it's the best concert in my life");
    SamsungPhone.record();
    NokiaPhone NokiaPhone = new NokiaPhone("Nokia", "3100", "8 MB", "512 kb");
    NokiaPhone.call("Bro");
        System.out.println("Check my 'new' phone - " + NokiaPhone.name + " " + NokiaPhone.model
        + ". I lost my Samsung phone...");
    NokiaPhone.sendMessage("I lost my phone, but I still can send you a messages!", "Girlfriend");

    }
}

