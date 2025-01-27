import java.util.ArrayList;
import java.util.List;

public class GymClass {
    private String className;
    private String schedule;
    private List<Member> enrolledMembers;

    public GymClass(String className, String schedule) {
        this.className = className;
        this.schedule = schedule;
        this.enrolledMembers = new ArrayList<>();
    }

    public String getClassName() {
        return className;
    }

    public void enroll(Member member) {
        enrolledMembers.add(member);
    }

    @Override
    public String toString() {
        List<String> memberNames = new ArrayList<>();
        for (int i = 0; i < enrolledMembers.size(); i++) {
            Member member = enrolledMembers.get(i);
            memberNames.add(member.getName());
        }
        return className + " (" + schedule + "): " + memberNames;
    }
}
