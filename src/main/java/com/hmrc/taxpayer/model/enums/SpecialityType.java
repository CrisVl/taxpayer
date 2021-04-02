package com.hmrc.taxpayer.model.enums;

public enum SpecialityType {
    CARDIOLOGY("Cardiology"),
    DENTISTRY("Dentistry"),
    Nutritionist("Nutritionist");

    private String specialityType;

    SpecialityType(String specialityType) {
        this.specialityType = specialityType;
    }

    public String getSpecialityType() {
        return specialityType;
    }
}
