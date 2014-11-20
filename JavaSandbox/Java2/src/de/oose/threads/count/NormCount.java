package de.oose.threads.count;

public class NormCount implements Count {
	int c = 0;
	@Override
	public int next() {
		return c++;
	}
}
