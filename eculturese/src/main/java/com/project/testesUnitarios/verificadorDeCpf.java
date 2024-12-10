package com.project.testesUnitarios;

public class verificadorDeCpf {
    public static void main(String[] args) {
        int soma = 0;
        int resto = 0;

        String cpf = "05390851544";

        for (int i = 0; i < 9; i++) {
                soma = soma +  Character.getNumericValue(cpf.charAt(i))*(10-i);
        }
        resto = 11 - (soma  % 11);

        if (resto == Character.getNumericValue(cpf.charAt(9))){
            // calcular 2 digito
            soma = 0;
            for (int i = 0; i < 10; i++) {
                soma = soma + Character.getNumericValue(cpf.charAt(i))*(11-i);
            }
            resto = 11 - (soma % 11);

            if (resto == Character.getNumericValue(cpf.charAt(10))){
                System.out.println("Cpf válido");
            }

        }else {
            System.out.println("Invalido");
        }






    }
}
