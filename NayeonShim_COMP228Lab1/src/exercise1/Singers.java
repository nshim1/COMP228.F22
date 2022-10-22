package exercise1;

public class Singers {
    private int id;
    private String name;
    private String address;
    private String dateOfBirth;

    private int numOfAlbums;

    public Singers() {
        this(0, "", "", "", 0);
    }

    public Singers(int id, String name, String address, String dateOfBirth, int numOfAlbums) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numOfAlbums = numOfAlbums;
    }
    //getter
    public int getId() {
        return id;
    }
    public String getSingerName() {
        return name;
    }
    public String getSingerAddress() {
        return address;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
    public int getNumOfAlbums(){
        return numOfAlbums;
    }

    //setter
    public void setId(int id) {
        this.id = id;
    }



    public void setSingerName(String singerName) {
        name = singerName;
    }



    public void setSingerAddress(String address) {
        this.address = address;
    }



    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }



    public void setNumOfAlbums(int numOfAlbums) {
        this.numOfAlbums = numOfAlbums;
    }

    public void setSinger(int sid, String name, String address, String dateOfBirth, int numOfAlbums){
        id = sid;
        this.name = name;
        this.address = address;
        this.dateOfBirth = dateOfBirth;
        this.numOfAlbums = numOfAlbums;
    }




    @Override
    public String toString() {
        return
                "SingerId= " + this.getId() +
                        "\nSingerName= " + this.getSingerName() +
                        "\nSingerAddress= " + this.getSingerAddress() +
                        "\ndateOfBirth= " + this.getDateOfBirth() +
                        "\nnumOfAlbums= " + this.getNumOfAlbums();
    }
}
