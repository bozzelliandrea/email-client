package core.om;

public class BaseMailMessage {

    private Integer id;
    private String from;
    private String subject;
    private String date;

    public BaseMailMessage() {
    }

    public BaseMailMessage(Integer id, String from, String subject, String date) {
        this.id = id;
        this.from = from;
        this.subject = subject;
        this.date = date;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public static Object[] getMailMessageObj(BaseMailMessage message) {
        return new Object[]{ message.getFrom(), message.getSubject(), message.getDate() };
    }
}
