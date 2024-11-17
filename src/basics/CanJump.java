package src.basics;

public class CanJump {
    public static void main(String[] args) {
        int[] arr = {2, 0, 0};
        System.out.println(canJump(arr));
    }

    public static boolean canJump(int[] nums) {

        if (nums.length == 1 && nums[0] == 0) {
            return true;
        }

        int n = nums.length;
        int j = nums[0];
        while (j <= n) {
            if (j == n - 1) {
                break;
            }
            j = j + nums[j];
            if (j > n) {
                break;
            }
            if (nums[j] == 0) {
                break;
            }
        }
        if (j >= nums.length-1) {
            return true;
        } else {
            return false;
        }
    }
}
