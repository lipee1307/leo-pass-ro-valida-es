package util;

public class validações {
    /**
     * Construtor privado para impedir instâncias.
     */
    private ValidacoesPassaro() {
        // Utility Class Pattern
    }

    /**
     * Valida a espécie do pássaro.
     * Não pode ser nula, vazia ou conter apenas espaços.
     */
    public static boolean especieValida(String especie) {
        return !(especie == null || especie.trim().isEmpty());
    }

    public static String mensagemErroEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            return "Erro: A espécie do pássaro deve ser informada!";
        }
        return "";
    }

    /**
     * Valida a envergadura da asa (em metros).
     * Um beija-flor tem ~0.05m e um condor ~3.2m. 
     * Definimos um intervalo seguro de 0.03m a 10.0m (considerando espécies extintas).
     */
    public static boolean envergaduraValida(double envergadura) {
        return envergadura >= 0.03 && envergadura <= 10.0;
    }

    public static String mensagemErroEnvergadura(double envergadura) {
        if (envergadura < 0.03) {
            return "Erro: Envergadura muito pequena para um pássaro!";
        } else if (envergadura > 10.0) {
            return "Erro: Envergadura excede os limites biológicos conhecidos!";
        }
        return "";
    }

    /**
     * Valida o peso do pássaro (em quilogramas).
     * De 0.002kg (beija-flor) até 150kg (avestruz).
     */
    public static boolean pesoValido(double peso) {
        return peso >= 0.001 && peso <= 200.0;
    }

    public static String mensagemErroPeso(double peso) {
        if (peso < 0.001) {
            return "Erro: Peso inválido (muito leve)!";
        } else if (peso > 200.0) {
            return "Erro: Peso excede o limite para aves (máx 200kg)!";
        }
        return "";
    }
}
