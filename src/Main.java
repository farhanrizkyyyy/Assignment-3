import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age = 0;
        String name = "", errorMessage = "Format input tidak sesuai.";
        boolean isMarried = false;

        System.out.print("Masukkan nama Anda: ");
        name = scanner.nextLine(); // Membaca baris teks dari input pengguna

        // selama format yang diinput user tidak sesuai,
        // maka aplikasi akan terus meminta input hingga format yang diinputkan sesuai
        while (true) {
            try {
                System.out.print("Masukkan umur Anda: ");
                age = scanner.nextInt(); // Membaca nilai integer dari input pengguna

                // keluar dari while loop jika format input sesuai
                break;
            } catch (InputMismatchException e) {
                // tampilkan pesan error jika format input tidak sesuai
                printError(errorMessage);
                scanner.next();
            }
        }

        while (true) {
            try {
                System.out.print("Apakah Anda sudah menikah? (true/false): ");
                isMarried = scanner.nextBoolean(); // Membaca nilai boolean dari input pengguna

                // keluar dari while loop jika format input sesuai
                break;
            } catch (InputMismatchException e) {
                // tampilkan pesan error jika format input tidak sesuai
                printError(errorMessage);
                scanner.next();
            }
        }

        // tampilkan semua hasil input user
        System.out.println("Halo " + name);
        System.out.println("Usia mu " + age + " tahun");
        System.out.print("Dan kamu ");

        if (isMarried) System.out.print("sudah ");
        else System.out.print("belum ");

        System.out.print("menikah");

        scanner.close();
    }

    private static void printError(String message) {
        System.out.println(message);
    }
}