package de.oose.threads.count;

public class SyncCount implements Count {
	int c = 0;
	@Override
	public  synchronized int next() {
		return c++;
	}
}
