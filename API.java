import java.util.*;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.BodyPublishers;
import com.google.gson.*;

public class API {
    public static void main(String[] args) throws Exception {
        transcript transcript = new transcript();
		transcript.setAudio_url("http://www.github.com/johnmarty3/javaapitutorial/blob/main/thirsty.mp4");
		Gson gson = new Gson();
		String jsonReq = gson.toJson(transcript);
		//System.out.println(jsonReq);
		HttpRequest request = HttpRequest.newBuilder()
			.uri(URI.create("https://api.assemblyai.com/v2/transcript"))
			.header("authorization", "c2fab113283145b8b5d8a8ddf6d20480")
			.POST(BodyPublishers.ofString(jsonReq))
            .build();
		//HttpClient httpclient = HttpClient.newHttpClient();
		//HttpResponse<String> postResponse = httpClient.send(postRequest, BodyHandlers.ofString());

    }

}
