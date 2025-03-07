package com.microservice.UserService.domain;

public class ProductSearchDomain {
    private String productId;
    private String productName;
    private String category;
    private String brand;
    private Double minPrice;
    private Double maxPrice;
    private Double rating;
    private Boolean availability;
    private String color;
    private String size;
    private String description;
    private String seller;
    private Integer stock;
    private String sortBy; // price, rating, relevance, etc.
    private String sortOrder; // asc or desc
    private Integer pageNumber;
    private Integer pageSize;
}
