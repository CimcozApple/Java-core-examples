package tests.HW10_interface_absctractclass.classExamples;

public class Gallery_NestedInner {

    private String name = "Art Gallery";

    public class Jewelry {

        boolean isJewelryGold = false;

        public void showGalleryName() {
            System.out.println("name = " + name);
        }
    }
}