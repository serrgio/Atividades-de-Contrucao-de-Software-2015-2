package br.ufg.inf.es.construcao.software.algoritmo1;

/**
 * Created by José Sergio on 11/11/2015.
 */
public class Algoritimo1 {

    /**
     * Calcula o dia da semana a partir de uma data.
     * @param dia Dia.
     * @param mes Mes.
     * @param ano Ano.
     * @return Inteiro de 1 a 7 representando o dia da semana.
     */
    public static int DiaDaSemana(int dia, int mes, int ano)
    {
        //valida os valores
        if(dia < 1 || dia > 31)
        {
            throw new IllegalArgumentException("O valor de d não corresponde a um dia do mês valido.");
        }
        else if(mes < 1 || mes > 12)
        {
            throw new IllegalArgumentException("O valor de m não corresponde a um mes valido.");
        }
        else if(ano <= 1753)
        {
            throw new IllegalArgumentException("O ano precisa ser maior que 1753");
        }

        //executa o algoritimo
        if(mes == 1 || mes == 2)
        {
            mes += 12;
            ano -= 1;
        }

        return (dia + 2 * mes + (3 * (mes + 1) / 5) + ano + ano / 4
                - ano / 100 + ano / 400) % 7;

    }


}
