public class Car {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String color;


    public void out(){
        System.out.println("馬のエンブレムは" + name +  "です。");
        System.out.println("トレードカラーは" + color + "色です。");
    }



}
