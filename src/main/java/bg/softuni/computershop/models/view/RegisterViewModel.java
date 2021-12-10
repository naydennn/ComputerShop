package bg.softuni.computershop.models.view;

public class RegisterViewModel {

    private int registerRequests;

    public RegisterViewModel(int registerRequests) {
        this.registerRequests = registerRequests;
    }

    public int getRegisterRequests() {
        return registerRequests;
    }

    public RegisterViewModel setRegisterRequests(int registerRequests) {
        this.registerRequests = registerRequests;
        return this;
    }
}
