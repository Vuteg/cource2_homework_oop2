package transport;

public abstract class Transport {
        private final String brand;
        private final String model;
        private final int productionYear;
        private final String productionCountry;
        private String bodyColor;
        private int maxSpeed;

        public Transport(String brand, String model, int productionYear, String productionCountry, String bodyColor, int maxSpeed) {
            this.brand = validateBrand(brand);
            this.model = validateModel(model);
            this.productionYear = validateProductionYear(productionYear);
            this.productionCountry = validateProductionCountry(productionCountry);
            setBodyColor(bodyColor);
            setMaxSpeed(maxSpeed);
        }

        public String getBrand() {
            return brand;
        }


        public String getModel() {
            return model;
        }


        public int getProductionYear() {
            return productionYear;
        }

        public String getProductionCountry() {
            return productionCountry;
        }

        public String getBodyColor() {
            return bodyColor;
        }

        public void setBodyColor(String bodyColor) {
            if (bodyColor == null || bodyColor.isEmpty() || bodyColor.isBlank())
                bodyColor = "white";
            this.bodyColor = bodyColor;
        }

        public int getMaxSpeed() {
            return maxSpeed;
        }

        public void setMaxSpeed(int maxSpeed) {
            if (maxSpeed <= 0)
                maxSpeed = 120;
            this.maxSpeed = maxSpeed;
        }

    public String validateBrand(String brand) {
           return (brand== null || brand.isEmpty() || brand.isBlank())? "unknown brand" : brand;
    }
    public String validateModel(String model) {
        return (model== null || model.isEmpty() || model.isBlank())?"unknown model": model;
    }
    public int validateProductionYear (int productionYear) {
        return productionYear <= 0 ? 2000 : productionYear;
    }

    public String validateProductionCountry(String productionCountry) {
        return (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) ? "unknown country" : productionCountry;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYear=" + productionYear +
                ", productionCountry='" + productionCountry + '\'' +
                ", bodyColor='" + bodyColor + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

