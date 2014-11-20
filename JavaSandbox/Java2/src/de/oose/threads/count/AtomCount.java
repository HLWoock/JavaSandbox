package de.oose.threads.count;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomCount implements Count {
	AtomicInteger c = new AtomicInteger(0);
	@Override
	public int next() {
		return c.addAndGet(1);
	}
}
