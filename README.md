# BlurTechnology

代码中通过两种不同的方式实现了毛玻璃的效果，一种是Android平台提供的高斯算法，另一种是自己通过[手动实现的模糊效果](http://www.quasimondo.com/StackBlurForCanvas/StackBlurDemo.html)，在代码FastBlur.java中实现。

由于模糊处理涉及的计算量比较大，而且本身就有精度损失；所以在两种实现中都提供了先对减小图片尺寸，然后模糊处理，再放大的实现方式；通过对比，每种实现的时间消耗为：

|          | 未缩放 | 缩放 |
------------ | ---------| --------|
| 高斯算法 | 50ms | 24ms|
|自定义算法 | 116ms | 2 ms|

从效果上看，进行过缩放操作的效果会更加模糊
