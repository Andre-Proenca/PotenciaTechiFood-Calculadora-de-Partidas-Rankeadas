public class CalculadoraRankeada {

    public static int calcularRank(int qtdeVitorias, int qtdeDerrotas){
            return qtdeVitorias - qtdeDerrotas;
    }

    public static void main(String[] args) {
        
        int vitorias = 110;
        int derrotas = 12;
        String nivel = "";

        int saldoVitorias = calcularRank(vitorias, derrotas);
        

        if(saldoVitorias <= 10) {
            nivel = "Ferro";
        } else if (saldoVitorias > 10 && saldoVitorias < 21) {
            nivel = "Bronze";
        } else if (saldoVitorias > 20 && saldoVitorias < 51) {
            nivel = "Prata";
        } else if (saldoVitorias > 50 && saldoVitorias < 81) {
            nivel = "Ouro";
        } else if (saldoVitorias > 80 && saldoVitorias < 91) {
            nivel = "Diamante";
        } else if (saldoVitorias > 90 && saldoVitorias < 101) {
            nivel = "Lendário";
        } else if (saldoVitorias >= 101) {
            nivel = "Imortal";
        }

        System.out.println("O Herói tem um saldo de vitórias de " + saldoVitorias + " e está no nível " + nivel + ".");


    }

    

}