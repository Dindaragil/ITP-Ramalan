import java.util.Scanner;

public class Ramalan {
    public static void main(String[] args) {
        int age;
        int partnerAge;
        String name;
        String partnerName;
        Scanner input = new Scanner(System.in);

        // a. Pertama kali program dijalankan, minta user untuk menginput nama dan umur user.
        System.out.printf("Data Anda: \n");
        System.out.printf("Masukkan nama Anda: ");
        name = input.nextLine();
        System.out.printf("Masukkan umur Anda: ");
        age = input.nextInt();
        input.nextLine();

        // b. Minta user untuk menginput nama pasangan dan umur pasangan.
        System.out.printf("Data pasangan Anda: \n");
        System.out.printf("Masukkan nama pasangan Anda: ");
        partnerName = input.nextLine();
        System.out.printf("Masukkan umur pasangan Anda: ");
        partnerAge = input.nextInt();
        input.nextLine();

        System.out.printf("\n\n");

        // c. Tampilkan nama dan umur user, serta nama pasangan dan umur pasangan dari user.
        System.out.println("Selamat Datang di Program Ramalan Cupu");
        System.out.printf("++++++++++++++++++++++++++++++++++++++\n\n");

        System.out.println(name + " [" + age + "] " + "tahun");
        System.out.println(partnerName + " [" + partnerAge + "] " + "tahun");
        System.out.println("Tekan ENTER untuk melihat hasil ramalan...");
        input.nextLine();

        //menentukan angka acak untuk kecocokan
        int min = 50;
        int max = 100;

        //Generate random angka dari 50 ke 100
        double doubleRandom = (double)Math.floor(Math.random()*(max-min+1)+min);
        System.out.printf("Kecocokan anda dengan pasangan anda adalah: %.2f", doubleRandom );
        System.out.println("%");
        System.out.println("Terima kasih sudah mengginakan layanan kami :)");
    }
}
