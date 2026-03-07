public class Student {

    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;

    private static int jumlahObjek = 0;

    public Student(){
        name = "";
        address = "";
        age = 0;
        jumlahObjek++;
    }

    public Student(String n, String a, int ag){
        name = n;
        address = a;
        age = ag;
        jumlahObjek++;
    }

    // constructor tambahan untuk nilai mapel
    public Student(double m, double e, double s){
        mathGrade = m;
        englishGrade = e;
        scienceGrade = s;
        jumlahObjek++;
    }

    public void setName(String n){
        name = n;
    }

    public void setAddress(String a){
        address = a;
    }

    public void setAge(int ag){
        age = ag;
    }

    public void setMath(double m){
        mathGrade = m;
    }

    public void setEnglish(double e){
        englishGrade = e;
    }

    public void setScience(double s){
        scienceGrade = s;
    }

    private double getAverage(){
        return (mathGrade + englishGrade + scienceGrade) / 3;
    }

    // method menentukan lulus atau remidi
    public boolean statusAkhir(){
        return getAverage() >= 61;
    }

    public void displayMessage(){

        System.out.println("Nama siswa : " + name);
        System.out.println("Alamat : " + address);
        System.out.println("Umur : " + age);
        System.out.println("Nilai rata-rata : " + getAverage());

        if(statusAkhir()){
            System.out.println("Status : Lulus");
        }else{
            System.out.println("Status : Remidi");
        }

        System.out.println();
    }

    public static void jumlahObjek(){
        System.out.println("Jumlah objek student : " + jumlahObjek);
    }
}