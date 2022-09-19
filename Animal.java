package inheritance_practice2;

public class Animal extends Family{
    String name;
    String trait;
    
    Animal(String name_p, String trait_p, String famNam_p, String clName_p, String sPhyName_p, String phyName_p){
        super(famNam_p, clName_p, sPhyName_p, phyName_p);
    }

    void printInfo(){
        super.printInfo();
        System.out.println("Animal: " + name);
        System.out.println("Trait: " + trait);
    }
}