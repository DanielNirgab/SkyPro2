import java.sql.SQLOutput;

public class Griffindor extends HogwartsStudents {
// Всем Гриффиндорцам присущи благородство, честь и храбрость.
//Гарри Поттер, Гермиона Грейнджер и Рон Уизли учатся на факультете Гриффиндор.
    private int nobleness;
    private int honor;
    private int courage;

    Griffindor (String fullName, int magicPower, int teleportDistance, int nobleness, int honor, int courage) {
        super(fullName, magicPower, teleportDistance);
        this.nobleness = nobleness;
        this.honor = honor;
        this.courage = courage;
    }

    public int getNobleness() {
        return nobleness;
    }

    public int getHonor() {
        return honor;
    }

    public int getCourage() {
        return courage;
    }

    public static void showGriffindorStudents(Griffindor [] griffindorStudents) {
        System.out.println();
        System.out.println("Студенты Гриффиндора:");
        System.out.println("Всем Гриффиндорцам присущи благородство, честь и храбрость");
        for (int i = 0; i < griffindorStudents.length; i++) {
            System.out.println("У Студента - " + griffindorStudents[i].toString() +
                    " Благородство: " + griffindorStudents[i].nobleness +
                    " Честь: " + griffindorStudents[i].honor +
                    " Храбрость: " + griffindorStudents[i].courage);
        }
    }

    public static void checkBestStudent(Griffindor[] griffindors) {
        int bestScore = 0;
        int score = 0;
        String bestStudentName = null;
        for (int i = 0; i < griffindors.length; i++) {
            score = griffindors[i].getMagicPower()+griffindors[i].getTeleportDistance()+
                    + griffindors[i].getNobleness() + griffindors[i].getHonor() + griffindors[i].getCourage();
            if (bestScore < score){
                bestScore = score;
                bestStudentName = griffindors[i].getFullName();
            }
        }
        System.out.println("Лучший студент Грифиндора: " + bestStudentName + " с колличеством очков = " + bestScore);
    }



}
