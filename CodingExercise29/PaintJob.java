public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width<=0 || height<=0 || areaPerBucket<=0 || extraBuckets<0) {
            return -1;
        }
        
        /*double required = width*height - areaPerBucket*extraBuckets;
        
        int needed = 0;
        while (required > areaPerBucket) {
            required -= areaPerBucket;
            needed++;
            if (required < areaPerBucket) {
                needed++;
                break;
            }
        }
        return needed;
        */
        return (int) (Math.ceil((width*height)/areaPerBucket - extraBuckets));
    }
    
    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width<=0 || height<=0 || areaPerBucket<=0) {
            return -1;
        }
        
        /*int bucket = 0;
        double requiredArea = width*height;
        while (requiredArea > areaPerBucket) {
            bucket++;
            requiredArea -= areaPerBucket;
            if (requiredArea < areaPerBucket) {
                bucket++;
                break;
            }
        }
        return bucket;
        */
        return getBucketCount(width, height, areaPerBucket, 0);
    }
    
    public static int getBucketCount(double area, double areaPerBucket) {
        if (area<=0 || areaPerBucket<=0) {
            return -1;
        }
        
        /*int count = 0;
        while (area > areaPerBucket) {
            area -= areaPerBucket;
            count++;
            if (area < areaPerBucket) {
                count++;
                break;
            }
        }
        return count;
        */
        return (int) (Math.ceil(area/areaPerBucket));
    }
}
