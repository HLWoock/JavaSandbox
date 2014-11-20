package de.oose.generics.problem;

abstract class Drink {
}

class Beer extends Drink {
  private final String brewery;
  public Beer (String brewery) 	{ this.brewery = brewery; }
  public String getBrewery () 	{ return this.brewery; }
  public String toString () 	{ return this.getClass ().getName () + " [" + this.brewery + "]"; }
}

abstract class Wine extends Drink {
  private final String region;
  public Wine (String region) 	{ this. region = region; }
  public String getRegion () 	{ return this.region; }
  public String toString () 	{ return this.getClass ().getName () + " [" + this.region + "]"; }
}

class WhiteWine extends Wine {
  public WhiteWine (String region) 	{ super (region); }
}

class RedWine extends Wine {
  public RedWine (String region) 	{ super (region); }
}



abstract class DrinkBottle {
}

class BeerBottle extends DrinkBottle {
  private Beer content;
  public void fill (Beer content) { 
    this.content = content; 
  }
  public Beer empty () { 
    Beer content = this.content; this.content = null; return content; 
  }
}

abstract class WineBottle extends DrinkBottle {
}

class WhiteWineBottle extends WineBottle {
  private WhiteWine content;
  public void fill (WhiteWine content) { 
    this.content = content; 
  }
  public WhiteWine empty () { 
    WhiteWine content = this.content; 
    this.content = null; 
    return content; 
  }
}

class RedWineBottle extends WineBottle {
  private RedWine content;
  public void fill (RedWine content) { 
    this.content = content; 
  }
  public RedWine empty () { 
    RedWine content = this.content; 
    this.content = null; 
    return content; 
  }
}


class Bottle {
  private Drink content;
  public boolean isEmpty () {
    return this.content == null;
  }
  public void fill (Drink content) {
    this.content = content;
  }
  public Drink empty () {
    Drink content = this.content; 
    this.content = null; 
    return content;
  }
}

public class Application {
  
  public static void main (String [] args) {
		Bottle beerBottle = new Bottle ();
		beerBottle.fill (new WhiteWine ("Burgunder"));
		Beer beer = (Beer) beerBottle.empty ();	// ClassCastException!
	}
}