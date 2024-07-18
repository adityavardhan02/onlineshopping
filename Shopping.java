package apjfsa;

public class Shopping {
	    private String item;

	    synchronized void purchaseItem(String i) throws InterruptedException {
	        this.item = i;

	        if (!item.equalsIgnoreCase("Laptop")) {
	            System.out.println("Item is not available. Waiting...");
	            wait(); // Wait if Item is not available
	        }

	        System.out.println("The Item available now: " + item + " - You can purchase it.");
	    }

	    synchronized void itemAvailable(String i) {
	        System.out.println("Item is now available: " + i);
	        this.item = i;
	        notify(); // Notify waiting threads that the item is available
	        }
}