package pojos;

public class TestItem {

    private String name;
    private String description;
    private int price;
    private String defaultValMin;
    private String defaultValMax;

    public  TestItem(){

    }

    public TestItem(String name, String description,
                           int price, String defaultMinValue, String defaultMaxValue) {
        this.name = name;
        this.description = description;
        this.price = price;
        defaultValMin = defaultMinValue;
        defaultValMax = defaultMaxValue;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getDefaultValMin() {
        return defaultValMin;
    }

    public void setDefaultValMin(String defaultValMin) {
        this.defaultValMin = defaultValMin;
    }

    public String getDefaultValMax() {
        return defaultValMax;
    }

    public void setDefaultValMax(String defaultValMax) {
        this.defaultValMax = defaultValMax;
    }

    @Override
    public String toString() {
        return "TestItemCreated{" +
                "name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", defaultValMin='" + defaultValMin + '\'' +
                ", defaultValMax='" + defaultValMax + '\'' +
                '}';
    }


}
