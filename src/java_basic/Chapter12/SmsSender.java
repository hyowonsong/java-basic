package java_basic.Chapter12;

public class SmsSender implements Sender{

    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
