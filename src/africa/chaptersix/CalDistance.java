package africa.chaptersix;

public class CalDistance {
    public static void main(String[] args) {

                CalDistance obj=new CalDistance();

                System.out.println(obj.distance(38.898556, -77.037852, 38.897147, -77.043934, "M") + " Miles\n");
                System.out.println(obj.distance(38.898556, -77.037852, 38.897147, -77.043934, "K") + " Kilometers\n");
                System.out.println(obj.distance(32.9697, -96.80322, 29.46786, -98.53506, "N") + " Nautical Miles\n");
            }
            public double distance(double lat1, double lon1, double lat2, double lon2, String sr) {


                double theta = lon1 - lon2;
                double dist = Math.sin(deg2rad(lat1)) * Math.sin(deg2rad(lat2)) + Math.cos(deg2rad(lat1)) * Math.cos(deg2rad(lat2)) * Math.cos(deg2rad(theta));
                dist = Math.acos(dist);
                dist = dist * 60 * 1.1515;
                if (sr.equals("K")) {
                    dist = dist * 1.609344;
                } else if (sr.equals("N")) {
                    dist = dist * 0.8684;
                }
                return (dist);
            }

    private void rad2deg(double dist) {
    }


    public double deg2rad(double deg) {
                return (deg * Math.PI / 180.0);
    }
}
