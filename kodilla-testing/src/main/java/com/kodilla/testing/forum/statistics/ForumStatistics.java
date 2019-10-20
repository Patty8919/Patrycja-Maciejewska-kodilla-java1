package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private int users;
    private int posts;
    private int comments;
    private double postsAvgPerUser;
    private double commentsAvgPerUser;
    private double commentsAvgPerPost;

    public int getUsers() {
        return users;
    }

    public int getPosts() {
        return posts;
    }

    public int getComments() {
        return comments;
    }

    public double getPostsAvgPerUser() {
        return postsAvgPerUser;
    }

    public double getCommentsAvgPerUser() {
        return commentsAvgPerUser;
    }

    public double getCommentsAvgPerPost() {
        return commentsAvgPerPost;
    }



    public void calculateAdvStatistics(Statistics statistics){
        users = statistics.usersNames().size();
        posts = statistics.postsCount();
        comments = statistics.commentsCount();
        postsAvgPerUser = calculatePostsAvgPerUser();
        commentsAvgPerUser = calculateCommentsAvgPerUser();
        commentsAvgPerPost = calculateCommentsAvgPerPost();
    }

    private double calculatePostsAvgPerUser() {

        if(users>0){
            return (double)posts/users;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerUser() {
        if(users>0){
            return (double)comments/users;
        } else {
            return 0;
        }
    }

    private double calculateCommentsAvgPerPost() {
        if(posts>0){
            return (double)comments/posts;
        } else {
            return 0;
        }
    }

    public void showStatistics(){
        System.out.println("Forum advanced statistics:");
        System.out.println("Users quantity: " + users);
        System.out.println("Posts quantity: " + posts);
        System.out.println("Comments quantity: " + comments);
        System.out.println("Posts average per user " + postsAvgPerUser);
        System.out.println("Comments average per user " + commentsAvgPerUser);
        System.out.println("Comments average per post " + commentsAvgPerPost);
    }
}
