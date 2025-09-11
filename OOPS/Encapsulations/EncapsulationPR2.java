public class EncapsulationPR2 {
    public EncapsulationPR2(String name,int id){
        System.out.println("EncapsulationPR2 COnstructor is executed");
        this.name = name;
        this.id = id;
    }

    private String name;
    private int id;

    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public static void main(String[] args) {
        EncapsulationPR2 obj = new EncapsulationPR2("srav" , 21);
        System.out.println(obj.getname());
        System.out.println(obj.getid());
    }
}
