import java.util.Scanner;

public class BankDemo {
    public static void main(String[] args) {
        Bank bankMataram = new Bank();
        bankMataram.addCustomer("Zaky", "Carmilla");
        
        Customer nasabah1 = bankMataram.getCustomer(0);
        nasabah1.setAccount(new Account(500000)); // Saldo awal 500k

        Scanner input = new Scanner(System.in);
        int pilihan = 0;

        System.out.println("===================================");
        System.out.println("  Selamat Datang di ATM Bank Mataram ");
        System.out.println("  Nasabah: " + nasabah1.getFirstName() + " " + nasabah1.getLastName());
        System.out.println("===================================");

        while (pilihan != 4) {
            System.out.println("\nSilakan Pilih Transaksi:");
            System.out.println("1. Cek Saldo");
            System.out.println("2. Setor Tunai");
            System.out.println("3. Tarik Tunai");
            System.out.println("4. Keluar");
            System.out.print("Masukkan pilihan (1-4): ");
            
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.printf(">> Saldo Anda saat ini: Rp %.0f\n", nasabah1.getAccount().getBalance());
                    break;
                case 2:
                    System.out.print("Masukkan nominal uang yang akan disetor: Rp ");
                    double setor = input.nextDouble();
                    nasabah1.getAccount().deposit(setor);
                    System.out.println(">> Setor tunai berhasil!");
                    break;
                case 3:
                    System.out.print("Masukkan nominal uang yang akan ditarik: Rp ");
                    double tarik = input.nextDouble();
                    nasabah1.getAccount().withdraw(tarik);
                    System.out.println(">> Tarik tunai berhasil diproses.");
                    break;
                case 4:
                    System.out.println(">> Terima kasih telah menggunakan layanan ATM Bank Mataram. Kartu Anda silakan diambil.");
                    break;
                default:
                    System.out.println(">> Pilihan tidak valid! Silakan ketik angka 1, 2, 3, atau 4.");
            }
        }
        
        input.close();
    }
}