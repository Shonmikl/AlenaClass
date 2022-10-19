package inheritant;

class ChessItem {
    boolean colour = true;
    String name;

    public ChessItem(boolean colour, String name, int x, int y) {
        this.colour = colour;
        this.name = name;
        this.x = x;
        this.y = y;
    }

    public ChessItem() {
    }

    public ChessItem(String name, int x, int y) {
        this.name = name;
        this.x = x;
        this.y = y;
    }

    int x;
    int y;

    int move(int x, int y) {
        return x + y;
    }

    int eat(int x, int y) {
        return x * y;
    }
}

class Rook extends ChessItem {

    public Rook(boolean colour, String name, int x, int y) {
        super(colour, name, x, y);
    }
    @Override
    int move(int x, int y) {
        return (x + y) * 1000;
    }

    void init() {
        System.out.println(super.move(5, 5));
    }
}

class Test {
    public static void main(String[] args) {
        ChessItem chessItem = new ChessItem(true,"king", 1, 5);
        ChessItem chessItem1 = new ChessItem();

        System.out.println(chessItem.move(5, 5));

        Rook rook = new Rook(true, "rook", 2, 3);
        System.out.println(rook.move(5, 5));

        rook.init();
    }
}