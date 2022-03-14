public class Main
{
    public static int[] Convolution_1D(int[] N, int[] M)
    {
        int masks = M.length / 2;

        int[] N1 = new int[N.length + (2 * masks)];

        for (int i = 0; i < N.length; i++)
        {
            N1[masks + i] = N[i];
        }

        for (int i = 0; i < N1.length; i++)
        {
            System.out.println(N1[i]);
        }

        System.out.println();

        int[] P = new int[N.length];

        for (int i = 0; i < P.length; i++)
        {
            P[i] = 0;

            for (int j = 0; j < M.length; j++)
            {
                P[i] += (N1[i + j] * M[j]);
                System.out.println(N1[i + j] + " * "  + M[j] + " = " + (N1[i + j] * M[j]));
            }

            System.out.println();
        }

        for (int i = 0; i < P.length; i++)
        {
            System.out.println(P[i]);
        }

        return P;
    }

    public static void main(String[] args)
    {
        int[] N = {4, 1, 3, 2, 3};
        int[] M = {2, 1, 4};

        //int[] N = {1, 2, 3, 4, 5, 6, 7};
        //int[] M = {3, 4, 5, 4, 3};

        Convolution_1D(N, M);
    }
}
