package HW1;

public class Cat implements Wall, Track{
    private String name;
    private int catHeightJump;
    private int catLenghtRun;

    public Cat(String name, int catHeightJump, int catLenghtRun) {
        this.name = name;
        this.catHeightJump = catHeightJump;
        this.catLenghtRun = catLenghtRun;
    }

    @Override
    public void runTrack() {
        if (catLenghtRun < Track.trackLenght){
        System.out.printf("%s не пробежал дистанцию \n", name);}
    else{
        System.out.printf("%s пробежал дистанцию \n", name);
    }

    }

    @Override
    public void jumpWall() {
        if (catHeightJump < Wall.wallHeight){
        System.out.printf("%s не перепрыгнул стену \n", name);}
        else{
            System.out.printf("%s перепрыгнул стену \n", name);
        }

    }

}
