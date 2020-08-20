package HW1;

public class Human implements Wall, Track {
    private String name;
    private int humanHeightJump;
    private int humanLenghtRun;

    public Human(String name, int humanHeightJump, int humanLenghtRun) {
        this.name = name;
        this.humanHeightJump = humanHeightJump;
        this.humanLenghtRun = humanLenghtRun;
    }

    @Override
    public void runTrack() {
        if (humanLenghtRun < Track.trackLenght) {
            System.out.printf("%s не пробежал дистанцию \n", name);
        } else {
            System.out.printf("%s пробежал дистанцию \n", name);
        }

    }

    @Override
    public void jumpWall() {
        if (humanHeightJump < Wall.wallHeight) {
            System.out.printf("%s не перепрыгнул стену \n", name);
        } else {
            System.out.printf("%s перепрыгнул стену \n", name);
        }
    }
}
