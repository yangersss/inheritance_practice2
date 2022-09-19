package inheritance_practice2;

public class AnimalClass extends Subphyla{
    String classname;
    String classTrait;
    
    AnimalClass (String clName_p, String sPhyName_p, String phyName_p){
        super (sPhyName_p, phyName_p);
    }
}
