package spring;

public class Car implements Vehicle {
    private String name;
    private Integer perDayCost;

    public Car() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPerDayCost() {
        return perDayCost;
    }

    public void setPerDayCost(Integer perDayCost) {
        this.perDayCost = perDayCost;
    }

    public void drive() {
        System.out.println("car driving");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", perDayCost=" + perDayCost +
                '}';
    }
}
