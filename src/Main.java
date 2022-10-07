import com.java.modelAbstractFactory.*;

public class Main {
    public static void main(String[] args) {
        FurnitureAbstractFactory factory = FurnitureFactory.getFactory(MaterialType.WOOD);

        Chair chair = factory.createChair();
        chair.create();
        Table table = factory.createTable();
        table.create();

        IInterFace123 doituong = null;
    }
}
