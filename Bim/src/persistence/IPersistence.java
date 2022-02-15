package persistence;

import models.Brand;

public interface IPersistence {
    public void createBrand(Brand brand);
    public Brand getBrand(int id);
    public void deleteBrand(int id);
    public void updateBrand(Brand brand);
    public void setupDatabase();
}
