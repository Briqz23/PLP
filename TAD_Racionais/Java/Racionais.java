public class Racionais{

    private int numerador;
    private int denominador;

    public Racionais(int numerador, int denominador){
        this.numerador = numerador;
        this.denominador = denominador;
        sinais();
    }

    public void sinais(){
        if ((numerador <0 && denominador<0) || (denominador<0 && numerador>0)){
            numerador = numerador*(-1);
            denominador = denominador*(-1);
        }
    }


    public Racionais multiplicacao(Racionais segundo_objeto){
        int numerador = this.numerador * segundo_objeto.numerador;
        int denominador = this.denominador * segundo_objeto.denominador;
        return new Racionais(numerador, denominador);
    }
    public Racionais divisao(Racionais segundo_objeto){
        int numerador = this.numerador * segundo_objeto.denominador;
        int denominador = this.denominador * segundo_objeto.numerador;
        return new Racionais(numerador, denominador);
    }
    public Racionais soma(Racionais segundo_objeto){
        int numerador = this.numerador * segundo_objeto.denominador + segundo_objeto.numerador * this.denominador;
        int denominador = this.denominador * segundo_objeto.numerador;
        return new Racionais(numerador, denominador);
    }
    public Racionais subtracao(Racionais segundo_objeto){
        int numerador = this.numerador * segundo_objeto.denominador - segundo_objeto.numerador * this.denominador;
        int denominador = this.denominador * segundo_objeto.denominador;
        return new Racionais(numerador, denominador);
    }


    public String toString() {
        return numerador + "/" + denominador;
    }
}