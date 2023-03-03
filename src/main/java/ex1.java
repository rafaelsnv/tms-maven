import org.jetbrains.annotations.NotNull;

import java.util.List;

public class ex1 {

    /**
     * Questão 1
     */
    public double calculaMedia(@NotNull List<Integer> list) {
        return list.stream()
                .mapToDouble(d -> d)
                .average()
                .orElse(0.0);
    }

    public boolean estaOrdenada(List<Integer> integerList) {
        return estaOrdenada(integerList, integerList.size());
    }

    /**
     * Questão 2
     */
    private boolean estaOrdenada(List<Integer> integerList, int indexSize) {
        if (indexSize < 2) {
            return true;
        } else if (integerList.get(indexSize - 2).compareTo(integerList.get(indexSize - 1)) > 0) {
            return false;
        } else {
            return estaOrdenada(integerList, indexSize - 1);
        }
    }

    /**
     * Questão 3
     */
    public int fatorial(int num)
    {
        int result = 1, i;
        for (i=2; i<=num; i++)
            result *= i;
        return result;
    }

    /**
     * Questão 4
     */
    public double converteTemperatura (double celsius){
        return (celsius * 1.8) + 32;
    }

    /**
     * Questão 5
     */
    public boolean ePrimo(int num){
        int dividers = 0;
        for (int i = 1; i <= num; i++){
            if (num % i == 0)
                dividers++;
        }
        return dividers == 2;
    }

    /**
     * Questão 6
     */
    public boolean listaOrdenada(List<Integer> integerList) {
        return listaOrdenada(integerList, 0) ||
                estaOrdenada(integerList, integerList.size());
    }

    private boolean listaOrdenada(@NotNull List<Integer> integerList, int index) {
        if (index == integerList.size() -1) {
            return true;
        } else if (integerList.get(index).compareTo(integerList.get(index + 1)) < 0) {
            return false;
        } else {
            return listaOrdenada(integerList, index + 1);
        }
    }

}
