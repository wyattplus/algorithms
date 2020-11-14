package leetcode.tools;

import java.lang.reflect.Method;
import java.util.List;

public class BinarySearch {

    /**
     * TODO 二分法查找
     * 查找第一个大于等于给定值的元素索引 <br/>
     *
     * @param a         ： 对象集合,必须根据给定值/权重值排序的，并且不含重复元素的 <br/>
     * @param x         :  给定值，权重值 <br/>
     * @param searchKey ： 获取给定值/权重值的get方法名，目的是通过反射获取属性值 <br/>
     * @return 索引，找不到返回0  <br/>
     * 排序示例： a.sort((x, y) ->Integer.valueOf(x.getSearchKey()).compareTo(Integer.valueOf(y.getSearchKey())));
     * @date 2019年9月16日
     */
    public static <T> int Big(List<T> a, int x, String searchKey) {
        try {
            int low = 0;
            int high = a.size() - 1;
            while (low <= high) {
                // 获得折半值,mid小于1,直接返回0（当只有一条数据，mid百分之百等于0）
                int mid = low + ((high - low) >> 1);
                if (mid < 1) {
                    return 0;
                }
                // 通过反射获取T排序属性对应的给定值
                T mt = a.get(mid);
                Method method = mt.getClass().getMethod(searchKey);
                int weight = (int) method.invoke(mt);
                //判断给点值
                if (weight >= x) {
                    // 通过反射获取T排序属性对应的给定值
                    T mt2 = a.get(mid - 1);
                    Method method2 = mt2.getClass().getMethod(searchKey);
                    int weight2 = (int) method2.invoke(mt2);
                    // 在找到符合要求的前提下，提前mid值
                    if ((mid == low) || weight2 < x)
                        return mid;
                    else {
                        high = mid - 1;
                    }
                } else {
                    low = mid + 1;
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
            e.printStackTrace();
        }
        return 0;
    }
}