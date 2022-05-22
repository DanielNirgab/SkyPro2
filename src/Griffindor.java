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

    @Override
    public String toString() {
        return super.toString()+" Всем студентам Гриффиндора присущи -" +
                " Благородство: " + nobleness +
                ", честь: " + honor +
                ", храбрость: " + courage +
                '}';
    }


    public static void showStudentInfo(Griffindor [] griffindorsStudent) {
        System.out.println("Факультет Гриффиндор:");
        for (int i = 0; i < griffindorsStudent.length; i++) {
            if (griffindorsStudent[i] != null) {
                griffindorsStudent[i].print();
            }
        }
    }

    @Override
    public int abilityFaculty() {
        return nobleness + honor + courage;
    }

    public static void checkBestStudent(Griffindor[] griffindors) {
        int bestScore = 0;
        int score = 0;
        String bestStudentName = null;
        for (int i = 0; i < griffindors.length; i++) {
            score = griffindors[i].abilityFaculty();
            if (bestScore < score){
                bestScore = score;
                bestStudentName = griffindors[i].getFullName();
            }
        }
        System.out.println("Лучший студент Грифиндора: " + bestStudentName + " с колличеством очков = " + bestScore);
    }



}
