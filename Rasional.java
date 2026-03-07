public class Rasional {

    private int pembilang, penyebut;

    public Rasional(){
        pembilang = 0;
        penyebut = 0;
    }

    public Rasional(int p, int q){
        pembilang = p;
        penyebut = q;
    }

    public boolean isRasional(){
        return penyebut != 0;
    }

    public void Sederhana(){

        int A = pembilang;
        int B = penyebut;
        int temp;

        for(; B != 0; ){
            temp = A % B;
            A = B;
            B = temp;
        }

        pembilang /= A;
        penyebut /= A;
    }

    public double Cast(){
        return (double)pembilang / penyebut;
    }

    public boolean moreThan(Rasional A){
        return pembilang * A.penyebut > penyebut * A.pembilang;
    }

    // operator <
    public boolean lessThan(Rasional A){
        return pembilang * A.penyebut < penyebut * A.pembilang;
    }

    // operator <=
    public boolean lessEqual(Rasional A){
        return pembilang * A.penyebut <= penyebut * A.pembilang;
    }

    // operator >=
    public boolean greaterEqual(Rasional A){
        return pembilang * A.penyebut >= penyebut * A.pembilang;
    }

    // operator -
    public void minus(Rasional A){
        pembilang = pembilang * A.penyebut - penyebut * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    // operator *
    public void kali(Rasional A){
        pembilang = pembilang * A.pembilang;
        penyebut = penyebut * A.penyebut;
    }

    // operator /
    public void bagi(Rasional A){
        pembilang = pembilang * A.penyebut;
        penyebut = penyebut * A.pembilang;
    }

    public void cetak(){
        System.out.println(pembilang + "/" + penyebut);
    }
}