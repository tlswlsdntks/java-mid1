package nested.nested.ex2;

import nested.nested.ex1.NetworkMessage;

public class Network {
    static class NetworkMessage {
        private String content;

        public NetworkMessage(String content) {
            this.content = content;
        }

        public void print() {
            System.out.println(content);
        }
    }

    public void sendMessage(String text) {
        new NetworkMessage(text).print();
    }
}
