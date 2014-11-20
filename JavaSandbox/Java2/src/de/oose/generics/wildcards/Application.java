package de.oose.generics.wildcards;

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


class Bottle<T extends Drink> {

  private T content;

  public boolean isEmpty () {
    return this.content == null;
  }
  public void fill (T content) {
    if (this.content != null)
      throw new IllegalStateException ();
    this.content = content;
  }
  public T empty () {
    if (this.content == null)
      throw new IllegalStateException ();
    T content = this.content;
    this.content = null;
    return content;
  }
  public String toString () {
    return this.getClass ().getName () + " [content=" + this.content + "]";
  }
}


class BottleBox {
  
  private Object [] bottles = new Object [6];
  private int count = 0;
  
  public boolean isFull () { return this.count == this.bottles.length; }
  public int getBottleCount () { return this.count; }
  public int getCapacity () { return this.bottles.length; }
  public void add (Bottle<? extends Drink> bottle) {
    if (this.isFull ())
      throw new IllegalStateException ();
    this.bottles [this.count] = bottle;
    this.count++;
  }
  public Bottle<? extends Drink> getBottle (int index) {
    return (Bottle<? extends Drink>) this.bottles [index];
  }
}


class BottleBox2 <T extends Bottle <? extends Drink>> {
  
  private Object [] bottles = new Object [6];
  private int count = 0;
  
  public boolean isFull () { return this.count == this.bottles.length; }
  public int getBottleCount () { return this.count; }
  public int getCapacity () { return this.bottles.length; }
  public void add (T bottle) {
    if (this.isFull ())
      throw new IllegalStateException ();
    this.bottles [this.count] = bottle;
    this.count++;
  }
  public T getBottle (int index) {
    return (T) this.bottles [index];
  }
}


public class Application {
  
  public static void main (String [] args) {
  	test0 ();
  	test1 ();
  	test2 ();
	}

	private static void test0 () {
		System.out.println ("test0 ---------------------------");	
		
		Bottle<Beer> beerBottle = new Bottle<Beer> ();
		beerBottle.fill (new Beer ("Veltins"));
	
		Bottle<? extends Drink> drinkBottle;				
		
		drinkBottle = beerBottle;

		// drinkBottle.fill (new Beer ("Jever"));	// illegal		
		Drink drink = drinkBottle.empty ();
		
		System.out.println (drink);
	}

	private static void test1 () {
		System.out.println ("test1 ---------------------------");	
	
		BottleBox box = new BottleBox ();

		Bottle<Beer> beerBottle = new Bottle<Beer> ();
		beerBottle.fill (new Beer ("Veltins"));
		box.add (beerBottle);
		
		Bottle<WhiteWine> whiteWineBottle = new Bottle<WhiteWine> ();
		whiteWineBottle.fill (new WhiteWine ("Burgunder"));
		box.add (whiteWineBottle);
		    
		for (int i = 0; i < box.getBottleCount (); i++) {
		  Bottle<? extends Drink> bottle = box.getBottle (i);
		  Drink drink = bottle.empty ();
		  System.out.println (drink);
		}
	}
	
	private static void test2 () {
		System.out.println ("test2 ---------------------------");	
		
		BottleBox2<Bottle<Beer>> box = new BottleBox2<Bottle<Beer>> ();	
		Bottle<Beer> bottleBeer = new Bottle<Beer> ();
		bottleBeer.fill (new Beer ("Veltins"));
		box.add (bottleBeer);
		for (int i = 0; i < box.getBottleCount (); i++) {
		  Bottle<Beer> b = box.getBottle (i);
		  Beer beer = b.empty ();
		  System.out.println (beer);
		}
	}		
}