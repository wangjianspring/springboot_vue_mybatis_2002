new Vue({
     el:"#app",
     data:{
         t_class:{
             id:"",
             tname:"",
             enable:"",
             createtime:""
         },
         classList:[]
      },
     methods:{
         queryList:function(){
             var _this=this;
             axios.get('/c_class/queryAll.do')
                 .then(function (response) {
                     _this.classList= response.data;
                     console.info(_this.classList);
                 })
                 .catch(function (error) {
                     console.log(error);
                 });
         },
         showPannel:function(obj){
             var _this=this;
             _this.t_class=obj;
             console.info( _this.t_class.tname);
             console.info( _this.t_class.id);
             changePanel();
         },
         updateClass:function(t_class){
             var _this=this;
             axios.post('/c_class/updateClass.do',t_class)
                 .then(function (response) {
                     $('.changeAllWrap').addClass('hide');
                    _this.queryList();
                 })
                 .catch(function (error) {
                     console.log(error);
                 });
         }
     },
    created:function(){
         this.queryList();
    }

})