import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.impl.conn.DefaultHttpClientConnectionOperator;
import org.apache.http.util.EntityUtils;
import sun.net.www.http.HttpClient;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Date;
import java.util.List;
import java.net.HttpURLConnection;

import static org.apache.http.HttpHeaders.USER_AGENT;

/**
 * Created by ddragan on 7/27/2016.
 */
public class ClientWorker implements CommentWebServiceClient {

    String url = "https://selfsolve.apple.com/wcResults.do";

    public Comment save(Comment comment) throws IOException {
        //object => json
        Gson gson = new Gson();

        StringEntity stringEntity = new StringEntity(gson.toJson(comment));
        HttpPost post = new HttpPost("http://localhost:8080/api/comment");
        post.setEntity(stringEntity);

        HttpResponse response = HttpClientBuilder.create().build().execute(post);

        // json = > object
        String jsonObj = EntityUtils.toString(response.getEntity());
        Comment res = gson.fromJson(jsonObj, Comment.class);

        System.out.println("aici 2");
        return res;
    }

    public Comment update(Comment comment) {
        return null;
    }

    public Comment findById(Long commentId) {
        return null;
    }

    public List<Comment> findAll() {
        return null;
    }

    public void delete(Long commentId) {

    }
}
