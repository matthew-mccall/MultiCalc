package dev.mmccall.multicalc;

public class HTML {
    public static String html(String body) {
        return String.format("""
                <!DOCTYPE html>
                <html lang="en">
                <head>
                    <meta charset="UTF-8">
                    <meta http-equiv="X-UA-Compatible" content="IE=edge">
                    <meta name="viewport" content="width=device-width, initial-scale=1.0">
                    <title>MultiCalc Equation Viewer</title>
                </head>
                <body>
                    %s
                </body>
                </html>""", body);
    }

    public static String div(String body) {
        return String.format("""
                <div>
                    %s
                </div>""", body);
    }

    public static String math(String body) {
        return String.format("""
                <math>
                    %s
                </math>""", body);
    }

    public static String mn(String body) {
        return String.format("<mn>%s</mn>", body);
    }

    public static String mo(String body) {
        return String.format("<mo>%s</mo>", body);
    }
}
