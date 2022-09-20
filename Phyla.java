package inheritance_practice2;

public class Phyla {
    String phylaName;
    String phylaTrait;
    
    Phyla(String phyName_p){
        phylaName = phyName_p;

        if(phylaName == "chordata"){
            phylaTrait = "All posess five synapomorphies (primary characteristics) at some point in their life";
        }
        if(phylaName == "arthropoda"){
            phylaTrait = "exoskeleton, segmented body, paired jointed appendages";
        }
    }

    void printInfo(){
        System.out.println("Phyla: " + phylaName);
        System.out.println("    Trait: " + phylaTrait);
    }
}
