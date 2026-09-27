public class Main {
    public static int calcularSaldo(int vitorias, int derrotas) {
        return vitorias - derrotas;
    }

    public static String determinarNivel(int vitorias) {
        if (vitorias < 10) {
            return "Ferro";
        } else if (vitorias <= 20) {
            return "Bronze";
        } else if (vitorias <= 50) {
            return "Prata";
        } else if (vitorias <= 80) {
            return "Ouro";
        } else if (vitorias <= 90) {
            return "Diamante";
        } else if (vitorias <= 100) {
            return "Lendário";
        } else {
            return "Imortal";
        }
    }

    public static void main(String[] args) {
        int vitorias = 75;
        int derrotas = 20;

        int saldo = calcularSaldo(vitorias, derrotas);
        String nivel = determinarNivel(vitorias);

        System.out.println("O Herói tem de saldo de " + saldo + " está no nível de " + nivel);
    }
}