<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isELIgnored="true" %>
<!DOCTYPE html>
<html lang="zh-cn">

<head>
  <meta charset="UTF-8">
  <meta name='viewport' content='width=device-width, initial-scale=1.0, maximum-scale=1.0' />
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <title>首页</title>
  <link rel="stylesheet" href="../../layui/css/layui.css">
  <link type="text/css" rel="stylesheet" href="../../xznstatic/css/style.css" />
  <script type="text/javascript" src="../../xznstatic/js/jquery-1.8.2.min.js"></script>
  <script type="text/javascript" src="../../xznstatic/js/banner.js"></script>
  <script type="text/javascript" src="../../xznstatic/js/my.js"></script>
</head>

<body>
  <div id="app">
    <div class="layui-carousel" id="swiper">
      <div carousel-item id="swiper-item">
        <div v-for="(item,index) in swiperList" v-bind:key="index">
          <img class="swiper-item" :src="item.img" width="100%" height="400px">
        </div>
      </div>
    </div>



    <div class="part2" style="margin-top: 50px;">
      <div class="part2_1">
        <div class="tit">
            <b>扶贫计划展示</b>
            <span>DATA SHOW</span>
        </div>
        <div class="more">
            <a href="#" @click="jump('../fupinjihua/list.jsp')">MORE>></a>
        </div>
      </div>
      <div class="part2_2">
        <div class="caseBox" v-for="(item,index) in fupinjihuaList" v-bind:key="index">
          <div class="caseBox_1">
            <div class="caseImg" style="background-size: cover;background-repeat: no-repeat;background-position: center;"><img :src="item.tupian?item.tupian.split(',')[0]:''" width="390" height="320" /></div>
            <div class="hoverbg" style="display: none;">
                <a :href="'../fupinjihua/detail.jsp?id='+item.id">查看详情</a>
            </div>
          </div>
          <div class="caseBox_2">
            <a :href="'../fupinjihua/detail.jsp?id='+item.id">{{item.biaoti}}<span style="color: red;float: right;" v-if="item.price">{{item.price}} RMB</span></a>
          </div>
        </div>
      </div>
    </div>
    <div class="clear"></div>
    <div class="part2" style="margin-top: 50px;">
      <div class="part2_1">
        <div class="tit">
            <b>惠农福利展示</b>
            <span>DATA SHOW</span>
        </div>
        <div class="more">
            <a href="#" @click="jump('../huinongfuli/list.jsp')">MORE>></a>
        </div>
      </div>
      <div class="part2_2">
        <div class="caseBox" v-for="(item,index) in huinongfuliList" v-bind:key="index">
          <div class="caseBox_1">
            <div class="caseImg" style="background-size: cover;background-repeat: no-repeat;background-position: center;"><img :src="item.tupian?item.tupian.split(',')[0]:''" width="390" height="320" /></div>
            <div class="hoverbg" style="display: none;">
                <a :href="'../huinongfuli/detail.jsp?id='+item.id">查看详情</a>
            </div>
          </div>
          <div class="caseBox_2">
            <a :href="'../huinongfuli/detail.jsp?id='+item.id">{{item.biaoti}}<span style="color: red;float: right;" v-if="item.price">{{item.price}} RMB</span></a>
          </div>
        </div>
      </div>
    </div>
    <div class="clear"></div>
    <div class="part2" style="margin-top: 50px;">
      <div class="part2_1">
        <div class="tit">
            <b>优秀农民展示</b>
            <span>DATA SHOW</span>
        </div>
        <div class="more">
            <a href="#" @click="jump('../youxiunongmin/list.jsp')">MORE>></a>
        </div>
      </div>
      <div class="part2_2">
        <div class="caseBox" v-for="(item,index) in youxiunongminList" v-bind:key="index">
          <div class="caseBox_1">
            <div class="caseImg" style="background-size: cover;background-repeat: no-repeat;background-position: center;"><img :src="item.touxiang?item.touxiang.split(',')[0]:''" width="390" height="320" /></div>
            <div class="hoverbg" style="display: none;">
                <a :href="'../youxiunongmin/detail.jsp?id='+item.id">查看详情</a>
            </div>
          </div>
          <div class="caseBox_2">
            <a :href="'../youxiunongmin/detail.jsp?id='+item.id">{{item.nongminxingming}}<span style="color: red;float: right;" v-if="item.price">{{item.price}} RMB</span></a>
          </div>
        </div>
      </div>
    </div>
    <div class="clear"></div>

    <div class="footer" style="background-color: #000000;margin-top: 50px;">
      <div class="foot_bottom" v-text="projectName"></div>
    </div>
  </div>

  <script src="../../layui/layui.js"></script>
  <script src="../../js/vue.js"></script>
  <script src="../../js/config.js"></script>
  <script src="../../modules/config.js"></script>
  <script src="../../js/utils.js"></script>

  <script>
    var vue = new Vue({
      el: '#app',
      data: {
        projectName: projectName,
        swiperList: [{
          img: '../../img/banner.jpg'
        }],

      fupinjihuaList: [],
      huinongfuliList: [],
      youxiunongminList: [],
        newsList: []
      },
      filters: {
        newsDesc: function(val) {
          if (val) {
            val = val.replace(/<[^<>]+>/g, '').replace(/undefined/g, '');
            if (val.length > 60) {
              val = val.substring(0, 60);
            }

            return val;
          }
          return '';
        }
      },
      methods: {
        jump(url) {
          jump(url)
        }
      }
    });

    layui.use(['layer', 'form', 'element', 'carousel', 'http', 'jquery'], function() {
      var layer = layui.layer;
      var element = layui.element;
      var form = layui.form;
      var carousel = layui.carousel;
      var http = layui.http;
      var jquery = layui.jquery;

      http.request('config/list', 'get', {
        page: 1,
        limit: 5
      }, function(res) {
        if (res.data.list.length > 0) {
          var swiperItemHtml = '';
          for (let item of res.data.list) {
            if (item.name.indexOf('picture') >= 0 && item.value && item.value != "" && item.value != null) {
              swiperItemHtml +=
                '<div>' +
                '<img class="swiper-item" src="' + item.value + '" width="100%" height="400px">' +
                '</div>';
            }
          }
          jquery('#swiper-item').html(swiperItemHtml);
          // 轮播图
          carousel.render({
            elem: '#swiper',
            width: '100%',
            height: '400px',
            arrow: 'always',
            anim: 'fade',
            interval: 1800,
            indicator: 'inside'
          });
        }
      });
              


      http.request(`fupinjihua/list`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.fupinjihuaList = res.data.list;
      });
      http.request(`huinongfuli/list`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.huinongfuliList = res.data.list;
      });
      http.request(`youxiunongmin/list`, 'get', {
        page: 1,
        limit: 6
      }, function(res) {
        vue.youxiunongminList = res.data.list;
      });
    });
  </script>
</body>

</html>