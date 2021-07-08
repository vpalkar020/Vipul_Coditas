public class DeadLockSample {
 
    //resources shared by multiple threads
    String firstResource = "firstresource";
    String secondResource = "secondResource";
 
    Thread ThreadOne = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Starting ThreadOne");
 
            // resource 'firstResource'
            synchronized (firstResource) {
                try 
                {
                    Thread.sleep(100);
                } catch (Exception ex) {
                }
                synchronized (secondResource) {
                    System.out.println("Acquired both!");
                }
            }
 
            // check for deadlock happened or not!
            System.out.println("Completed ThreadOne");
        }
    });
 
    Thread ThreadTwo = new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("Starting ThreadTwo");
            synchronized (secondResource) {
                try {
                    
                    Thread.sleep(100);
                } catch (Exception ex) {
                }
                synchronized (firstResource) {
                    System.out.println("Acquired both!");
                }
            }
            // check for deadlock!
            System.out.println("Completed ThreadTwo");
        }
    });
 
    // Java example program on thread deadlock
    public static void main(String[] args) {
        DeadLockSample ds = new DeadLockSample();
        ds.ThreadOne.start();
        ds.ThreadTwo.start();
    }
}