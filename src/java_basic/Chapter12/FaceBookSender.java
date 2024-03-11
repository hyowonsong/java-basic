package java_basic.Chapter12;

public class FaceBookSender implements Sender {
    @Override
    public void sendMessage(String message){
        System.out.println(message);
    }
}
