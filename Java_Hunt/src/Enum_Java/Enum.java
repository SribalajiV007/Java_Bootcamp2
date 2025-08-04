package Enum_Java;

public class Enum {
    enum Week {
        Monday , Tuesday , Wednesday , Thursday , Friday, Saturday, Sunday

        //These are enum constants
        //public static and final
        //Since Its final we can't create child enums
        //type is Week
    }

    public static void main(String[] args) {
        Week week ;
        week = Week.Monday;

        for(Week day : Week.values() ){
            System.out.println(day);
        }
    }
}
