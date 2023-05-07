public class segregate {
    public static void main(String[] args) {
        segrate(new int[] { 0, 1, 1, 0, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0 });
    }

    public void segrate(int[] arr) {
        int zeroBoundary = 0;
        int oneBoundary = arr.length - 1;

        while (zeroBoundary < oneBoundary) {
            while (zeroBoundary < arr.length && arr[zeroBoundary] == 0)
                zeroBoundary++;

            while (oneBoundary >= 0 && arr[oneBoundary] == 1)
                oneBoundary--;

            if (zeroBoundary < oneBoundary) {
                arr[zeroBoundary] = 0;
                arr[oneBoundary] = 1;

                zeroBoundary++;
                oneBoundary--;
            }

        }
    }
}
