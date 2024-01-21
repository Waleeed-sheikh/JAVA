
class generalization {
    // Generic Box class
    public static class Box<T> {
        private T value;

        public Box(T value) {
            this.value = value;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }
    }

    public static void main(String[] args) {
        // Example of using the generic class
        Box<Integer> integerBox = new Box<>(10);
        System.out.println("Integer Box Value: " + integerBox.getValue());

        Box<String> stringBox = new Box<>("Hello, Generics!");
        System.out.println("String Box Value: " + stringBox.getValue());
        
        // You can also create Box instances with other types
        Box<Double> doubleBox = new Box<>(3.14);
        System.out.println("Double Box Value: " + doubleBox.getValue());
    }
}
