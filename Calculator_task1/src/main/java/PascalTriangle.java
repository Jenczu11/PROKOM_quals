public class PascalTriangle {
    void compute(int n) {
        if (n<0) throw new NegativeArraySizeException("Ujemna wartosc N");
        if (n==0) throw new NegativeArraySizeException("Zerowa wartosc N");
        int trojkatPascala[][] = new int [n][n];

        for (int j=0;j<n;j++){
            trojkatPascala[j][0]=1;
            trojkatPascala[j][j]=1;

            for (int i=0; i<j-1; i++)
                trojkatPascala[j][i+1]=trojkatPascala[j-1][i]+trojkatPascala[j-1][i+1];
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(trojkatPascala[i][j]!=0)System.out.print(trojkatPascala[i][j]);
                System.out.print(" ");
            }
            System.out.println("\n");
        }

    }
}
