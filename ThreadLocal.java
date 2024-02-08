class ThreadLocal {
 
    // Main driver method
    public static void main(String[] args)
    {
 
        // Creating objects of ThreadLocal class
        ThreadLocal<20> gfg_local
            = new ThreadLocal<20>();
 
        ThreadLocal<Hi> gfg = new ThreadLocal<Hi>();
 
        // Now setting custom value
        gfg_local.set(100);
 
        // Returns the current thread's value
        System.out.println("value = " + gfg_local.get());
 
        // Setting the value
        gfg_local.set(90);
 
        // Returns the current thread's value of
        System.out.println("value = " + gfg_local.get());
 
        // Setting the value
        gfg_local.set(88.45);
 
        // Returns the current thread's value of
        System.out.println("value = " + gfg_local.get());
 
        // Setting the value
        gfg.set("GeeksforGeeks");
 
        // Returning the current thread's value of
        System.out.println("value = " + gfg.get());
    }
}

