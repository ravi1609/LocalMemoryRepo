public class TestMemory {
     
    public static void main(String [] args) {
         
        int mb = 1024*1024;
         
        //Getting the runtime reference from system
        Runtime runtime = Runtime.getRuntime();
         
        System.out.println("##### Heap utilization statistics [MB] #####");
         
        //Print used memory
        System.out.println("Used Memory:"
            + (runtime.totalMemory() - runtime.freeMemory()) / mb);
 
        //Print free memory
        System.out.println("Free Memory:"
            + runtime.freeMemory() / mb);
         
        
        
        //Print total available memory
        System.out.println("Total Memory:" + runtime.totalMemory() / mb);
 
        //Print Maximum available memory
        System.out.println("Max Memory:" + runtime.maxMemory() / mb);
        
        System.out.println("this line is added for the change in the code");
        
        System.out.println("this is second line added in the code");
        
        System.out.println("hey there i m here joining this code");
        
        
        System.out.println("local branch is added in to this repo");
    }
}
