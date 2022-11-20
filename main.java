import java.text.DecimalFormat;
import java.util.Scanner;
 
class Karyawan {
    public String nip, nama, divisi;
    public double gaji_pokok, Tunjangan, total, harilembur, totallembur, thp;
    
    double gaji(){
        if(divisi.equalsIgnoreCase("Pemasaran") ){
            gaji_pokok = 10000000;
            Tunjangan = 500000;
            total = gaji_pokok+Tunjangan;
        }else if(divisi.equalsIgnoreCase("Produksi") ){
            gaji_pokok = 8000000;
            Tunjangan = 300000;
            total = gaji_pokok+Tunjangan;
        }else{
            gaji_pokok = 6000000;
            Tunjangan = 100000;
            total = gaji_pokok+Tunjangan;
        }
        return total;
    }

    double lembur(){
            totallembur = harilembur*gaji_pokok/173;
            return totallembur;
    }

    double totalgaji(){
        thp = totallembur+total;
        return thp;
}
    
    public void SlipGaji(){
        DecimalFormat df = new DecimalFormat("#0,000");
        System.out.println("------ Detail Gaji ------");
        System.out.println("NIP : "+this.nip);
        System.out.println("Nama : "+this.nama);
        System.out.println("Divisi: "+this.divisi);
        System.out.println("Hari Lembur : "+String.format("%.0f",this.harilembur));
        System.out.println("Gaji + Tunjangan : "+df.format(gaji()));
        System.out.println("Lembur : "+df.format(lembur()));
        System.out.println("Total Gaji : "+df.format(totalgaji()));
    }
}
 
class MainKaryawan{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        Karyawan k = new Karyawan();
        
        System.out.print("NIP : ");
        k.nip = sc.next();
        
        System.out.print("Nama : ");
        k.nama = sc.next();
        
        System.out.print("Divisi : ");
        k.divisi = sc.next();

        System.out.print("Hari Lembur : ");
        k.harilembur = sc.nextDouble();
        
        k.SlipGaji();
    }
}
