package utsA11202113793;

public class MahasiswaLulus extends Mahasiswa {
    int tahunMasuk ;
    float ipk ;
    
    public boolean ikutWisuda() {
        if (tahunMasuk > 2018 && tahunMasuk <= 2020) {
            System.out.println("Mahasiswa sudah lulus");
            return true ;

        } else {
            System.out.println("Mahasiswa belum lulus");
            return false ; 
        }
    }


        @Override
        public void infoMahasiswa() {
            if(ikutWisuda() == true) {
                int temp = ulang * 4 ;
                this.ipk = (super.totalIPK / temp) + 2 ;
                System.out.println("Lulus dengan IPK : " + ipk);
                super.infoMahasiswa();
            }
        
    }

    
}
