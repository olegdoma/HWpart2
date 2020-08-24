package HW2;

public class Main{
    public static void main(String[] args) {

        int result = 0;

        String[][] array = {{"1","2","3","4"},
                            {"5","6","7","8"},
                            {"9","10","11","12"},
                            {"13","14","15","16"}};
        String[][] array1 = {{"1","2","3","4"},
                            {"5","6","7","8"},
                            {"5","6","7","8"},
                            {"9","10","11","12"},
                            {"13","14","15","16"}};
        String[][] array2 = {{"1qqq","2qqq","3qqq","4qqq"},
                            {"5qqq","6qqq","7qqq","8qqq"},
                            {"9","10","11","12"},
                            {"13qqq","14qqq","15qqq","16qqq"}};

        try {
            result = razbor_massiva(array);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма равна "+String.valueOf(result));
            }

        try {
            result = 0;
            result = razbor_massiva(array1);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма равна "+String.valueOf(result));

        }

        try {
            result = 0;
            result = razbor_massiva(array2);
        } catch(MyArraySizeException | MyArrayDataException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Сумма равна "+String.valueOf(result));

        }

     }

    public static int razbor_massiva(String[][] array) throws MyArraySizeException, MyArrayDataException {
        int summ = 0;
        int val = 0;
        int row = 0;
        int cell = 0;

        if(array.length != 4 || array[0].length != 4 || array[1].length != 4) {
            throw new MyArraySizeException();
        }

        for(int i=1;i<4;i++){
        row = i;
        for(int j=1;j<4;j++){
            cell = j;
            try{
            val = Integer.parseInt(array[i-1][j-1]);
            summ += val;
            } catch (IllegalArgumentException e){
            String mess = "в "+String.valueOf(row)+" ряду, "+String.valueOf(cell)+" ячейке";
            throw new MyArrayDataException(mess);
                }
            }
        }

        return summ;
    }
}
