public class homework{
    public static void main(String[] args){
        Spreadsheet spreadsheet = new Spreadsheet();
        spreadsheet.addRow(1);
        spreadsheet.addColumn(2);

        MsExcel msExcel = new MsExcel("xlsx");
        msExcel.addRow(3);
        msExcel.addColumn(4);

        MathOperation mathOperation = new MathOperation();
        System.out.println(mathOperation.subtraction(10, 5));
        System.out.println(mathOperation.subtraction(10.0, 5.0, 2.0));
        mathOperation.subtraction(10.0);
        mathOperation.subtraction(10);
        System.out.println(mathOperation.subtraction(10, 5, 2.0));

       
    }
}
class Spreadsheet {
    public void addRow(int row) {
        System.out.println(row + " row added");
    }

    public void addColumn(int column) {
        System.out.println(column + " column added");
    }
}

class MsExcel extends Spreadsheet {
    String fileType;

    public MsExcel(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public void addRow(int row) {
        System.out.println("MsExcel: " + row + " row added in " + fileType + " file");
    }

    @Override
    public void addColumn(int column) {
        System.out.println("MsExcel: " + column + " column added in " + fileType + " file");
    }
}

class MathOperation {
    public int subtraction(int a, int b) {
        return a - b;
    }

    public double subtraction(double a, double b, double c) {
        return a - b - c;
    }

    public void subtraction(double a) {
        System.out.println("Invalid operation");
    }

    public void subtraction(int a) {
        System.out.println("Invalid operation");
    }

    public double subtraction(int a, int b, double c) {
        return a - b - c;
    }
}


    
