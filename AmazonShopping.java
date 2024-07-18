package apjfsa;

public class AmazonShopping {
	    public static void main(String[] args) {
	       AmazonShopping s = new AmazonShopping();

	        Thread purchaseThread = new Thread() {
	            public void run() {
	                try {
	                   s.purchaseItem("Not available");
	                } catch (InterruptedException e) {
	                    e.printStackTrace();
	                }
	            }
	        };

	        Thread availabilityThread = new Thread() {
	            public void run() {
	                s.itemAvailable("Laptop");
	            }
	        };

	        purchaseThread.start();
	        availabilityThread.start();
	    }
	}


