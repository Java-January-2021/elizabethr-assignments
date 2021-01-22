public class BasicJavaTesting {
    public static void main(String[] args){
         int[] nums = {23,234,2345,-23,42};
        // LoopArray(nums);
        // MaxMinAverage(nums);
        // System.out.println(GetArraySum(nums));
        // System.out.println(GetArraySum(nums));
        BasicJava bjobject = new BasicJava();
            bjobject.OneTo255();
            System.out.println(bjobject.getArraySum(nums));
            bjobject.printOdds();
            bjobject.printSum();
            bjobject.loopArray(nums); 
            System.out.println(bjobject.findMax(nums));
            System.out.println(bjobject.getAverage(nums));
            System.out.println(bjobject.oddArray());
            bjobject.squareArray(nums);

    }

}