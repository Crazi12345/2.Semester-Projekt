package services;

import models.Brand;
import java.util.List;

public interface IJsonService {
    public List<Brand> deserializeBrand();
}
