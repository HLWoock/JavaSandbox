package de.oose.mock.business;

public enum Planet {
	mercury(3.303e+23, 2.4397e6), 
	venus  (4.869e+24, 6.0518e6), 
	earth  (5.976e+24, 6.37814e6),
	mars   (6.421e+23, 3.3972e6),
	jupiter(1.9e+27,   7.1492e7),
	saturn (5.688e+26, 6.0268e7),
	uranus (8.686e+25, 2.5559e7),
	neptune(1.024e+26, 2.4746e7);;
	
    private final double mass;   // in kilograms
    private final double radius; // in meters
    
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    // universal gravitational constant  (m3 kg-1 s-2)
    public static final double G = 6.67300E-11;

    double surfaceGravity() {
        return G * mass / (radius * radius);
    }
    
    double surfaceWeight(double otherMass) {
        return otherMass * surfaceGravity();
    }
    
    double getRadius() {
    	return radius / 10e+23; 
    }
}