package src;

public class Feiarr {
    //自定义成员方法实现费式数列中第n项的数值的计算并返回，n由参数指定
    int show(int n){
        //1.使用递归方式进行计算
       // 1，1，2，3，5，8，13，21
       /* if(1 ==n||2 == n)return 1;//前两项都是1，所以过滤掉
        return show(n-1)+show(n-2);//从第三项开始等于（n-1）+(n-2)项的和
    }

        */
        int ia = 1;
        int ib = 1;
        int ic;
        for(int i =3;i <= n;i++){
             ic = ia +ib;
             ia = ib;
             ib = ic;

        }
        return ib;
    }
}
