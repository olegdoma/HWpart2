package HW1;

public class Main {
    public static void main(String[] args) {


Track[] tracks = {
        new Cat("Барсик", 5, 30),
        new Human("Василий", 6, 40),
        new Robot("Вертер", 7, 130),
};
        for (Track t : tracks) {
            t.runTrack();
        }
Wall[] walls ={
        new Cat("Барсик", 5, 30),
        new Human("Василий", 6, 40),
        new Robot("Вертер", 7, 130),
};
        for (Wall w : walls) {
            w.jumpWall();
        }




    }
}
