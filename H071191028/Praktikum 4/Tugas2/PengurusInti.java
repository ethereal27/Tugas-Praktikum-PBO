package Tugas2;

public class PengurusInti {
    //static Scanner pew = new Scanner(System.in);
    String name, jabatan, prodi, nim;
    public PengurusInti(String name, String prodi, String nim){

        this.name = name;
        this.prodi = prodi;
        this.nim = nim;
    
    }

    public void showIdentity(){
        System.out.println();
        System.out.println("+===========================+");
        System.out.println("nama    : " + name);
        System.out.println("nim     : " + nim);
        System.out.println("prodi   : " + prodi);
        System.out.println("Bagian  : Pengurus Inti");
        System.out.println("+===========================+");
    }
    

}