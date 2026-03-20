package orrg.study.org.week3.day3;

public class APIClient {

    // Method 1: Only endpoint
    public void sendRequest(String endpoint) {
        System.out.println("Sending request to endpoint: " + endpoint);
    }

    // Method 2: endpoint + requestBody + requestStatus
    public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
        System.out.println("Sending request to endpoint: " + endpoint);
        System.out.println("Request Body: " + requestBody);

        if (requestStatus) {
            System.out.println("Request was successful.");
        } else {
            System.out.println("Request failed.");
        }
    }

    // Main method
    public static void main(String[] args) {

        // Create object
        APIClient client = new APIClient();

        // Call method 1
        client.sendRequest("/getUsers");

        System.out.println("-------------");

        // Call method 2
        client.sendRequest("/createUser", "{name: 'Revathi'}", true);
    }
}

