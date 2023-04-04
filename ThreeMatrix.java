class ThreeDMatrix { 
    public static void main ( String [] args ){
    int [] [] [] threeD = new int [3] [4] [5] ; 
    int i, j, k; 
    int sum = 0;
    
    for ( i=0 ; i<3; i++ ){
    for ( j =0 ; j <4; j++) {
    for ( k=0; k<5 ; k++ ) {
    threeD [i] [j] [k] = sum;
    sum++;
  
    System.out . print ( threeD [i] [j] [k] +" " ) ; 
    }
    System . out . println ( ) ; 
    }
    System . out . println ( ) ; 
   
}

   
}
}