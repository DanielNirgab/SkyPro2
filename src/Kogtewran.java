public class Kogtewran extends HogwartsStudents{
    // Когтевранцы умны, мудры, остроумны и полны творчества.
    // На факультете Когтевран учится Чжоу Чанг, Падма Патил и Маркус Белби.

    private int smart;
    private int wise;
    private int witty;
    private int creativity;

    Kogtewran (String fullName, int magicPower, int teleportDistance, int smart, int wise, int witty, int creativity) {
        super(fullName, magicPower, teleportDistance);
        this.smart = smart;
        this.wise = wise;
        this.witty = witty;
        this.creativity = creativity;
    }

    public int getSmart() {
        return smart;
    }

    public int getWise() {
        return wise;
    }

    public int getWitty() {
        return witty;
    }

    public int getCreativity() {
        return creativity;
    }

    @Override
    public String toString() {
        return super.toString() + " Всем студентам Когтеврана присущи -" +
                " ум: " + smart +
                ", мудрость: " + wise +
                ", остроумие: " + witty +
                ", творчество: " + creativity;
    }

    public static void showStudentInfo(Kogtewran [] kogtewransStudents) {
        System.out.println("Факультет Когтевран:");
        for (int i = 0; i < kogtewransStudents.length; i++) {
            if (kogtewransStudents[i] != null) {
                kogtewransStudents[i].print();
            }
        }
    }

    @Override
    public int abilityFaculty() {
        return smart + wise + witty + creativity;
    }

    public static void checkBestStudent(Kogtewran[] kogtewrans) {
        int bestScore = 0;
        int score = 0;
        String bestStudentName = null;
        for (int i = 0; i < kogtewrans.length; i++) {
            score = kogtewrans[i].abilityFaculty();
            if (bestScore < score){
                bestScore = score;
                bestStudentName = kogtewrans[i].getFullName();
            }
        }
        System.out.println("Лучший студент Когтеврана: " + bestStudentName + " с колличеством очков = " + bestScore);
    }
}
