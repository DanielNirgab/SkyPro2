public class Hogwarts {
    public static void main(String[] args) {
        Griffindor [] griffindorsStudents = {
                new Griffindor("Гарри Поттер", 78, 30, 80, 80, 30),
                new Griffindor("Гермиона Грейнджер",  58, 15, 80, 50, 10),
                new Griffindor("Рон Уизли",  55, 90, 50, 25, 25)
        };
        Puffindui [] puffinduisStudents = {
                new Puffindui("Захария Смит", 68, 20, 70, 50, 45),
                new Puffindui("Седрик Диггори",  71, 25, 53, 47, 55),
                new Puffindui("Джастин Финч-Флетчли",  38, 10, 50, 25, 15)
        };
        Kogtewran [] kogtewransStudents = {
                new Kogtewran("Чжоу Чанг", 63, 30, 80, 80, 30, 40),
                new Kogtewran("Падма Патил",  42, 15, 61, 50, 58, 35),
                new Kogtewran("Маркус Белби",  38, 23, 90, 25, 85, 99)
        };
        Slizerin [] slizerinsStudents = {
                new Slizerin("Драко Малфой", 70, 28, 80, 80, 30, 45, 93),
                new Slizerin("Грэхэм Монтегю",  58, 15, 80, 50, 10, 35, 56),
                new Slizerin("Грегори Гойл",  37, 10, 28, 35, 15, 99, 43)
        };





        Griffindor.showGriffindorStudents(griffindorsStudents);
        Puffindui.showPuffinduiStudents(puffinduisStudents);
        Kogtewran.showKogtewranStudents(kogtewransStudents);
        Slizerin.showSlizerinStudents(slizerinsStudents);
        System.out.println();
        Griffindor.checkBestStudent(griffindorsStudents);
        Puffindui.checkBestStudent(puffinduisStudents);
        Kogtewran.checkBestStudent(kogtewransStudents);
        Slizerin.checkBestStudent(slizerinsStudents);
        System.out.println();
        HogwartsStudents.checkStudentsPower(griffindorsStudents, "Гарри Поттер", kogtewransStudents, "Падма Патил" );




    }
}