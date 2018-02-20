package oop3hometask1;

public class Human {

    private int age;
    private int weight;
    private String hoirColour;
    private boolean sex;
    private String familyname;

    public Human(int age, int weight, String hoirColour, boolean sex, String familyname) {
        this.age = age;
        this.weight = weight;
        this.hoirColour = hoirColour;
        this.sex = sex;
        this.familyname = familyname;
    }



    public Human() {
    }

    public void print() {
        System.out.println(" Age " + age + "\n Weight " + weight + "\n Sex " + sex + "\n HairColor " + hoirColour+"\n FamlyName "+familyname);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getHoirColour() {
        return hoirColour;
    }

    public void setHoirColour(String hoirColour) {
        this.hoirColour = hoirColour;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }
    
    public String getFamilyname() {
        return familyname;
    }

    public void setFamilyname(String familyname) {
        this.familyname = familyname;
    }

    @Override
    public String toString() {
        return "Human{" + "age=" + age + ", weight=" + weight + ", hoirColour=" + hoirColour + ", sex=" + sex + ", familyname=" + familyname + '}';
    }

}
