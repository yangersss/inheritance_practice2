package inheritance_practice2;

public class Subphyla extends Phyla{
    String subphylaName;
    String subphylaTrait;
    
    Subphyla (String sPhyName_p, String phyName_p){
        super (phyName_p);
        subphylaName = sPhyName_p;

        switch(subphylaName){
            case("chelicerata"){

                break;
            }
            case("crustacea"){
                
                break;
            }
            case("myriapoda"){
                
                break;
            }
            case("vertebrata"){
                
                break;
            }
        }
    }

    void printInfo(){
        super.printInfo();
        System.out.println("SubPhyla: " + subphylaName);
        System.out.println("    Trait: " + subphylaTrait);
    }
}
