/* * @author:Saawan * @created:[10/20/2020],Tuesday * Time:11:45 AM */public abstract class Human {    public static final int LIFESPAN=100;    private String name;    private int age;    private float height;    public Human(String name,int age){        this.name=name;        this.age=age;    }    public Human(String name,int age,float height){        this(name, age);        this.height=height;    }    public  abstract int getTimeToLive();    public static int getLIFESPAN() {        return LIFESPAN;    }    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }    public int getAge() {        return age;    }    public void setAge(int age) {        this.age = age;    }    public float getHeight() {        return height;    }    public void setHeight(float height) {        this.height = height;    }}//2U231162NNU