
class HocSinh {
    private String hoTen;
    private String lop;
    private double toan;
    private double ly;
    private double hoa;
   
    public String diemTrungbinh(String hoTen, double toan, double ly, double hoa){
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
        return "\n"+hoTen +": "+  (toan + ly +hoa)/3;
    }
}
class HocSinhchuyentoan extends HocSinh{
    @Override
    public String diemTrungbinh(String hoTen, double toan, double ly, double hoa) {    
        return "\n"+hoTen +": "+ (toan * 2 + (ly+hoa))/4;
    }
}
class main {
    public static void main(String[] args) {
       HocSinh hS = new HocSinh(); 
       System.out.println("Diem Trung Binh:"+hS.diemTrungbinh("Nguyen Van A",6, 3, 7));
       HocSinhchuyentoan hScT = new HocSinhchuyentoan();
       System.out.println("Diem Trung Binh hs Chuyen Toan: "+ hScT.diemTrungbinh("Nguyen Van B", 8, 8, 7));
    }
}

    
