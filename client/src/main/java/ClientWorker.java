
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.entity.StringEntity;

import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static org.apache.http.HttpHeaders.USER_AGENT;

/**
 * Created by ddragan on 7/27/2016.
 */
public class ClientWorker implements CommentWebServiceClient {

    String url = "https://selfsolve.apple.com/wcResults.do";


    //this is working
    public Comment save(Comment comment) throws IOException {
        //object => json
        Gson gson = new Gson();

        StringEntity stringEntity = new StringEntity(gson.toJson(comment));
        HttpPost post = new HttpPost("http://localhost:8080/api/comment");
        post.setEntity(stringEntity);
        post.setHeader("Content-type", "application/json");



        HttpResponse response = HttpClientBuilder.create().build().execute(post);

        // json = > object
        String jsonObj = EntityUtils.toString(response.getEntity());
        Comment res = gson.fromJson(jsonObj, Comment.class);

        return res;
    }

    public Comment update(Comment comment) throws IOException {
        //object => json
        Gson gson = new Gson();

        StringEntity stringEntity = new StringEntity(gson.toJson(comment));
        HttpPut put = new HttpPut("http://localhost:8080/api/comment");
        put.setEntity(stringEntity);
        put.setHeader("Content-type", "application/json");

        HttpResponse response = HttpClientBuilder.create().build().execute(put);

        // json = > object
        String jsonObj = EntityUtils.toString(response.getEntity());
        Comment res = gson.fromJson(jsonObj, Comment.class);

        return res;
    }

    // this is working
    public Comment findById(Long commentId) throws IOException {
        Gson gson = new Gson();
        HttpGet request = new HttpGet("http://localhost:8080/api/comment/" + commentId);

        request.addHeader("User-Agent", USER_AGENT);
        HttpResponse response = HttpClientBuilder.create().build().execute(request);

        String jsonObj = EntityUtils.toString(response.getEntity());
        Comment res = gson.fromJson(jsonObj, Comment.class);

        return res;
    }

    public List<Comment> findAll() {
        List<Comment> comments = new ArrayList<Comment>();
/*
        for (i){
            Comment res = findById(i);
            comments.add(res);
        }
*/
        return comments;
    }

    public void delete(Long commentId) throws IOException {
        Gson gson = new Gson();
        HttpDelete request = new HttpDelete("http://localhost:8080/api/comment/" + commentId);
    }
}
