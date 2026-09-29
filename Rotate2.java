public class Rotate2 {
    public static int[][] rotate(int[][] ogArray)
    {
        int[][] newArray = new int[ogArray[0].length][ogArray.length];
        for (int i = 0; i < ogArray.length; i++)
        {
            for (int j = 0; j < ogArray[0].length; j++)
            {
                newArray[j][ogArray.length - 1 - i] = ogArray[i][j];
            }
        }
        return newArray;
    }
}
