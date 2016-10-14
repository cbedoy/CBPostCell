package cbedoy.cbpostcell.Post;

/**
 * Created by bedoy on 10/13/16.
 */

public class Option
{
    private int resource;
    private int identifier;
    private String title;

    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getIdentifier() {
        return identifier;
    }

    public int getResource() {
        return resource;
    }

    public String getTitle() {
        return title;
    }
}
