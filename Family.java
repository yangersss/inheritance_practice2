package inheritance_practice2;

// needs 2 families
public class Family extends AnimalClass{
    String familyName;
    String familyTrait;
    
    Family(String famName_p, String clName_p, String sPhyName_p, String phyName_p){
        super (clName_p, sPhyName_p, phyName_p);
        familyName = famName_p;

        switch(familyName){
            case("Struthionidae"):
                familyTrait = "Ostritches are here";
                break;
            case("Rhincodontidae"):
                familyTrait = "whale sharks??";
                break;
            case("Alligatoridae"):
                familyTrait = "in florida";
                break;
            case("Hominidae"):
                familyTrait = "hoomans are in here";
                break;
            case ("Bovidae"):
                familyTrait = "cows belong here";
                break;
            default:
                familyTrait = "that family isn't in the code :(";
        }
    }
    
    void printInfo(){
        super.printInfo();
        System.out.println("Family: " + familyName);
        System.out.println("    Trait: " + familyTrait);
    }
}
