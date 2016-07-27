import java.io.IOException;
import java.util.List;

/**
 * Created by ddragan on 7/27/2016.
 */

public interface CommentWebServiceClient {
    Comment save(Comment comment) throws IOException;
    Comment update(Comment comment);
    Comment findById(Long commentId);
    List<Comment> findAll();
    void delete(Long commentId);
}
