package Backtracking;

public class RatInMazeTwoDirectionsCount {
    public static int printCount(int sr,int sc, int er, int ec, int count){
        if(sr>er || sc>ec){
            return 0;
        }
        if(sr == er && sc == ec){
            return 1;
        }
        // go Right
        int RightWays = printCount(sr,sc+1,er,ec,count+1);

        // go Down
        int DownWays = printCount(sr+1,sc,er,ec,count+1);

        int TotalCount = RightWays+DownWays;
        return TotalCount;
    }
    static void main(String[] args) {
        int rows = 4;
        int cols = 6;
        int count = 0;
        int TotalCount = printCount(0,0, rows-1,cols-1,count);
        System.out.println(TotalCount);

    }
}
