public class Retangulo {
    private double Altura;
    private double Largura;

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double altura) {
        Altura = altura;
    }

    public double getLargura() {
        return Largura;
    }

    public void setLargura(double largura) {
        Largura = largura;
    }

    public double Area() {
        return Altura*Largura;
    }
    public double Perimetro(){
        return (Altura*2)+(Largura*2);
    }
    public double Diagonal(){
        return Math.sqrt((Altura*Altura) + (Largura*Largura));
    }
}

