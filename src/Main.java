import java.util.ArrayList;

public class Main {
    private static ArrayList<Street> streets = new ArrayList<>();
    public static void main(String[] args) {

    }
    public static int getLength(){
        ArrayList<Coordinate> coords = new ArrayList<>();
        for (int x = 0; x< 3; x++){
            for (int y = 0)
        }

        return -1;
    }
    int recGetLength(Coordinate coord, int limit, int currentPath){
        if(coord.isNotValid()){
            return -1;
        }
        int shortestPath = Integer.MAX_VALUE;
        for (Direction dir :Direction.values()) {
            shortestPath = Math.min(shortestPath, recGetLength(coord.moveTo(dir), limit, ))
        }
    }
    public static class Coordinate {
        public int x;
        public int y;
        public boolean isNotValid(){
            return x< 0 && y < 0 && x>3 && y>3;
        }
        public Coordinate moveTo(Direction dir){
            switch(dir){
                case UP: return new Coordinate(x, y+1);
                case RIGHT: return new Coordinate(x+1, y);
                case DOWN: return new Coordinate(x, y-1);
                case LEFT: return new Coordinate(x-1, y);
            }
        }
        public class Street{

        }
    }
    public static enum Direction{
        UP, RIGHT, DOWN, LEFT;
    }
}