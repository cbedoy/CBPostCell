package cbedoy.cbpostcell.Post;

import java.util.Date;
import java.util.List;

/**
 * Created by bedoy on 10/13/16.
 */

public class Post
{
    private User user;
    private Date date;
    private Metadata metadata;
    private List<Option> options;
    private List<Reaction> reactions;
    private List<Comment> comments;

    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public void setOptions(List<Option> options) {
        this.options = options;
    }

    public void setReactions(List<Reaction> reactions) {
        this.reactions = reactions;
    }

    public Date getDate() {
        return date;
    }

    public List<Comment> getComments() {
        return comments;
    }

    public List<Option> getOptions() {
        return options;
    }

    public List<Reaction> getReactions() {
        return reactions;
    }

    public Metadata getMetadata() {
        return metadata;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
