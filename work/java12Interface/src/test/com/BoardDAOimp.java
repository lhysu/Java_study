package test.com;

public class BoardDAOimp implements BoardDAO, BoardDAO2 {
    @Override
    public int insert() {
        System.out.println("BoardDAOimp...insert()...");
        return 0;
    }

    @Override
    public int update() {
        System.out.println("BoardDAOimp...update()...");
        return 0;
    }
}
