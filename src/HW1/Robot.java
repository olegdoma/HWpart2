package HW1;

public class Robot implements Track,Wall {
    private String name;
    private int robotHeightJump;
    private int robotLenghtRun;

    public Robot(String name, int robotHeightJump, int robotLenghtRun) {
        this.name = name;
        this.robotHeightJump = robotHeightJump;
        this.robotLenghtRun = robotLenghtRun;
    }

    @Override
    public void runTrack() {
        if (robotLenghtRun < Track.trackLenght) {
            System.out.printf("%s не пробежал дистанцию \n", name);
        } else {
            System.out.printf("%s пробежал дистанцию \n", name);
        }

    }

    @Override
    public void jumpWall() {
        if (robotHeightJump < Wall.wallHeight) {
            System.out.printf("%s не перепрыгнул стену \n", name);
        } else {
            System.out.printf("%s перепрыгнул стену \n", name);
        }
    }
}
