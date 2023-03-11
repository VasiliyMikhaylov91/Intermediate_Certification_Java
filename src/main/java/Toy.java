public class Toy {
    private Integer id;
    private String name;
    private Integer numbers;
    private Integer frequency;

    public Toy(Integer id, String name, Integer numbers, Integer frequency) {
        this.id = id;
        this.name = name;
        this.numbers = numbers;
        this.frequency = frequency;
    }

    public void changeName(String newName) {
        name = newName;
    }

    public void changeFrequency(Integer newFrequency) {
        frequency = newFrequency;
    }

    public void setNumbers(Integer numbers) {
        this.numbers = numbers;
    }

    public void reduceNumbers() {
        numbers--;
    }

    public int getNumbers() {
        return numbers;
    }

    public int getFrequency() {
        return frequency;
    }

    public String getName() {
        return name;
    }

    public void print() {
        System.out.printf("id %d \n name %s \n numbers %d \n frequency %d \n", id, name, numbers, frequency);
    }
}
