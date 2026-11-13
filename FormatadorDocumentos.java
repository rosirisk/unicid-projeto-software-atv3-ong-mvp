public class FormatadorDocumentos {

    // Remove tudo o que não for número
    public static String somenteDigitos(String valor) {
        if (valor == null) {
            return "";
        }
        return valor.replaceAll("\\D", "");
    }

    // Valida se tem exatamente 11 dígitos e aplica a máscara do CPF (000.000.000-00)
    public static String formatarCPF(String cpf) {
        String numeros = somenteDigitos(cpf);

        if (numeros.length() != 11) {
            throw new IllegalArgumentException("O CPF deve conter exatamente 11 numeros.");
        }

        return numeros.substring(0, 3) + "." +
               numeros.substring(3, 6) + "." +
               numeros.substring(6, 9) + "-" +
               numeros.substring(9, 11);
    }

    // Valida se tem exatamente 8 dígitos e aplica a máscara do CEP (00000-000)
    public static String formatarCEP(String cep) {
        String numeros = somenteDigitos(cep);

        if (numeros.length() != 8) {
            throw new IllegalArgumentException("O CEP deve conter exatamente 8 numeros.");
        }

        return numeros.substring(0, 5) + "-" +
               numeros.substring(5, 8);
    }
}