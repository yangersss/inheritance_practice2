package inheritance_practice2;

public class Subphyla extends Phyla{
    String subphylaName;
    String subphylaTrait;
    
    Subphyla (String sPhyName_p, String phyName_p){
        super (phyName_p);
        subphylaName = sPhyName_p;

        switch(subphylaName){
            case "chelicerata":
                subphylaTrait = "subdivision of arthropoda";
                break;
            case "crustacea":
                subphylaTrait = "crustaceans";
                break;
            case "myriapoda":
                subphylaTrait = "millipedes, centipedes, etc.";
                break;
            case "vertebrata":
                subphylaTrait = "vertebrates";
                break;
            default:
                subphylaTrait = "sorry that phyla is not in the code";
        }
    }

    void printInfo(){
        super.printInfo();
        System.out.println("SubPhyla: " + subphylaName);
        System.out.println("    Trait: " + subphylaTrait);
    }
}