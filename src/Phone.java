public class Phone {
    int number;
    String model;
    int weight;

    public Phone() {
    }

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.weight = weight;
        this.model = model;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public void showModel() {
        System.out.println("This model is " + model);
    }

    public void callPhone() {
        System.out.println("You are calling  " + number);
    }

}
