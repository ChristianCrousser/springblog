//package com.codeup.blog.blog.models;
//
//import javax.persistence.*;
//
//@Entity
//@Table(name = "post_images")
//public class PostImage {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    @Column(columnDefinition = "int(11) UNSIGNED")
//    private int id;
//    @Column( length = 100)
//    private String image_title;
//    @Column( length = 1000)
//    private String url;
//
//    @ManyToOne
//    @JoinColumn (name = "post_id")
//    private Post post;
//
//    public PostImage() {
//    }
//
//    public PostImage(String image_title, String url) {
//        this.image_title = image_title;
//        this.url = url;
//    }
//
//    public PostImage(int id, String image_title, String url) {
//        this.id = id;
//        this.image_title = image_title;
//        this.url = url;
//    }
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getImage_title() {
//        return image_title;
//    }
//
//    public void setImage_title(String image_title) {
//        this.image_title = image_title;
//    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }
//
//    public Post getPost() {
//        return post;
//    }
//
//    public void setPost(Post post) {
//        this.post = post;
//    }
//}
