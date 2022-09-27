public class Comments {
    private int id;
    private int customer_id;
    private String question;
    private String answer;
    public Comments(int id, int customer_id, String question, String answer) {
        this.id = id;
        this.customer_id = customer_id;
        this.question = question;
        this.answer = answer;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }
    public String getQuestion() {
        return question;
    }
    public void setQuestion(String question) {
        this.question = question;
    }
    public String getAnswer() {
        return answer;
    }
    public void setAnswer(String answer) {
        this.answer = answer;
    }
    @Override
    public String toString() {
        return "Comments [answer=" + answer + ", customer_id=" + customer_id + ", id=" + id + ", question=" + question
                + "]";
    }
    
}
