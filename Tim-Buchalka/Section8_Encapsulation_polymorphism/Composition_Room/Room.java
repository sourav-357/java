package Section8_Encapsulation_polymorphism.Composition_Room;

public class Room {
     private Wall wall;
     private Furniture furniture;
     private Lights lights;

     public Room(Wall wall, Furniture furniture, Lights lights) {
          this.wall = wall;
          this.furniture = furniture;
          this.lights = lights;
     }

     public void flexWithGarland() {
          getLights().getGarlandLights().pplsReaction();
     }

     public void moving1Obj() {
          furniture.movingFurn("Chair");
     }

     public Furniture getFurniture() {
          return furniture;
     }

     private Lights getLights() {
          return lights;
     }
}
