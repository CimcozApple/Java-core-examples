package tests.HW10_interface_absctractclass.classExamples;

public class General {

    public static void main(String[] args) {

        Gallery_NestedInner.Jewelry jewelry = new Gallery_NestedInner().new Jewelry();
        jewelry.showGalleryName();
        System.out.println("A precious metal: " + jewelry.isJewelryGold);
        System.out.println();

        InnerClass inner = new InnerClass();
        inner.showFirstValue();


    }
}
