public class IMC {

    public String nome;

    public int idade;

    public double peso;

    public double calcularIMC(double altura){
        return peso / (altura * altura);
    }

    public String classificarIMC(double altura){
        double imc = calcularIMC(altura);
        if (imc < 18.5){
            return "abaixo do peso";
        }else if (imc < 25){
            return "Peso normal";
        } else if (imc < 30){
            return "Sobrepeso";
        } else if (imc < 35){
            return "Obesidade Grau I";
        } else if (imc < 40){
            return "Obesidade Grau II";
        }else {
            return "Obesidade Grau III";
        }
    }
}
