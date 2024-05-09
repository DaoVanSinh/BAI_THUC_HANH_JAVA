public class Htron{
    private final float PI=3.14f;
    private float r;
    public float getr(){
        return r;
    }
    public void setr(float r){
    this.r=r;
}
public float tinhChuVi(){
    return 2 * PI * r ;

}
public float tinhDienTich(){
    return PI * r * r ;
}
}