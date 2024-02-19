class OddIns {

    public static void main(String[] args) {

        int aNumber = 1;
        
        do {

            if ( aNumber % 2 == 1 ) { // This is an ODD Integer - display it!

                 System.out.println(aNumber);
            } 

            aNumber++;

        } while ( aNumber <= 39 );  // POST-Test Loop
        
    }

}