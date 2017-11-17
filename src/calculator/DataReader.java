package calculator;

import java.io.IOException;

public interface DataReader {
    boolean readFromFile = false;
    int getFirstNumber() throws Exception;
    String getOperation();
    int getSecondNumber ();
    boolean isLast(
           //есть еще строки в файле или пользователь не нажимал  q (quit)

   ) throws IOException;
}

//public interface Operation {
//    int exec (int a, int b);
//
//}