package org.example;

public class Work {
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException {
        TestArraySizeException();

    }

    public static void TestArraySizeException() throws MyArraySizeException, MyArrayDataException {
      String[][] numStr = {{"321","1235443","123","35"},{"0","9","2","1"},{"10","3","6","ddd"},{"GGG","ttt","bbb","aaa"}};
      if(numStr.length != 4){
          throw new MyArraySizeException();
      }else {
          System.out.println("Вы создали верный массив!!");
      }
        for (int i = 0; i < numStr.length ; i++) {
            for (int j = 0; j < numStr.length; j++) {
                int n;
                try{
                    n = Integer.parseInt(numStr[i][j]);
                }catch(MyArrayDataException e){
                    e.printStackTrace();
                }
            }
        }
    }
}
