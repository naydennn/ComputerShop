package bg.softuni.computershop.models.view;

public class StatsView {

    private int authRequest;
    private int anonRequest;

    public StatsView(int authRequest, int anonRequest) {
        this.authRequest = authRequest;
        this.anonRequest = anonRequest;
    }

    public int getTotalRequest(){
        return  this.authRequest + this.anonRequest;
    }

    public int getAuthRequest() {
        return authRequest;
    }

    public StatsView setAuthRequest(int authRequest) {
        this.authRequest = authRequest;
        return this;
    }

    public int getAnonRequest() {
        return anonRequest;
    }

    public StatsView setAnonRequest(int anonRequest) {
        this.anonRequest = anonRequest;
        return this;
    }
}
