package cbedoy.cbpostcell.Post;

/**
 * Created by bedoy on 10/13/16.
 */

public class Metadata
{
    private String text;
    private String imageURL;
    private int height;
    private int width;
    private int size;
    private METADATA_TYPE metadataType;
    private String description;
    private String provider;

    public void setDescription(String description) {
        this.description = description;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setImageURL(String imageURL) {
        this.imageURL = imageURL;
    }

    public void setMetadataType(METADATA_TYPE metadataType) {
        this.metadataType = metadataType;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }

    public METADATA_TYPE getMetadataType() {
        return metadataType;
    }

    public String getDescription() {
        return description;
    }

    public String getImageURL() {
        return imageURL;
    }

    public String getProvider() {
        return provider;
    }

    public String getText() {
        return text;
    }
}
