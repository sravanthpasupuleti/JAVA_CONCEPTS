
public class EncapsulationPR {

    private String Name;
    private String Number;

    public void setname(String name){
        this.Name=name;
    }
    public String getname(){
        return Name;
    }

    public void setnumber(String number){
        this.Number=number;
    }
    public String getnumber(){
        return Number;
    }
    public static void main(String[] args) {
        EncapsulationPR obj = new EncapsulationPR();
        obj.setname("Sravanth");
        obj.setnumber("7036760104");
        System.out.println(obj.getname());
        System.out.println(obj.getnumber());
    }
}
