package nested.nested.ex1;

public class Network {
    public void sendMessage(String text) {
        new NetworkMessage(text).print();
    }
}
