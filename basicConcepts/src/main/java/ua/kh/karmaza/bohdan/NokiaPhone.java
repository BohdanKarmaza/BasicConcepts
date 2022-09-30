package ua.kh.karmaza.bohdan;

public class NokiaPhone extends Phone implements PhoneConnection{
    public NokiaPhone(String name, String model, String ROM, String RAM) {
        super(name, model, ROM, RAM);
    }
    @Override
    public void call(String addressee) {
        System.out.println("Calling to " + addressee);
    }

    @Override
    public void sendMessage(String text, String addressee) {
        System.out.println("Message:'" + text + "' sent to " + addressee);
    }
}
