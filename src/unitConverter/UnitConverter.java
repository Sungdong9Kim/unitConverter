package unitConverter;

public class UnitConverter {
    // 필요한 상수 정의
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double INCH_PER_CENTIMETER = 2.54;
    
    private UnitConverter() {
    	
    }
    

    public static double toPounds(double kilograms) {
    	double pounds = kilograms / KILOGRAMS_PER_POUND;
    	
    	return pounds;
        // 메소드 내부를 채워주세요
    }
    public static double toKilograms(double pounds) {
    	
    	double kilograms = pounds * KILOGRAMS_PER_POUND;
    	return kilograms;
        // 메소드 내부를 채워주세요
    }
    public static double toCentimeters(double inches) {
    	
    	double centimeters = inches * INCH_PER_CENTIMETER;
    	
    	return centimeters;
        // 메소드 내부를 채워주세요
    }
    public static double toInches(double centimeters) {
    	
    	double inches = centimeters / INCH_PER_CENTIMETER;
    	return inches;
        // 메소드 내부를 채워주세요
    }
    public static double toFahrenheit(double celsius) {
    	
    	double fahrenheit = celsius * 9 / 5 + 32;
    	
    	return fahrenheit;
        // 메소드 내부를 채워주세요
    }
    public static double toCelsius(double fahrenheit) {
    	
    	double celsius = (fahrenheit - 32) * 5 / 9;
    	return celsius;
        // 메소드 내부를 채워주세요
    }
}