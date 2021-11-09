public class Iphone   {
    private String model;
    private int serialNum;
    private String color;
    private int year_of_production;
    private double price;
    private Boolean inStock;

    public Iphone() {

    }

    /**
     * public Iphone(String model, int serialNum,
     * String color, int year_of_production,
     * double price, Boolean inStock)
     */

    public Iphone(BuilderIphone builder) {

        this.model = builder.model;
        this.serialNum = builder.serialNum;
        this.color = builder.color;
        this.year_of_production = builder.year_of_production;
        this.price = builder.price;
        this.inStock = builder.inStock;
    }


    public void setModel(String model) {
        this.model = model;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public int getYear_of_production() {
        return year_of_production;
    }

    public void setYear_of_production(int year_of_production) {
        this.year_of_production = year_of_production;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getModel() {
        return model;
    }

    public int getserialNum() {
        return serialNum;
    }


    public int getSerialNum() {
        return serialNum;
    }

    public double getPrice() {
        return price;
    }

    public Boolean getInStock() {
        return inStock;
    }


    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", serialNumber=" + serialNum +
                ", year_of_production=" + year_of_production +
                ", price=" + price +
                ", inStock=" + inStock +
                '}';
    }


    public static class BuilderIphone {

        public String model;
        public int serialNum;
        public String color;
        public int year_of_production;
        public double price;
        public Boolean inStock;

        public BuilderIphone model(String model) {
            this.model = model;
            return this;
        }

        public BuilderIphone serialNum(int serialNum) {
            this.serialNum = serialNum;
            return this;
        }

        public BuilderIphone color(String color) {
            this.color = color;
            return this;
        }

        public BuilderIphone Year_of_production(int year_of_production) {
            this.year_of_production = year_of_production;
            return this;
        }

        public BuilderIphone price(double price) {
            this.price = price;
            return this;
        }

        public BuilderIphone InStock(boolean inStock) {
            this.inStock = inStock;
            return this;
        }



        public Iphone inStock(boolean b) {
            Iphone iphone = new Iphone(this);
            return iphone;
        }
        public Iphone build() {
            Iphone iphone = new Iphone(this);
            return iphone;
        }
    }
}