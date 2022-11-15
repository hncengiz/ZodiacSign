import java.util.Scanner;

public class ZodiacSign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int day, month;

        System.out.print(" Please enter your day of birth: ");
        day = scanner.nextInt();

        System.out.print(" Please enter your month of birth: ");
        month = scanner.nextInt();

        String zodiacSign = "";
        boolean isError = false;

        if (month == 1) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiacSign = " Capricorn ";
                } else {
                    zodiacSign = " Aquarius ";
                }
            } else {
                isError = true;
            }
        } else if (month == 2) {
            if (day >= 1 && day <= 28) {
                if (day <= 19) {
                    zodiacSign = " Aquarius ";
                } else {
                    zodiacSign = " Pisces ";
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if (day >= 1 && day <= 31) {
                if (day <= 20) {
                    zodiacSign = " Pisces ";
                } else {
                    zodiacSign = " Aries ";
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if (day >= 1 && day <= 30) {
                if (day <= 20) {
                    zodiacSign = " Aries ";
                } else {
                    zodiacSign = " Taurus ";
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiacSign = " Taurus ";
                } else {
                    zodiacSign = " Gemini ";
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    zodiacSign = " Gemini ";
                } else {
                    zodiacSign = " Cancer ";
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiacSign = " Cancer ";
                } else {
                    zodiacSign = " Leo ";
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiacSign = " Leo ";
                } else {
                    zodiacSign = " Virgo ";
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if (day >= 1 && day <= 30) {
                if (day <= 22) {
                    zodiacSign = " Virgo ";
                } else {
                    zodiacSign = " Libra ";
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if (day >= 1 && day <= 31) {
                if (day <= 22) {
                    zodiacSign = " Libra ";
                } else {
                    zodiacSign = " Scorpio ";
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if (day >= 1 && day <= 30) {
                if (day <= 21) {
                    zodiacSign = " Scorpio ";
                } else {
                    zodiacSign = " Sagittarius ";
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if (day >= 1 && day <= 31) {
                if (day <= 21) {
                    zodiacSign = " Sagittarius ";
                } else {
                    zodiacSign = " Capricorn ";
                }
            } else {
                isError = true;
            }
        } else {
            isError = true;
        }

        if (isError) {
            System.out.println(" You entered an invalid day.");
        } else {
            System.out.println(" Your Zodiac Sign is: " + zodiacSign);
        }
    }

}
