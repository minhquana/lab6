# lab6
import java.util.concurrent.Flow.Subscriber;
class Nhanvien {
    protected String ten;
    protected long luong;
    protected int NV_SEP = 0;
	protected int NV_LINH = 1;
	protected long LUONG_NV_FULLTIME_SEP ;
	protected long LUONG_NV_FULLTIME_LINH ;
	protected long LUONG_LAMTHEM_MOINGAY;
	protected long LUONG_NV_PARTTIME_MOIGIO ;
    public Nhanvien(){
        this.ten = ten;
        this.luong = luong;
    }
    public Nhanvien(String ten){
        this.ten = ten;
    }
    public String loaiNhanvien(){
        
        return loaiNhanvien();
    }
    public void tinhLuong(){
        System.out.println("Tinh Luong: ");
    }
    public void xuatThongtin(){       
        System.out.println("Thong tin Nhan Vien: ");
        System.out.println("Ten Nhan Vien: "+ten);
    }
 }
class nhanVienfulltime extends Nhanvien{
    private int loaiChucvu;
    private int ngayLamthem;
    public nhanVienfulltime(String ten, int loaiChucvu, int ngayLamthem){
        super(ten);
        this.loaiChucvu = loaiChucvu;
        this.ngayLamthem = ngayLamthem;
    }
    public nhanVienfulltime(){
        super();
    }
   
    @Override
    public String loaiNhanvien() {
        
        return loaiNhanvien(); 
    }   
    @Override
    public void tinhLuong(){
    System.out.println("LUONG_NV_FULLTIME_SEP: "+ LUONG_NV_FULLTIME_SEP );
    System.out.println("LUONG_NV_FULLTIME_LINH: "+ LUONG_NV_FULLTIME_LINH );
    System.out.println("LUONG_LAMTHEM_MOINGAY: "+ LUONG_LAMTHEM_MOINGAY );
    } 
    public String toString(){
        return "Gio lam:"+ this.ngayLamthem;
    }
}
class nhanVienparttime extends Nhanvien{
    private int gioLam;
    public nhanVienparttime(String ten,int gioLam){
        super(ten);
        this.gioLam = gioLam;
    }
    public nhanVienparttime(){
        super();
    }
    @Override
    public String loaiNhanvien() {       
        return loaiNhanvien();
    }
    @Override
    public void tinhLuong() {
        System.out.println("LUONG_NV_PARTTIME_MOTGIO:"+ LUONG_NV_PARTTIME_MOIGIO);
    }
    public String toString(){
        return "Gio lam:"+ this.gioLam;
    }
}
class mainNhanVien{
    public static void main(String[] args) {
    Nhanvien NV = new Nhanvien();
    nhanVienfulltime FT = new nhanVienfulltime();
    FT.xuatThongtin();
    System.out.println(FT.toString());
    FT.tinhLuong();
    System.out.println("============================================================");
    nhanVienparttime PT = new nhanVienparttime();
    PT.xuatThongtin();
    System.out.println(PT.toString());
    PT.tinhLuong();
  
}
}
