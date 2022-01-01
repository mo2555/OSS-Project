public class Student {
    private String name;
    private String id;
    private String age;
    private String collage;
    private String address;

    public Student(String name, String id, String age, String collage, String address) {
        this.name = name;
        this.id = id;
        this.age = age;
        this.collage = collage;
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public void setCollage(String collage) {
        this.collage = collage;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getAge() {
        return age;
    }

    public String getCollage() {
        return collage;
    }

    public String getAddress() {
        return address;
    }

    public String getAllData(){
        return "Name : "+name+" Age : "+age+" ID : "+id+" Collage : "+collage+" Address : "+address;
    }
    public String writeAllData(){
        return name+","+id+","+age+","+collage+","+address;
    }
}
