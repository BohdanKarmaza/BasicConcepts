package ua.kh.karmaza.bohdan;

public class SamsungPhone extends Phone implements PhoneConnection, PhoneMedia {

    public SamsungPhone(String name, String model, String ROM, String RAM) {
        super(name, model, ROM, RAM);
    }

    @Override
    public void makePhoto() {
        System.out.println("Photo saved");
    }

    @Override
    public void record() {
        System.out.println("Video is recorded");
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
