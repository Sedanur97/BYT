public class ShowModel {
    public static void main(String[] args) {
        Iphone iphone7 = new Iphone();
        iphone7.setModel("İphone 7 Plus");
        iphone7.setColor("silver");
        iphone7.setSerialNum(566768784);
        iphone7.setPrice(899.00);
        iphone7.setYear_of_production(2016);
        iphone7.setInStock(false);

        //Iphone iphone2 = new BuilderIphone()
        Iphone.BuilderIphone iphone2 = new Iphone.BuilderIphone()
                .model("iphone 11")
                .color("white").serialNum(1474142223).price(999.0).Year_of_production(2020).InStock(true)
                ;
        Iphone iphone = iphone2.build();
        

        System.out.println(iphone);
    }

}
