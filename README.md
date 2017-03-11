# XDroid-Base
xdroid的基本功能，可作为一个简单的开发框架，包含开发中常用的一些快速开发类

[![](https://jitpack.io/v/fodroid/XDroid-Base.svg)](https://jitpack.io/#fodroid/XDroid-Base)

## XDroid

XDroid是一个轻量级的Android快速开发框架，基于XDroid-Base，在此基础上增加了由UI、Event、Net等几个部分组成。其设计思想是使用接口对各模块解耦规范化，不强依赖某些明确的三方类库，使得三方类库可自由搭配组装，方便替换。可快速、自由的进行App开发。

传送门：[**https://github.com/limedroid/XDroid**](https://github.com/limedroid/XDroid)

## XDroid-Databinding

XDroid-Databinding是XDroid快速开发框架的Databinding版本，大部分源码也与XDroid类似。

传送门：[**https://github.com/fodroid/XDroid-Databinding**](https://github.com/fodroid/XDroid-Databinding)

## XDroidMvp

XDroidMvp是基于XDroid的MVP实现，不是传统意义的MVP，不需写接口，可无缝切换MVC，可能是当前最好用的MVP框架。

传送门：[**https://github.com/limedroid/XDroidMvp**](https://github.com/limedroid/XDroidMvp)

## XDroidMvp-Databinding

XDroidMvp-Databinding是基于XDroidMvp的Databinding版本，大部分源码也与XDroidMvp类似。

传送门：开发中

XDroid推出以来，得到了很多朋友的快速反馈，目前有很多朋友在新项目或是老项目中使用XDroid，为了方便学习和交流，可以加入QQ群：

XDroid交流群：**153569290**

# 特性

**XDroid-Base**主要有这些特性：

* 提供`SimpleRecAdapter`、`SimpleListAdapte`、`XRecyclerAdapter`、`XListAdapter`等基类，可快速进行开发
* 实现了Memory、Disk、SharedPreferences三种方式的缓存，可自由扩展
* 内置`Glide`，可自由切换其他图片加载库
* 可输出漂亮的`Log`，支持Json、Xml、Throwable等，蝇量级实现
* 内置链式路由
* 内置`Toast`工具类
* 内置常用工具类：`package`、`random`、`file`...,提供的都是非常常用的方法
* 内置加密工具类 `XCodec`，你想要的加密姿势都有
* 引入三方库极少

详细说明请前往[wiki](https://github.com/fodroid/XDroid-Base/wiki)

# Get Started

### 方式一使用，仅需四步：

#### step1  

clone 'XDroid-Base'库到本地:
```groovy
git clone https://github.com/fodroid/XDroid-Base.git
```

#### step2

将`xdroidbase`作为依赖库，在您的app module 中 添加如下依赖:
```groovy
compile project(':xdroidbase')
```

#### step3

拷贝`conf.gradle`到您的项目根目录，并修改项目gradle文件下引入：
```groovy
apply from: "conf.gradle"
```

并添加:

```groovy
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

#### step4

调用`XDroidBaseConf`配置类，主要针对log、cache、router、imageloader。若采用默认配置，此步骤可略过.

### 第二种方式，通过JitPack引入

#### step1 在根目录的gradle文件中配置:
```groovy
allprojects {
    repositories {
        jcenter()
        maven { url "https://jitpack.io" }
    }
}
```

#### step2 添加依赖:
```groovy
dependencies {
	        compile 'com.github.fodroid:XDroid-Base:v1.3'
}
```
# 关于我们
### droidlover
**Email** : droidlover@126.com

**Github** : https://github.com/limedroid

**简书**：http://www.jianshu.com/u/276be5744ca0
### fodroid
**Email** : me.shihao@qq.com

**Github** : https://github.com/fodroid

**简书**：http://www.jianshu.com/u/caf7ea3607ed
