class Room {
    String name;
    Room(String name) { this.name = name; }
}
public class CompositionDemo {
    Room room;
    public CompositionDemo() { this.room = new Room("Living"); }
    public static void main(String[] args) {
        CompositionDemo h = new CompositionDemo();
        System.out.println(h.room.name);
    }
}
