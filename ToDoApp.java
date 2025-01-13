import java.util.ArrayList;
import java.util.Scanner;

public class ToDoApp {
    public static ArrayList<String> userTODO = new ArrayList<>();

    public static void main(String[] args) {
        System.out.println("TODOIST");
        var choice = 0;

        while(choice != 4) {
            System.out.print("Menu:\n1.Tambah\n2.Hapus\n3.Tampilkan\n4.Keluar\n: ");
            Scanner scanner = new Scanner(System.in);
            try{
                choice = scanner.nextInt();
            } catch (Exception e) {
                //Error For
                System.out.println("invalid option: " + choice + "\n");
                continue;
            }
            if (choice == 1) {
                tambah();
            } else if (choice == 2) {
                hapus();
            } else if (choice == 3) {
                tampilkan();
            } else {
                System.out.println("Not a valid option");
            }
        }

    }

    public static void tampilkan(){
        int counter = 1;
        for (String i: userTODO) {
            System.out.println(counter + ". " + i);
            counter++;
        }
        System.out.println("\n");
    }

    public static void tambah(){
        System.out.print("Nama Kegiatan\n:");
        Scanner scanner = new Scanner(System.in);
        String kegiatan = scanner.nextLine();
        kegiatan.trim();
        userTODO.add(kegiatan);
        tampilkan();
    }

    public static void hapus(){
        tampilkan();
        System.out.print("Nama Kegiatan yang ingin di hapus\n:");
        Scanner scanner = new Scanner(System.in);
        try {
            int kegiatanToHapus = scanner.nextInt();
            userTODO.remove(kegiatanToHapus - 1);
        } catch (Exception e) {
            System.out.println("Invalid option1 \n");
        }
    }
}
