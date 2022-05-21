import java.util.Objects;

abstract public class HogwartsStudents {
    private String fullName;
    private int magicPower;
    private int teleportDistance;

    HogwartsStudents (String fullName, int magicPower, int teleportDistance) {
        this.fullName = fullName;
        this.magicPower = magicPower;
        this.teleportDistance = teleportDistance;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public int getMagicPower() {
        return magicPower;
    }

    public void setMagicPower(int magicPower) {
        if (magicPower >= 0 && magicPower <= 100) {
            this.magicPower = magicPower;
        } else {
            System.out.println("Incorrect MagicPower");
        }
    }

    public int getTeleportDistance() {
        return teleportDistance;
    }

    public void setTeleportDistance(int teleportDistance) {
        if (teleportDistance >= 0 && teleportDistance <= 100) {
            this.teleportDistance = teleportDistance;
        } else {
            System.out.println("Incorrect MagicPower");
        }

    }

    @Override
    public String toString() {
        return "Имя Студента: " + '\'' + getFullName() + '\'' +
                ", Магическая сила'" + getMagicPower() + '\'' +
                ", Дистанция телепорта'" +  getTeleportDistance() + '\'';
    }

    public static void showStudentInfo(HogwartsStudents [] hogwartsStudents) {
        for (int i = 0; i < hogwartsStudents.length; i++) {
            if (hogwartsStudents[i] != null) {
                System.out.println(hogwartsStudents.toString());

            }
        }
    }

    public static HogwartsStudents findStudent(HogwartsStudents [] hogwartsStudents, String fullName) {
        for (int i = 0; i < hogwartsStudents.length; i++) {
                if (hogwartsStudents[i].getFullName().equals(fullName)) {
                    return hogwartsStudents[i];
                }
            }
        return null;
    }

    public static void checkStudentsPower (HogwartsStudents [] hgSt1, String student1, HogwartsStudents [] hgSt2, String student2) {
        HogwartsStudents st1 = findStudent(hgSt1, student1);
        HogwartsStudents st2 = findStudent(hgSt2, student2);
        int scoreStudent1 = 0;
        int scoreStudent2 = 0;
        if (st2 != null && st1 != null) {
            scoreStudent1 = st1.getMagicPower() + st1.getTeleportDistance();
            scoreStudent2 = st2.getMagicPower() + st2.getTeleportDistance();
            if (scoreStudent1 > scoreStudent2) {
                System.out.println(st1.getFullName() + " с мощью " + scoreStudent1 + " Обладает большей мощностью чем " + st2.getFullName() + " на " + (scoreStudent1 - scoreStudent2));
            } else {
                System.out.println(st2.getFullName() + " с мощью " + scoreStudent2 + " Обладает большей мощностью чем " + st1.getFullName() + " на " + (scoreStudent2 - scoreStudent1));
            }
        } else {
            System.out.println("Не найдено студентов");

        }

    }
    //    abstract public void makeMagic ();
//    abstract public void teleport();

}
