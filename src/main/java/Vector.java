public class Vector implements IntList {
    private int[] numbers = new int[20];
    private int size = 0;


    @Override
    public void add(int number) {
        System.out.println("This method checks if array is full, if so, doubles number of spots");
        if (size == numbers.length) {
            int expandedLength = numbers.length * 2;
            int[] expandedArray = new int[expandedLength];
            System.out.println("Vector expanded size: " + expandedLength);

            for (int i = 0; i < size; i++) {
                expandedArray[i] = numbers[i];

            }
            numbers = expandedArray;
        }
        numbers[size] = number;
        size++;
    }

    @Override
    public int get(int id) {
        //System.out.println(numbers[id]);
        return numbers[id];

    }


}
