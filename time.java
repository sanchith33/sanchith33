class Time {
    int seconds;

    Time(int seconds) {
        this.seconds = seconds;
    }

    Time(int minutes, int seconds) {
        this.seconds = minutes * 60 + seconds;
    }

    Time(int hours, int minutes, int seconds) {
        this.seconds = hours * 3600 + minutes * 60 + seconds;
    }

    void display() {
        System.out.println("Total time in seconds: " + seconds);
        System.out.println("Time in minutes: " + (seconds / 60));
        System.out.println("Time in hours: " + (seconds / 3600));
    }

    public static void main(String[] args) {
        Time t1 = new Time(120);
        Time t2 = new Time(2, 30);
        Time t3 = new Time(1, 30, 45);

        System.out.println("Time 1:");
        t1.display();

        System.out.println("\nTime 2:");
        t2.display();

        System.out.println("\nTime 3:");
        t3.display();
    }
}
