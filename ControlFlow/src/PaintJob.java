public class PaintJob {
    public static void main(String[] args) {
        System.out.println(getBucketCount(45.65,3.5));
        System.out.println(getBucketCount(23,45,3,4));
        System.out.println(getBucketCount(23,45,5));
    }

    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets){
        int numOfBucketsRequired = 0;
        if (width <= 0 || height <= 0 || areaPerBucket <= 0 || extraBuckets <= 0){
            return  -1;
        }
        else {
            numOfBucketsRequired = (int) (Math.ceil((width * height)/areaPerBucket));
            numOfBucketsRequired -= extraBuckets;
            return numOfBucketsRequired;
        }
    }

    public static int getBucketCount(double width, double height, double areaPerBucket){
        int numOfBucketsRequired = 0;
        if (width == 0 || height == 0 || areaPerBucket == 0){
            return  -1;
        }
        else{
            return (int)(Math.ceil(((width * height) / areaPerBucket)));
        }
    }

    public static int getBucketCount(double area, double areaPerBucket){
        if (area == 0 || areaPerBucket == 0){
            return  -1;
        }
        else {
            return (int)(Math.ceil(area/areaPerBucket));
        }
    }
}
