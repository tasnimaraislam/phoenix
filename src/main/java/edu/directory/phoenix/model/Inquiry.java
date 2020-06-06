package edu.directory.phoenix.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Inquiry {
    private String keyword;
    private String category;
    private int rating;
}
