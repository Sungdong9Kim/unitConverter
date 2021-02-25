package unitConverter;

public class UnitConverter {
    // �ʿ��� ��� ����
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double INCH_PER_CENTIMETER = 2.54;
    
    private UnitConverter() {
    	
    }
    

    public static double toPounds(double kilograms) {
    	double pounds = kilograms / KILOGRAMS_PER_POUND;
    	
    	return pounds;
        // �޼ҵ� ���θ� ä���ּ���
    }
    public static double toKilograms(double pounds) {
    	
    	double kilograms = pounds * KILOGRAMS_PER_POUND;
    	return kilograms;
        // �޼ҵ� ���θ� ä���ּ���
    }
    public static double toCentimeters(double inches) {
    	
    	double centimeters = inches * INCH_PER_CENTIMETER;
    	
    	return centimeters;
        // �޼ҵ� ���θ� ä���ּ���
    }
    public static double toInches(double centimeters) {
    	
    	double inches = centimeters / INCH_PER_CENTIMETER;
    	return inches;
        // �޼ҵ� ���θ� ä���ּ���
    }
    public static double toFahrenheit(double celsius) {
    	
    	double fahrenheit = celsius * 9 / 5 + 32;
    	
    	return fahrenheit;
        // �޼ҵ� ���θ� ä���ּ���
    }
    public static double toCelsius(double fahrenheit) {
    	
    	double celsius = (fahrenheit - 32) * 5 / 9;
    	return celsius;
        // �޼ҵ� ���θ� ä���ּ���
    }
}