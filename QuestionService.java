import java.util.Scanner;
public class QuestionService {
    Question[] questions = new Question[5];
    String Selection[] = new String[5];
    public QuestionService() {
        questions[0] = new Question(1,"Size of int","2 bytes","4 bytes","8 bytes","16 bytes","4 bytes");
        questions[1] = new Question(2,"Size of float","2 bytes","4 bytes","8 bytes","16 bytes","4 bytes");
        questions[2] = new Question(3,"Size of double","2 bytes","4 bytes","8 bytes","16 bytes","8 bytes");
        questions[3] = new Question(4,"Size of char","2 bytes","4 bytes","8 bytes","16 bytes","2 bytes");
        questions[4] = new Question(5,"Size of boolean","2 bytes","4 bytes","8 bytes","16 bytes","1 byte");
    }

    public void displayQuestions(){
        int i = 0;
        for(Question q: questions) {
            System.out.println("Question No: " + q.getId());
            System.out.println("Question: " + q.getQuestion());
            System.out.println("Option 1: " + q.getOpt1());
            System.out.println("Option 2: " + q.getOpt2());
            System.out.println("Option 3: " + q.getOpt3());
            System.out.println("Option 4: " + q.getOpt4());
            Scanner sc = new Scanner(System.in);
            Selection[i] =  sc.nextLine();
            i++;
        }
        for(String s: Selection) {
            System.out.println("Selected Option: " + s);
        }
    }
    public void printScore() {
        int score = 0;
        for(int i = 0; i < questions.length; i++) {
            Question q = questions[i];
            String Actualanswer = q.getAnswer();
            String userAnswer = Selection[i];
            if(Actualanswer.equals(userAnswer)) {
                score++;
            }
            
        }
        System.out.println("Your Score is: " + score);
    }
    
}
