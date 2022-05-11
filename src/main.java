import lombok.NoArgsConstructor;

import java.util.Scanner;

@NoArgsConstructor
public class main {
    public static void main(String[] args) {
        Retangulo ret = new Retangulo();
        Scanner sc = new Scanner(System.in);
        System.out.println("AAAAA");
        System.out.println("Digite a Altura: ");
        ret.setAltura(sc.nextDouble());
        System.out.println("Digite a Largura: ");
        ret.setLargura(sc.nextDouble());

        System.out.println("A área do retângulo é " + ret.Area());
        System.out.println("O perímetro do retângulo é " + ret.Perimetro());
        System.out.println("A diagonal do retângulo é " + ret.Diagonal());
    }
}
