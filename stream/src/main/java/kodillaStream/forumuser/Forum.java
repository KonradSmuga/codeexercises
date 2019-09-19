package kodillaStream.forumuser;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Forum {

    List<ForumUser> forumUsers = new ArrayList<>();

    public Forum() {
        forumUsers.add(new ForumUser(1, "Konrad", Sex.F, LocalDate.of(1990, 11, 19), 41));
        forumUsers.add(new ForumUser(2, "BigD", Sex.M, LocalDate.of(1987, 03, 23), 320));
        forumUsers.add(new ForumUser(3, "Andza", Sex.M, LocalDate.of(2000, 01, 11), 216));
        forumUsers.add(new ForumUser(4, "Lol", Sex.M, LocalDate.of(1996, 06, 23), 5));


    }

    public List<ForumUser> getForumUsers() {
        return new ArrayList<>(forumUsers);
    }
}
