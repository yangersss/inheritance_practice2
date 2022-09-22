package inheritance_practice2;

public class AnimalClass extends Subphyla{
    String className;
    String classTrait;
    
    AnimalClass (String clName_p, String sPhyName_p, String phyName_p){
        super (sPhyName_p, phyName_p);
        className = clName_p;

        switch(className){
            //invertebrates
            case "horseshoe crabs" :
                classTrait = "crabs that are horsehoes";
                break;
            
            case "spiders, scorpions" :
                classTrait = "creepy crawlies";
                break;
            
            case "crabs, lobsters, shrimp" :
                classTrait = "yummy";
                break;
            
            case "barnacles" :
                classTrait = "they like stick to the side of ships or smth";
                break;
            
            case "insects" :
                classTrait = "icky";
                break;
            
            case "centipedes" :
                classTrait = "ewwwww";
                break;
            
            case "millipede" :
                classTrait = "ewwwwwwwwwwwwwwwww";
                break;
            
            //vertebrates
            case "amphibia" :
                classTrait = "both water and land?";
                break;
            
            case "reptilia" :
                classTrait = "reptiles";
                break;
            
            case "aves" :
                classTrait = "birds";
                break;
            
            case "mammalia" :
                classTrait = "mammals";
                break;
            
            case "osteichthyes" :
                classTrait = "bony fish";
                break;
            
            case "chondrichthyes" :
                classTrait = "cartilaginous fish";
                break;
            
            case "lampreys" :
                classTrait = "jawless fish";
                break;
            
            case "hagfish" :
                classTrait = "eel shaped slime producing fish";
                break;
            
            default:
                classTrait = "that class isn't in the code :(";
                break;
        }
            
    }

    void printInfo(){
        super.printInfo();
        System.out.println("Class: " + className);
        System.out.println("    Trait: " + classTrait);
    }
}