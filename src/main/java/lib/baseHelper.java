package lib;

public class baseHelper {
    private static String baseUri="https://snlajyu.kjag-upgradeapis.cloudinsights-dev.netapp.com";
    private static String apiKey = "eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzM4NCJ9.eyJyb2xlcyI6WyJ0ZW5hbnRfYWRtaW4iLCJhZG1pbiIsInN5c3RlbV9hZG1pbiIsImd1ZXN0IiwidXNlciJdLCJpc3MiOiJvY2kiLCJleHAiOjE2NTYwMDA0MjksImxvZ2luIjoia2phZyIsImlhdCI6MTYyNDQ2NDQyOSwidGVuYW50IjoiOTk3N2FlZGQtYzVmMy00YWRmLWE2NDQtY2E0ODc5ODkyYjc4In0.ziFoa2n2pMm6q4IAjuO43BlanUtgf1Ra97H-lgm6SM1ed4EYlHkul58fxFbghvqz";
    private static String apiKeyHeader = "x-cloudinsights-apikey";

    public static String getApiKeyHeader() {
        return apiKeyHeader;
    }

    public static String getBaseUri(){
        return baseUri;
    }

    public static String getapiKey(){
        return apiKey;
    }
}
