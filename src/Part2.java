// Interface defining a contract for playable items
interface Playable {
    void play(); // Abstract method to be implemented by classes
}

// Guitar class that implements the Playable interface
class Guitar implements Playable {
    private String title; // Name or brand of the guitar

    // Constructor to initialize the guitar title
    public Guitar(String title) {
        this.title = title;
    }

    // Implementation of the play method from Playable interface
    @Override
    public void play() {
        System.out.println("Play Guitar: " + title);
    }
}

// Piano class that implements the Playable interface
class Piano implements Playable {
    private String filename; // Track name or sheet music filename

    // Constructor to initialize the piano track/filename
    public Piano(String filename) {
        this.filename = filename;
    }
    public void play() {
        System.out.println("Play Piano: " + filename);
    }
}

// Main class to execute and test the polymorphic behavior
class Part2 {
    public static void main(String[] args) {
        // Polymorphic array storing different implementations of Playable
        Playable[] list = {
                new Guitar("Strukalo"),
                new Piano("I'm still standing")
        };

        // Iterate through the array and invoke the play method on each object
        for (Playable item : list) {
            item.play(); // Dynamically calls the correct play() method at runtime
        }
    }
}
