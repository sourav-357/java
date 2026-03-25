package Section8_Encapsulation_polymorphism.Composition_Room;

public class Main {

     public static void main(String[] args) {
          Wall wall = new Wall(6, "Solid smth", "Yellow", true);
          Furniture furniture = new Furniture("Brown", "Wood", true);

          Lights lights = new Lights(8, "6400K", new GarlandLights("Red", true, 2.3f));
          Room zbyszkoRoom = new Room(wall, furniture, lights);

          zbyszkoRoom.flexWithGarland();
          furniture.movingFurn("table");
          zbyszkoRoom.moving1Obj();
          wall.punchWall();

          System.out.println("The furniture color is " + zbyszkoRoom.getFurniture().getPrimaryColor());

     }
}
