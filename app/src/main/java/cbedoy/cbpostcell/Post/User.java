package cbedoy.cbpostcell.Post;

/**
 * Created by bedoy on 10/13/16.
 */

public class User
{
    private String nickname;
    private USER_TYPE userType;
    private String avatarURL;
    private boolean online;

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public void setAvatarURL(String avatarURL) {
        this.avatarURL = avatarURL;
    }

    public void setOnline(boolean online) {
        this.online = online;
    }

    public void setUserType(USER_TYPE userType) {
        this.userType = userType;
    }

    public String getNickname() {
        return nickname;
    }

    public String getAvatarURL() {
        return avatarURL;
    }

    public USER_TYPE getUserType() {
        return userType;
    }

}
