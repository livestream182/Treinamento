import java.util.Scanner;

public class Arrays1 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //Variavéis
        int n; // tamanho do vetor
        System.out.println("Valores a armazenar: ");
        n = ler.nextInt();
        int v[] = new int[n]; // declaração do vetor "v"
        int a[] = new int[n];
        int i, j, aux, order = 0; // índice ou posição, e variavéis auxiliares
        
    
    // Entrada de Dados
        for (i=0; i<n; i++) {
          System.out.printf("Informe %2do. valor de %d: ", (i+1), n);
          v[i] = ler.nextInt();
          a[i] = v[i];
        }
        ler.close();

    // Processamento: somar todos os valores, definir o maior e o menor valor
        int soma = 0;
        int menor = v[0]; // v[0] = 1o. valor armazenador no vetor "v"
        int maior = v[0];
        for (i=0; i<n; i++) {
          soma = soma + v[i];
    
          if (v[i] < menor)
             menor = v[i];
    
          if (v[i] > maior)
             maior = v[i];
        }



    // Saída (resultados)
        System.out.printf("\n");
        for (i=0; i<n; i++) {
          if (v[i] == menor)
            System.out.printf("v[%d] = %2d <--- menor valor\n", i, v[i]);
          else if (v[i] == maior)
                  System.out.printf("v[%d] = %2d <--- maior valor\n", i, v[i]);
               else System.out.printf("v[%d] = %2d\n", i, v[i]);
        }


        System.out.printf("\nSoma = %d\n", soma);



        //ordenado por seleção
        for (i=0; i<(n-1); i++){
          order = i;
              for(j=(i+1);j<n;j++){
                  if(v[j]<a[order])
                  order = j;
              }
          aux = a[i];
          a[i] = a[order];
          a[order] = aux;
          }

  System.out.println("Posição[i] - Original - Ordenado");
  System.out.println("________________________________");
  for(i=0; i<n; i++){
      System.out.printf("v[%d] = %2d, %2d\n", i, v[i], a[i]);


        }
        
      }
      
    }
