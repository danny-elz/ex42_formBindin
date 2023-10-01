package ca.sheridanc.elzeind.ex42_formBindin.beans;

import lombok.Data;

import java.math.BigDecimal;
@Data

public class Game {
     private long id;
     private String title;
     private String publisher;

     private String platform;

     private String[] platforms = {"XBOX", "PS5", "PC"};

     private BigDecimal price;
}


