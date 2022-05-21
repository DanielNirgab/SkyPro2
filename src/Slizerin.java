public class Slizerin extends HogwartsStudents{
    // Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.
    // Драко Малфой, Грэхэм Монтегю, Грегори Гойл учатся на Слизерине.
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int dominate;

    Slizerin (String fullName, int magicPower, int teleportDistance, int cunning, int determination, int ambition, int resourcefulness, int dominate) {
        super(fullName, magicPower, teleportDistance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.dominate = dominate;
    }

    public int getCunning() {
        return cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public int getDominate() {
        return dominate;
    }

    public static void showSlizerinStudents(Slizerin [] slizerinStudents) {
        System.out.println();
        System.out.println("Студенты Слизерин:");
        System.out.println("Всем ученикам Слизерина присущи хитрость, решительность, амбициозность, находчивость и жажда власти.");
        for (int i = 0; i < slizerinStudents.length; i++) {
            System.out.println("У Студента: " + slizerinStudents[i].toString() +
                    " Хитрость: " + slizerinStudents[i].cunning +
                    " Решительность: " + slizerinStudents[i].determination +
                    " Амбициозность: " + slizerinStudents[i].ambition +
                    " Находчивость: " + slizerinStudents[i].resourcefulness +
                    " Жажда власти: " + slizerinStudents[i].dominate);
        }
    }
    public static void checkBestStudent(Slizerin[] slizerins) {
        int bestScore = 0;
        int score = 0;
        String bestStudentName = null;
        for (int i = 0; i < slizerins.length; i++) {
            score = slizerins[i].getMagicPower()+slizerins[i].getTeleportDistance()+
                    + slizerins[i].getCunning() + slizerins[i].getDetermination() + slizerins[i].getAmbition() +
                    slizerins[i].getResourcefulness() + slizerins[i].getDominate();
            if (bestScore < score){
                bestScore = score;
                bestStudentName = slizerins[i].getFullName();
            }
        }
        System.out.println("Лучший студент Слизерина: " + bestStudentName + " с колличеством очков = " + bestScore);
    }
}
