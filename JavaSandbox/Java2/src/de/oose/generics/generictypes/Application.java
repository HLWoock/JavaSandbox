package de.oose.generics.generictypes;

abstract class Drink {
}

class Beer extends Drink {
  private final String brewery;
  public Beer (String brewery) 	{ this.brewery = brewery; }
  public String getBrewery () 	{ return this.brewery; }
  public String toString () 		{ return this.getClass ().getName () + " [" + this.brewery + "]"; }
}

abstract class Wine extends Drink {
  private final String region;
  public Wine (String region) 	{ this. region = region; }
  public String getRegion () 		{ return this.region; }
  public String toString () 		{ return this.getClass ().getName () + " [" + this.region + "]"; }
}

class WhiteWine extends Wine {
  public WhiteWine (String region) 	{ super (region); }
}

class RedWine extends Wine {
  public RedWine (String region) 	{ super (region); }
}


class Bottle<T> {
// class Bottle<T extends Drink> {

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


class BeerBottleBox {

  // private Bottle<Beer> [] bottles = new Bottle<Beer> [6];		// Illegal
  private Object [] bottles = new Object [6];
  private int count = 0;
  
  public boolean isFull () {
    return this.bottles.length == this.count;
  }
  public int getBottleCount () {
    return this.count;
  }
  public int getCapacity () {
    return this.bottles.length;
  }
  public void add (Bottle<Beer> bottle) {
    if (this.isFull ())
      throw new IllegalStateException ();
    this.bottles [this.count] = bottle;
    this.count++;
  }
  public Bottle<Beer> getBottle (int index) {
    return (Bottle<Beer>) this.bottles [index];
  }
}


class BottleBox<T extends Drink> {

  private Object [] bottles = new Object [6];
  private int count = 0;
  
  public boolean isFull () { return this.count == this.bottles.length; }
  public int getBottleCount () { return this.count; }
  public int getCapacity () { return this.bottles.length; }
  public void add (Bottle<T> bottle) {
    if (this.isFull ())
      throw new IllegalStateException ();
    this.bottles [this.count] = bottle;
    this.count++;
  }
  public Bottle<T> getBottle (int index) {
    return (Bottle<T>) this.bottles [index];
  }
}

public class Application {
  
  public static void main (String [] args) {
  	test0 ();
  	test1 ();
  	test2 ();
  	test3 ();
  	test4 ();
  	test5 ();
  	test6 ();
	}

	private static void test0 () {
		System.out.println ("test0 ---------------------------");	
		Bottle<Beer> beerBottle = new Bottle<Beer> ();
		Bottle<WhiteWine> whiteWineBottle = new Bottle< WhiteWine > ();

		beerBottle.fill (new Beer ("Veltins"));
		// beerBottle.fill (new WhiteWine ("Burgunder"));	// Illegal		
		whiteWineBottle.fill (new WhiteWine ("Burgunder"));

		Beer beer = beerBottle.empty ();
		System.out.println (beer);
		WhiteWine whiteWine = whiteWineBottle.empty ();
		System.out.println (whiteWine);
		
		Bottle<Wine> wineBottle = new Bottle<Wine> ();
		wineBottle.fill (new WhiteWine ("Burgunder"));
		Wine wine = wineBottle.empty ();
		System.out.println (wine);

		// Bottle<Object> bottle = new Bottle<Beer> ();  		// illegal
	}

	private static void test1 () {
		System.out.println ("test1 ---------------------------");	
		Bottle<Beer> beerBottle = new Bottle<Beer> ();
		//Bottle<Drink> drinkBottle = beerBottle;						// illegal
		//Bottle<Object> objectBottle = drinkBottle;				// illegal
	}	
	
	private static void test2 () {
		System.out.println ("test2 ---------------------------");	
		Bottle bottle = new Bottle ();
		bottle.fill ("Hello World");
		Object object = bottle.empty ();
		String s = (String) object;
		System.out.println (s);
	}
	
	private static void test3 () {
		System.out.println ("test3 ---------------------------");	
		Bottle bottle = new Bottle<Beer> ();
		bottle.fill (new WhiteWine ("Burgunder"));
		WhiteWine whiteWine = (WhiteWine) bottle.empty ();
		System.out.println (whiteWine);
	}

	private static void test4 () {
		System.out.println ("test4 ---------------------------");	
		BeerBottleBox box = new BeerBottleBox ();
		box.add (new Bottle<Beer> ());
		// box.add (new Bottle<WhiteWine> ()); 		// illegal
		Bottle<Beer> bottle = box.getBottle (0);
  }
	
	private static void test5 () {
		System.out.println ("test5 ---------------------------");	
		BottleBox<Beer> box = new BottleBox<Beer> ();
		box.add (new Bottle<Beer> ());
		// box.add (new Bottle<WhiteWine> ()); 		// illegal
		Bottle<Beer> bottle = box.getBottle (0);
  }
  
	private static void test6 () {
		System.out.println ("test6 ---------------------------");	
		BottleBox<Beer> beerBottleBox = new BottleBox<Beer> ();
		for (int i = 0; i < beerBottleBox.getCapacity (); i++) {
		  Bottle<Beer> beerBottle = new Bottle<Beer> ();
		  beerBottle.fill (new Beer ("Jever"));
		  beerBottleBox.add (beerBottle);
		}
		for (int i = 0; i < beerBottleBox.getBottleCount (); i++) {
		  Bottle<Beer> beerBottle = beerBottleBox.getBottle (i);
		  Beer beer = beerBottle.empty ();
		  System.out.println (beer);
		}
  }
}