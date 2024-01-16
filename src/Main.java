import com.workintech.composition.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("********MAKING***ROOM************");
        LampType kidroom = LampType.ROOMLAMP;
        PaintColor paintedroom = PaintColor.GREEN;
        Wall wall1 = new Wall("north");
        Wall wall2 = new Wall("south");
        Wall wall3 = new Wall("east");
        Wall wall4 = new Wall("west");
        Ceiling ceiling = new Ceiling(5,paintedroom);
        Bed bed = new Bed("Kid Bed", 1,2,2,2);
        Lamp lamp = new Lamp(kidroom,true,5);
        Wardrobe wardrobe = new Wardrobe(3,3,90);
        Carpet carpet = new Carpet(4,5,paintedroom);


        Bedroom bedroom = new Bedroom("Kid's Bedroom",wall1,wall2,wall3,wall4,ceiling,bed,lamp,wardrobe,carpet);
        bedroom.getLamp().turnOn();
        bedroom.getBed().make();
        bedroom.getCeiling().create();
        bedroom.getWall1().create();
        bedroom.getWall2().create();
        bedroom.getWall3().create();
        bedroom.getWall4().create();
    }

}