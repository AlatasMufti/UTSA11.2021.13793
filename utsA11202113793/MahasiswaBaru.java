package utsA11202113793;

public class MahasiswaBaru extends Mahasiswa {
    String asalSekolah ;

    public boolean ikutOspek() {
        if (semester == 1) {
            System.out.println("Semester 1, diwajibkan mengikuti Ospek");
            return true;
        } else {
            System.out.println("Bukan Semester 1, tidak perlu Ospek");
            return false;
        }
    }


    @Override
    public void infoMahasiswa() {
        System.out.println("Asal Sekolah : " + this.asalSekolah);
        super.infoMahasiswa();
    }
   
}
