package TortinhasQuixotescas.atividades;

import TortinhasQuixotescas.util.Checker;

import static org.junit.jupiter.api.Assertions.*;

class Atividade1Test {
    Integer[] array1 = {20, 12, 10, 15, 2};
    Integer[] array2 = {2, 10, 12, 15, 20};

    @org.junit.jupiter.api.Test
    // função com defeito que gera falha
    void shouldThrowExceptionIfArray1IsNotSorted() {
        try {
            Atividade1.selectionSortDefect(array1);
            if (!Checker.isArrayOrdered(array1)) {
                throw new IllegalStateException("O array não está ordenado!");
            }
        } catch (Exception e) {
            fail("Erro: " + e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
        // função com defeito que não gera falha
    void shouldThrowExceptionIfArray2IsNotSorted() {
        try {
            Atividade1.selectionSortDefect(array2);
            if (!Checker.isArrayOrdered(array2)) {
                throw new IllegalStateException("O array não está ordenado!");
            }
        } catch (Exception e) {
            fail("Erro: " + e.getMessage());
        }
    }

    @org.junit.jupiter.api.Test
    // função corrigida
    void shouldThrowExceptionIfAnyArrayIsNotSorted() {
        try {
            Atividade1.selectionSort(array1);
            Atividade1.selectionSort(array2);
            if (!Checker.isArrayOrdered(array1) || !Checker.isArrayOrdered(array2)) {
                throw new IllegalStateException("O array não está ordenado!");
            }
        } catch (Exception e) {
            fail("Erro: " + e.getMessage());
        }
    }

}