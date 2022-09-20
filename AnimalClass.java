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

                break;
            }
            case "spiders, scorpions" :
                
                break;
            }
            case "crabs, lobsters, shrimp" :
                
                break;
            }
            case "barnacles" :
                
                break;
            }
            case "insects" :
                
                break;
            }
            case "centipedes" :
                
                break;
            }
            case "millipede" :
                
                break;
            }
            //vertebrates
            case "amphibia" :
                
                break;
            }
            case "reptilia" :
                
                break;
            }
            case "aves" :
                
                break;
            }
            case "mammalia" :
                
                break;
            }
            case "osteichthyes" :
                classTrait = "bony fish";
                break;
            }
            case "chondrichthyes" :
                classTrait = "cartilaginous fish";
                break;
            }
            case "lampreys" :
            
                break;
            }
            case "hagfish" :

                break;
            }
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
