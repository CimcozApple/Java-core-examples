package tests.HW8_get_set;

class Toys {

    private String name;
    private int price;

    public Toys(String name) {
        this.name = name;
    }

    public Toys(int price) {
        this.price = price;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Toys toys = (Toys) o;
//        return price == toys.price &&
//                Objects.equals(name, toys.name);
//    }
}
