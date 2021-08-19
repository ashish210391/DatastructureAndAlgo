package test;

public class TestCounter {
	int count;

	public TestCounter() {
		count = 0;
	}

	public int incrementAndGetCounter(Integer count) {
		this.count = count + 1;
		// return ++count;
		return this.count;

	}

	public void getAndPrintCOunterValue() {
		for (int i = 0; i < 15; i++) {
			//count=incrementAndGetCounter(count);
			System.out.println(incrementAndGetCounter(Integer.valueOf(count)));
			System.out.println(count);
		}
	}

	public static void main(String[] args) {
		TestCounter counter = new TestCounter();
		counter.getAndPrintCOunterValue();

	}
}
