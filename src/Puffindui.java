public class Puffindui extends HogwartsStudents{
    // Студенты Пуффендуя трудолюбивы, верны, честны.
    // На факультет Пуффендуй учатся Захария Смит, Седрик Диггори, Джастин Финч-Флетчли.
    private int hardworking;
    private int loyal;
    private int honest;

    Puffindui (String fullName, int magicPower, int teleportDistance, int hardworking, int loyal, int honest) {
        super(fullName, magicPower, teleportDistance);
        this.hardworking = hardworking;
        this.loyal = loyal;
        this.honest = honest;
    }

    public int getHardworking() {
        return hardworking;
    }

    public int getLoyal() {
        return loyal;
    }

    public int getHonest() {
        return honest;
    }

    @Override
    public String toString() {
        return super.toString() + " Всем студентам Пуффендуя присущи -" +
                " труболюбие: " + hardworking +
                ", верность: " + loyal +
                ", честность: " + honest;
    }

    @Override
    public int abilityFaculty() {
        return hardworking + loyal + honest;
    }

    public static void showStudentInfo(Puffindui [] puffinduisStudents) {
        System.out.println("Факультет Пуфиндуй:");
        for (int i = 0; i < puffinduisStudents.length; i++) {
            if (puffinduisStudents[i] != null) {
                puffinduisStudents[i].print();
            }
        }
    }

    public static void checkBestStudent(Puffindui[] puffinduis) {
        int bestScore = 0;
        int score = 0;
        String bestStudentName = null;
        for (int i = 0; i < puffinduis.length; i++) {
            score = puffinduis[i].abilityFaculty();
            if (bestScore < score){
                bestScore = score;
                bestStudentName = puffinduis[i].getFullName();
            }
        }
        System.out.println("Лучший студент Пуффиндуя: " + bestStudentName + " с колличеством очков = " + bestScore);

    }

}
