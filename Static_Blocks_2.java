
// STATIC BLOCKS IN JAVA
//  It is Set of Blocks,that used to Execute before the class is Loading
//  It suits only STATIC VARIABLES and STATIC FUNCTIONS
 class BlockTest{
    static {
        System.out.println("Block-4");
    }
    static {
        System.out.println("Block-5");
    }
}
public class Static_Blocks_2 {
    static {
        System.out.println("Block-1");
    }
    public static void main(String[] args){
        BlockTest in=new BlockTest();

        System.out.println("Block-2");
    }
    static {
        System.out.println("Block-3");
    }
}
