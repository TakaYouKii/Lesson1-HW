public class School extends Job{
    private int[] marks;

    public School( String place, String address, int[] marks) {
        super( place, address);
        this.marks = marks;
    }

    public int[] getMarks() {
        return marks;
    }
}
