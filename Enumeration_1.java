
// ENUMERATION IN JAVA
// It is used to handled constant value

public class Enumeration_1 {
    enum Variable{
        LOW,
        MEDIUM,
        HIGH ;

    }
    public static void main(String[] args){
        Variable in=Variable. HIGH;
        System.out.println(in);

        // ENUM IN SWITCH CASE
        switch(in){

            case MEDIUM:
                System.out.println("MEDIUM LEVEL");
                break;
            case LOW:
                System.out.println("LOW LEVEL");
                break;
            case HIGH:
                System.out.println("HIGH LEVEL");
                break;
            default:
                System.out.println("WRONG CONDITION");
        }
        System.out.println("------------------------");

        // ENUMERATION IN ENHANCED FOR LOOP

        for(Variable output :Variable.values()){
            System.out.println( output);
        }
    }
}
