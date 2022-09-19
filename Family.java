package inheritance_practice2;

// needs 2 families
public class Family extends AnimalClass{
    String familyName;
    String familyTrait;
    
    Family(String famName_p, String clName_p, String sPhyName_p, String phyName_p){
        super (clName_p, sPhyName_p, phyName_p);
    }
}
