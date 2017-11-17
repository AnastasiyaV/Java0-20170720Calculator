package calculator;

import calculator.model.CalculateResult;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class StatisticsKeeper {
    BufferedWriter bafWriter = null;
    BufferedReader bafReader = null;
    Connection conn = null;
    private static final String table_name = "operation_statistics";
    private static final String column_date = "column_date", column_result_success = "column_result_success";
    private static final String CREATE_OPERATIONS_STATISTICS_TABLE = "CREATE TABLE " + table_name + " (" + column_date + " BIGINT NOT NULL, " + column_result_success + " BOOL NOT NULL)";

    private void openDB() {
        try {
            Class.forName("org.h2.Driver").newInstance();
            conn = DriverManager.getConnection("jdbc:h2:test",
                    "sa", "");


        } catch (Exception e) {
            e.printStackTrace();

        }
    }


    private void insertResult(CalculateResult result) throws SQLException {
        if (conn == null) {
            return;
        }
        Statement st = conn.createStatement();
        st.executeUpdate("INSERT INTO " + table_name + " VALUES (" + result.getDate() + "," + result.getResult() + ")");
        st.close();
    }


    private void createTable() throws SQLException {
        Statement st;
        st = conn.createStatement();
        st.executeUpdate(CREATE_OPERATIONS_STATISTICS_TABLE);//comment the line if the table already exists
        st.close();
    }


    private void closeDb() throws SQLException {
        if (conn != null) {
            conn.close();
        }
    }


    public void writeStat() {
        try {
            bafReader = new BufferedReader(new FileReader("sourceOperations.txt"));

            //File file = new File("newfile.txt"); //pipe creation for writer
            boolean fileVariable = file.createNewFile(); //file creation
            if (fileVariable) {
                System.out.println("fILE CREATED");
            } else {
                System.out.println("File already exists");
            }

            bafWriter = new BufferedWriter(new OutputStreamWriter(
                    new FileOutputStream(file)));
            //FileOutputStream - by bytes
            //OutputStreamWriter - by symbol
            String line = "";
            while (line != null) {
                line = bafReader.readLine();
                if (line != null) {
                    bafWriter.write(line);
                    bafWriter.newLine();
                    bafWriter.flush();
                }

            }

        } catch (IOException e) {
            System.err.println("Check the file" + e.getStackTrace());
        } finally {
            try {
                if (bafWriter != null) {
                    bafWriter.close();
                }
            } catch (IOException e) {
                System.out.println("bafWriter=null");
            }
            try {
                if (bafReader != null) {
                    bafReader.close();
                }
            } catch (IOException e) {
                System.out.println("bafReader=null");
            }
        }

    }
}
