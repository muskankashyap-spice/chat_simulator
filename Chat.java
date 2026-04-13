import java.time.LocalTime;

class Message {
    String sender;
    String content;
    String time;

    Message(String s, String c) {
        sender = s;
        content = c;
        time = LocalTime.now().toString();
    }

    void show() {
        System.out.println("[" + time + "] " + sender + ": " + content);
    }
}

class ChatRoom {
    Message[] messages = new Message[10];
    int count = 0;

    void send(String sender, String content) {
        messages[count] = new Message(sender, content);
        count++;
    }

    void display() {
        for (int i = 0; i < count; i++) {
            messages[i].show();
        }
    }
}

public class Chat {
    public static void main(String[] args) {
        ChatRoom room = new ChatRoom();

        room.send("Swati", "Hello");
        room.send("Muskan", "Hi");
        room.send("Swati", "How are you?");

        room.display();
    }
}