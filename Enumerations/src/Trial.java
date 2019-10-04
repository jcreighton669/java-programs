public class Trial {
    public static void main(String[] args) {
        System.out.println(Direction.valueOf("NORTH"));
        System.out.println(Direction.NORTH.toString());
        System.out.println(Direction.NORTH.getShortCode());
        System.out.println(Direction.NORTH.name());
        System.out.println(Direction.valueOf("N"));
    }
}
