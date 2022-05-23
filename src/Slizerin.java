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

    @Override
    public String toString() {
        return super.toString() + " Всем студентам Слизерина присущи -" +
                " хитрость: " + cunning +
                ", решительность: " + determination +
                ", амбициозность: " + ambition +
                ", находчивость: " + resourcefulness +
                ", жажда власти: " + dominate
                ;
    }

    public static void showStudentInfo(Slizerin [] slizerinStudents) {
        System.out.println("Факультет Слизерин:");
        for (int i = 0; i < slizerinStudents.length; i++) {
            if (slizerinStudents[i] != null) {
                slizerinStudents[i].print();
            }
        }
    }

    @Override
    public int abilityFaculty() {
        return cunning + determination + ambition + resourcefulness + dominate;
    }

    public static void checkBestStudent(Slizerin[] slizerins) {
        int bestScore = 0;
        int score = 0;
        String bestStudentName = null;
        for (int i = 0; i < slizerins.length; i++) {
            score = slizerins[i].abilityFaculty();
            if (bestScore < score){
                bestScore = score;
                bestStudentName = slizerins[i].getFullName();
            }
        }
        System.out.println("Лучший студент Слизерина: " + bestStudentName + " с колличеством очков = " + bestScore);
    }
}
