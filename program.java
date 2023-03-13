package post;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class program{
    public static void main(String[] args) throws ParseException{

        String moment = "22/06/2018 13:05:44";
      
        DateTimeFormatter formatOne = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

        Comment firstComment = new Comment();
        firstComment.setComment("have a nice trip");
        Comment secondComment = new Comment();
        secondComment.setComment("Wow thats awesome!");
        post postOne = new post(LocalDateTime.parse(moment, formatOne),"Traveling to New Zealand","I'm going to visit this beautiful country",12);
        postOne.addComment(firstComment);
        postOne.addComment(secondComment);

        System.out.println(postOne);

        String momentTwo = "28/07/2018 23:14:19";

        Comment secondCommentOne = new Comment("Good Night");
        Comment secondCommentTwo = new Comment("May the force be with you!");

        post postTwo = new post(LocalDateTime.parse(momentTwo,formatOne),"Good night guys", "See you tomorrow", 5);

        postTwo.addComment(secondCommentOne);
        postTwo.addComment(secondCommentTwo);

        System.out.println(postTwo);
        


    }
}