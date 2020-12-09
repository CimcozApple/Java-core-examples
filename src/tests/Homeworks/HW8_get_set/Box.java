package tests.HW8_get_set;

import java.util.Objects;

class Box {
       private int width; // ширина коробки
       private int height; // высота коробки

       public Box() {
            width = 10;
            height = 10;
        }

    public Box(int width, int height) {
           this.width = width;
           this.height = height;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return width == box.width &&
                height == box.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }
}

