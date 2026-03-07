import java.util.Scanner;

public class MainStudent {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah siswa : ");
        int jumlah = input.nextInt();
        input.nextLine();

        Student[] siswa = new Student[jumlah];

        for(int i = 0; i < jumlah; i++){

            siswa[i] = new Student();

            System.out.println("\nData siswa ke-" + (i+1));

            System.out.print("Nama : ");
            siswa[i].setName(input.nextLine());

            System.out.print("Alamat : ");
            siswa[i].setAddress(input.nextLine());

            System.out.print("Umur : ");
            siswa[i].setAge(input.nextInt());

            System.out.print("Nilai Matematika : ");
            siswa[i].setMath(input.nextDouble());

            System.out.print("Nilai English : ");
            siswa[i].setEnglish(input.nextDouble());

            System.out.print("Nilai Science : ");
            siswa[i].setScience(input.nextDouble());
            input.nextLine();
        }

        System.out.println("\n===== DATA SISWA =====");

        for(int i = 0; i < jumlah; i++){
            siswa[i].displayMessage();
        }

        Student.jumlahObjek();

    }
}
