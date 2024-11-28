package TortinhasQuixotescas.atividades;

//     atividade disponível em
//     https://classroom.google.com/c/NzExMjQ4OTMyODM3/a/NzM1MTcxOTI4ODEy/details
//     entregue no dia 27/11/24

public class Atividade1 {
    //Caso de teste ({20,12,10,15,2}, {2,10,12,15,20})

    public static void selectionSortDefect(Integer[] vet) {
        int min, x, flag = 0;
        for (int i = 1; i <= vet.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                    flag = 1;
                }
            }
            if (flag == 1) {
                x = vet[min];
                vet[min] = vet[i];
                vet[i] = x;
            }
        }
    }

    public static void selectionSort(Integer[] vet) {
        int min, x, flag = 0;
        for (int i = 0; i <= vet.length - 1; i++) {
            min = i;
            for (int j = i + 1; j < vet.length; j++) {
                if (vet[j] < vet[min]) {
                    min = j;
                    flag = 1;
                }
            }
            if (flag == 1) {
                x = vet[min];
                vet[min] = vet[i];
                vet[i] = x;
            }
        }
    }
}
