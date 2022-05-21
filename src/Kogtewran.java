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

    public static void showKogtewranStudents(Kogtewran [] kogtewransStudents) {
        System.out.println();
        System.out.println("Студенты Когтевран:");
        System.out.println("Когтевранцы умны, мудры, остроумны и полны творчества.");
        for (int i = 0; i < kogtewransStudents.length; i++) {
            System.out.println("У Студента - " + kogtewransStudents[i].toString() +
                    " Ум: " + kogtewransStudents[i].smart+
                    " Мудрость: " + kogtewransStudents[i].wise +
                    " Остроумие: " + kogtewransStudents[i].witty +
                    " Творчество: " + kogtewransStudents[i].creativity);
        }
    }
    public static void checkBestStudent(Kogtewran[] kogtewrans) {
        int bestScore = 0;
        int score = 0;
        String bestStudentName = null;
        for (int i = 0; i < kogtewrans.length; i++) {
            score = kogtewrans[i].getMagicPower()+kogtewrans[i].getTeleportDistance()+
                    + kogtewrans[i].getSmart() + kogtewrans[i].getWise() + kogtewrans[i].getWitty() + kogtewrans[i].getCreativity();
            if (bestScore < score){
                bestScore = score;
                bestStudentName = kogtewrans[i].getFullName();
            }
        }
        System.out.println("Лучший студент Когтеврана: " + bestStudentName + " с колличеством очков = " + bestScore);
    }
}
