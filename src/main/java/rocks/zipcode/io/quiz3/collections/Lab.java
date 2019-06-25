package rocks.zipcode.io.quiz3.collections;

/**
 * @author leon on 10/12/2018.
 */
public class Lab {
    private String name;
    private LabStatus status;


    public Lab() {
        name = null;
    }

    public Lab(String labName) {
        this.name = labName;
        this.status = LabStatus.INCOMPLETE;
    }

    public String getName() {
        return name;
    }

    public void setStatus(LabStatus labStatus) {
        status = labStatus;
    }

    public LabStatus getStatus() {
        return status;
    }
}
