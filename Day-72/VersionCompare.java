// Print whether the version is upgraded, downgraded or not changed according to the input given.
// example: Input : Version1 4.8.2 Version2 4.8.4 Output: upgraded, Input : Version1 4.0.2 Version2 4.8.4 Output: downgraded

import java.util.Scanner;

public class VersionCompare {

    public static String compareVersions(String version1, String version2) {
        String[] v1 = version1.split(": ")[1].split("\\.");
        String[] v2 = version2.split(": ")[1].split("\\.");

        int length = Math.max(v1.length, v2.length);

        for (int i = 0; i < length; i++) {
            int v1Part = i < v1.length ? Integer.parseInt(v1[i]) : 0;
            int v2Part = i < v2.length ? Integer.parseInt(v2[i]) : 0;

            if (v1Part < v2Part) {
                return "upgraded";
            } else if (v1Part > v2Part) {
                return "downgraded";
            }
        }

        return "not changed";
    }

    public static void main(String[] args) {
        String version1 = "Version1: 4.8.2";

        String version2 = "Version2: 4.8.4";

        String result = compareVersions(version1, version2);
        System.out.println(result);
    }
}
