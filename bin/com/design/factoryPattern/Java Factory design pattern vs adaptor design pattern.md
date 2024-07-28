### Factory Design Pattern

**Purpose:**
The Factory Design Pattern is used to create objects without specifying the exact class of the object that will be created. It is used when the creation process is complex or when you want to decouple the client code from the object creation process.

**When to Use:**
- When the exact type of object to be created isn't known until runtime.
- When you want to provide a common interface for creating different objects.
- To encapsulate the creation logic in a single place, improving code maintainability and readability.

**Key Components:**
- **Factory:** The class that provides a method for creating objects.
- **Product:** The interface or abstract class that defines the type of objects the factory will create.
- **Concrete Products:** The concrete classes that implement the Product interface.

**Example:**
```java
// Product interface
interface Shape {
    void draw();
}

// Concrete Products
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing Square");
    }
}

// Factory
class ShapeFactory {
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        return null;
    }
}

// Client code
public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("SQUARE");
        shape2.draw();
    }
}
```

### Adapter Design Pattern

**Purpose:**
The Adapter Design Pattern allows incompatible interfaces to work together. It acts as a bridge between two incompatible interfaces by converting the interface of a class into another interface that a client expects.

**When to Use:**
- When you have an existing class whose interface doesn't match the one you need.
- To create reusable classes that can work with unrelated or unforeseen classes.
- To use a legacy class with a new interface.

**Key Components:**
- **Target:** The interface the client expects.
- **Adaptee:** The existing interface that needs to be adapted.
- **Adapter:** The class that implements the Target interface and translates calls to the Adaptee interface.

**Example:**
```java
// Target interface
interface MediaPlayer {
    void play(String audioType, String fileName);
}

// Adaptee
class AdvancedMediaPlayer {
    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: " + fileName);
    }

    public void playMp4(String fileName) {
        System.out.println("Playing mp4 file. Name: " + fileName);
    }
}

// Adapter
class MediaAdapter implements MediaPlayer {
    AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer = new AdvancedMediaPlayer();
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer = new AdvancedMediaPlayer();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if (audioType.equalsIgnoreCase("vlc")) {
            advancedMusicPlayer.playVlc(fileName);
        } else if (audioType.equalsIgnoreCase("mp4")) {
            advancedMusicPlayer.playMp4(fileName);
        }
    }
}

// Client
public class AdapterPatternDemo {
    public static void main(String[] args) {
        MediaAdapter mediaAdapter = new MediaAdapter("mp4");
        mediaAdapter.play("mp4", "example.mp4");

        mediaAdapter = new MediaAdapter("vlc");
        mediaAdapter.play("vlc", "example.vlc");
    }
}
```

### Summary
- **Factory Design Pattern** is focused on object creation and abstracts the instantiation process.
- **Adapter Design Pattern** is focused on interface compatibility and allows objects with incompatible interfaces to work together.
