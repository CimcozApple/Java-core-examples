package tests.HW14_annotations_generics.GoodExample_HW14;

/*
Create your own annotation with 5 variables as metadata fields.
Add usage of new annotation for method, class, variable.
 */
@HomeWork.HW14.MyAnnotation(
        priority = 1,
        status = HomeWork.HW14.MyAnnotation.Status.DONE,
        showInHelp = false,
        tag = "done",
        lastModified = "09/07/2019"
)
public class Task2_annotation {
    @HomeWork.HW14.MyAnnotation(status = HomeWork.HW14.MyAnnotation.Status.NEW,
            showInHelp = false,
            tag = "new",
            lastModified = "03/12/2080")
    private String task = "new Task today";

    @HomeWork.HW14.MyAnnotation(priority = 2,
            tag = "task",
            lastModified = "03/11/2020")
    public void printNewTask() {
        System.out.println("New Task is " + task);
    }
}
