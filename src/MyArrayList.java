public abstract class MyArrayList<E> implements MyList<E> {

        private Object[] elements;
        private int size;

        public MyArrayList() {
            elements = new Object[10];
            size = 0;
        }

        @Override
        public void add(E element) {
            if (size == elements.length) {
                Object[] newArray = new Object[2 * elements.length];
                System.arraycopy(elements, 0, newArray, 0, elements.length);
                elements = newArray;
            }
            elements[size++] = element;
        }

        @Override
        public E get(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            return (E) elements[index];
        }

        @Override
        public boolean remove(E item) {
            for (int i = 0; i < size; i++) {
                if (elements[i].equals(item)) {
                    remove(i);
                    return true;
                }
            }
            return false;
        }

         @Override
         public E remove(int index) {
            if (index < 0 || index >= size) {
                throw new IndexOutOfBoundsException();
            }
            E removedElement = (E) elements[index];
            System.arraycopy(elements, index + 1, elements, index, size - index - 1);
            size--;
            return removedElement;
    }


    @Override
        public int size() {
            return size;
        }

    }


