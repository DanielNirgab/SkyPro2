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

    public static void showPuffinduiStudents(Puffindui [] PuffinduiStudents) {
        System.out.println();
        System.out.println("Студенты Пуффиндуй:");
        System.out.println("Студенты Пуффендуя трудолюбивы, верны, честны.");
        for (int i = 0; i < PuffinduiStudents.length; i++) {
            System.out.println("У Студента - " + PuffinduiStudents[i].toString() +
                    " Трудолюбие: " + PuffinduiStudents[i].hardworking +
                    " Верность: " + PuffinduiStudents[i].loyal +
                    " Честность: " + PuffinduiStudents[i].honest);
        }
    }
    public static void checkBestStudent(Puffindui[] puffinduis) {
        int bestScore = 0;
        int score = 0;
        String bestStudentName = null;
        for (int i = 0; i < puffinduis.length; i++) {
            score = puffinduis[i].getMagicPower()+puffinduis[i].getTeleportDistance()+
                    + puffinduis[i].getHardworking() + puffinduis[i].getLoyal() + puffinduis[i].getHonest();
            if (bestScore < score){
                bestScore = score;
                bestStudentName = puffinduis[i].getFullName();
            }
        }
        System.out.println("Лучший студент Пуффиндуя: " + bestStudentName + " с колличеством очков = " + bestScore);

    }

}
