class Demo {
    public static void main(String[] args){   // DRY
        for(int x = 0; x<5; x++) {
            System.out.println((x+1)+".");
        }
        
        Dier dier = new Beer();
        Beer beer = new Beer();
        
        Dier dier2 = beer;
        beer = (Beer)dier2;
        Dier vogel = new Vogel();
        
        
        Beer beer2 = (Beer)vogel;
        
        OlieTanker ol = new OlieTanker();
        //beer = (Beer)ol;
        
//        dier2.klauwlengte = 66;
        beer.klauwlengte = 24;
        beer.wetenschappelijkNaam = "The Bear";
        
  //      dier.klauwlengte = 55;
        
        // Covariantie   Is-a
        // Konijn Dier Ja
        // Konijn Konijn Ja
        // Dier Konijn Soms  
        // Konijn OlieTanker Nee
        
        int getal = 5;
        String sgetal = new Integer(getal).toString();  // Type Cohersion
        
        
        
    }
} 
class OlieTanker{}

class Dier{
    String wetenschappelijkNaam;
}



class Beer extends Dier{
    int klauwlengte;
}

class Vogel extends Dier{
    int spanweidte;
}

class Aap extends Dier{
    boolean slingert;
}



// IS-a   Overerving
// HAS-a  // field

class Huis{
    Architect architect;
}
class Architect{
    
}


=====================
class Demo {
    public static void main(String[] args){
        System.out.println("start");
        Huis huis = new Huis();
        huis.huisnummer = 34;
        huis.wonen();
        huis.kopen(45);  // Argument
        huis.kopen(66);
        int uitkomst = huis.optellen(3, 7);
        System.out.println(uitkomst);
        
        new Auto("Ferrari");
        
        Auto kar = new Auto("Audi");
        
  //      rondrijden.deAuto();
        huis.rondrijden(  new Auto("Fiat")  );
        huis.rondrijden( kar );
        huis.kopen(44);
        
        System.out.println(  kar.merk);
        System.out.println( kar.snelheid  );
        kar.veranderSnelheid(70);
        System.out.println( kar.snelheid  );
        new Demo().lopen();  // static final
        
    }
     void lopen() {
        System.out.println("lopen");
    }
} 
/*
class EenObject{
    een;
    final twee;
    static drie;
    static final vier;
    
}
*/
/*
berkenboom
    aantalblaadjes
    static seizoen, oudste boom
    final    positie
    static final berkenboom, boomsoort, 
*/
/*
Auto
    deuren;
    final maxGrootte;
    static
    static final snelheidLicht, uitvinder, eersteExemplaar
*/
//   1492
    
    
class Auto{
    final String merk;
    int snelheid = 88;
    
    
    
    Auto(String merk){
        this.merk = merk;
        System.out.println("Er wordt een auto gemaakt"+merk);
    }
    
    Auto verkoopAuto(){
        merk = "bmw";
        return this;
    }
    
    void veranderSnelheid(int snelheid) {
        this.snelheid = snelheid;
    }
}

class Huis{         
    int huisnummer;

    // impliciet expliciet
    // 1 DezelfdeNaam als de klasse(Java) - constructor()  --> 2 Geen returnType
    
    Huis(){}
    
    void rondrijden(Auto deAuto) {  ////DEZE
        System.out.println("rondrijden in auto");
    }
    
    Auto autoKopen(int geld) {
        return new Auto("BMW");
    }
    
    int optellen(int getal1, int getal2) {
        return getal1 + getal2;
    }
    
    void openen(){
        
    }
    void wonen() {
        System.out.println("wonen in huis");
    }
    void kopen(int bedrag) {   // Parameter
        System.out.println("Ik ben gekocht voor: "+bedrag);
    }
    
    
}
