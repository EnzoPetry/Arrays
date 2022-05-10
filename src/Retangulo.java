import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Retangulo {
    private double Altura;
    private double Largura;

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

