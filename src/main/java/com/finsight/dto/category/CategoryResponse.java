package com.finsight.dto.category;

public class CategoryResponse {

    private Long id;
    private String name;
    private String color;
    private Long userId;

    public CategoryResponse(
            Long id,
            String name,
            String color,
            Long userId
    ) {
        this.id = id;
        this.name = name;
        this.color = color;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public Long getUserId() {
        return userId;
    }
}