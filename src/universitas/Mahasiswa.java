package universitas;

public class Mahasiswa {
    private String npm,nama,prodi;
    
    public Mahasiswa(String npm,String nama,String prodi){
       this.npm = npm;
       this.nama = nama;
       this.prodi=prodi;
   }
    public String getDetail(){
        System.out.println("npm"+npm);
        System.out.println("nama"+nama);
        System.out.println("prodi"+prodi);
        return null;
        
    }
    
    void setNPM(String ubahnpm){
        npm=ubahnpm;
    }
   void setNAMA(String ubahnama){
        nama=ubahnama;
    }
   void setPRODI(String ubahprodi){
        prodi=ubahprodi;
    }
   String getNPM(){
        return npm;
    }
   String getNAMA(){
        return nama;
    }
   String getPRODI(){
        return prodi;
    }
}
