public class Computer  // 定义一个公开类，是一个学生对象的模板
{
    String brand;  // 品牌
    String style;  // 款式
    String color;  // 颜色
    private int price;  // 价格

    // 构造方法【带参数】
    public Computer(String brand, String style, String color, int price) {
        this.brand = brand;
        this.style = style;
        this.color = color;
        this.setPrice(price);
    }

    // 构造方法【默认参数】
    public Computer() {
        this("lenovo", "thinkpad", "黑", 5600);
    }

    // 获取价格
    public int getPrice() {
        return price;
    }

    // 给定价格
    public void setPrice(int price) {
        if(price > 0)
            this.price = price;
        else if(price == 0)
            System.out.println("天下没有免费的午餐！");
        else  // price < 0
            System.out.println("傻子才倒贴钱！");
    }

    public String infoGet() {
        String info="";
        info += this.brand+"牌的";
        info += this.style+"系列";
        info += this.color+"款的，";
        info += this.price+"块买的。";
        return info;
    }
}