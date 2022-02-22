package web.models;

public class Car {
    private String modelName;
    private String numberPlate;
    private int issueYear;

    public Car() {
    }

    public Car(String modelName, String numberPlate, int issueYear) {
        this.modelName = modelName;
        this.numberPlate = numberPlate;
        this.issueYear = issueYear;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public String getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(String numberPlate) {
        this.numberPlate = numberPlate;
    }

    public int getIssueYear() {
        return issueYear;
    }

    public void setIssueYear(int issueYear) {
        this.issueYear = issueYear;
    }
}
