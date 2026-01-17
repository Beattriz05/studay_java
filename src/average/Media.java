void main() {
    double nota1 = 8.9;
    double nota2 = 7.5;
    double media1 = (nota1 + nota2) / 2;

    // %.2f limita a 2 casas decimais. %n pula a linha.
    System.out.printf("Média 1: %.2f%n", media1);

    double media2 = calcularSegundaMedia(); // usado para puxar os métodos e guarda eles
    double media3 = calcularTerceiraMedia();

    double mediaGlobal = (media1 + media2 + media3) / 3; // usado para somar as três médias

    IO.println("--- Resultado Final ---");
    System.out.printf("Média Global: %.2f%n", mediaGlobal);
}

public static double calcularSegundaMedia() { // para calcular as médias juntas troquei o void por double
    double nota1 = -5.8;
    double nota2 = 8.0;

    double media2 = (nota1 + nota2) / 2;

    System.out.printf("Média 2: %.2f%n", media2);

    return media2; // Envia o valor de volta para o main
}

public static double calcularTerceiraMedia() {
    double nota1 = 5.0;
    double nota2 = 9.0;

    double media3 = (nota1 + nota2) / 2;

    System.out.printf("average.Media 3: %.2f%n", media3);

    return media3;
}