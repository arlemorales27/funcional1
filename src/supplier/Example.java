package supplier;

import java.util.function.Supplier;

    public class Example<T> {
        private T object;

        public Example(T object) {
            this.object = object;
        }

        public T getObject() {
            return object;
        }

        public static void main(String[] args) {
            Example<String> exampleString = new Example<>("Hola, estudiantes!");
            Supplier<Example<String>> supplierString = () -> exampleString;

            Example<Integer> exampleInteger = new Example<>(42);
            Supplier<Example<Integer>> supplierInteger = () -> exampleInteger;

            System.out.println(supplierString.get().getObject());
            System.out.println(supplierInteger.get().getObject());
        }
    }






