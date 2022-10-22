package exercise1;

public class Driver {
    public static void main(String[] args) {
        //create 1 Singer (singer1) object with the help of the no argument constructor
        Singers singer1 = new Singers();
        System.out.println(singer1);
        System.out.println();


        singer1.setSinger(002004,"Ariana Grande","1241 W Newport Center Dr Deerfield Beach, FL 33442-7738 USA", "19940625",52);
        System.out.println(singer1);
        System.out.println();


        //change each instance values using each setter
        singer1.setId(0x2008);
        singer1.setSingerName("Justin Bieber");
        singer1.setSingerAddress("Beverly Hills in Los Angeles County, California");
        singer1.setDateOfBirth("19930626");
        singer1.setNumOfAlbums(83);


        //Display current value of each after the changes are done. Use getters for each to accomplish this.
        System.out.println(singer1);
    }
}
