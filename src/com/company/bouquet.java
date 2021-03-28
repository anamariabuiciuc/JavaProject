package com.company;

public class bouquet extends product {
    private int numberOfFlowers;
    private String colorOfFlowers;
    public bouquet(String productName, double productPrice, int numberOfFlowers, String colorOfFlowers)
    {
        super(productName, productPrice);
        this.numberOfFlowers = numberOfFlowers;
        this.colorOfFlowers = colorOfFlowers;
    }

    public void setNumberOfFlowers()
    {
        this.numberOfFlowers = numberOfFlowers;
    }

    public void setColorOfFlowers()
    {
        this.colorOfFlowers = colorOfFlowers;
    }

    public int getNumberOfFlowers()
    {
        return numberOfFlowers;
    }

    public String getColorOfFlowers()
    {
        return colorOfFlowers;
    }

    @Override
    public double calculPromotie() {
        return super.getProductPrice() * 0.1;
    }
}
