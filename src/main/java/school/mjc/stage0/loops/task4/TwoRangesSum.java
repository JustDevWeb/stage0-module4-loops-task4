package school.mjc.stage0.loops.task4;

public class TwoRangesSum {
    public void printSumOfTwoRanges(int numberToSkip, int lastInRow) {
        int skipped = 0;
        int counted = 0;

        if(numberToSkip <= lastInRow && lastInRow > 0) {
            for(int i = 0; i <= lastInRow; i++){
                if(i<=numberToSkip){
                    skipped += i;
                }else{
                    counted += i;
                }
            }
            System.out.println("skipped sum is " + skipped);
            System.out.println("counted sum is " + counted);

        } else if (lastInRow < 0) {
            System.out.println("last number in row is negative");
        } else {
            System.out.println("number to skip is bigger then the last");
        }


    }
}
