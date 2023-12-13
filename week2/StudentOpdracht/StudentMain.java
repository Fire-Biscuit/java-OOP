package week2.StudentOpdracht;

public class StudentMain {
    public static void main(String[] args) {

        Klas IT101 = new Klas();
        Klas IT102 = new Klas();        //deze staat los van de eertse

        Student studentA = new Student();
        studentA.naam = "studentEen";

        Student studentB = new Student();
        studentB.naam = "studentTwee";

        Student studentC = new Student();
        studentC.naam = "studentDrie";

        Student[] lijstVanStudenten = new Student[3];
        lijstVanStudenten[0] = studentA;
        lijstVanStudenten[1] = studentB;
        lijstVanStudenten[2] = studentC;
        IT101.studenten = lijstVanStudenten;        //een array aan objecten aka list

        IT101.Klassenvertegenwoordiger = studentA;      //in klasse van objecten is het datatype een object

        for (int i = 0; i < IT101.studenten.length; i++) {              //klass.object[nummer uit array]. eigenschap
            System.out.printf("Student: %d %s\n",IT101.studenten[i].studentnummer,IT101.studenten[i].naam);
        }
    }
}
