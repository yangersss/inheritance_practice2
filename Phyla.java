package inheritance_practice2;

public class Phyla {
    String phylaName;
    String phylaTrait;
    
    Phyla(String phyName_p){
        phylaName = phyName_p;

        switch (phylaName){
        case "chordata":
            phylaTrait = "All posess five synapomorphies (primary characteristics) at some point in their life";
            break;
        case "arthropoda":
            phylaTrait = "exoskeleton, segmented body, paired jointed appendages";
            break;
        default:
            phylaTrait = "sorry that phyla is not in the code :(";
            break;
        }
    }

    void printInfo(){
        System.out.println("Phyla: " + phylaName);
        System.out.println("    Trait: " + phylaTrait);
    }
}
