var vue = new Vue({
    el:"#app",
    data:{
        userList:[],
        user:{}
    },
    methods:{
        // 查询所有
        findAll:function () {
            var _this = this;
            axios.get("./user/findAll").then(function (response) {
                // vue.userList = response.data;
                // 此时在axios中调用this的时候，this不再是vue对象，而是Window对象
                //alert("ok");
                //window.alert("ok1");
                //this.alert("ok2");
                _this.userList = response.data;
            }).catch(function (error) {

            }).finally(function () {

            })
        },


        // ID查询(rest风格）
        // findById:function (id) {
        //     var _this = this;
        //     axios.get("./user/findById/"+id).then(function (response) {
        //         _this.user = response.data;
        //     }).catch(function (error) {
        //
        //     }).finally(function () {
        //
        //     })
        // }
        // ID查询（传统方式）
        findOne:function (id){
            var _this = this;

            axios.get("./user/findOne",{params:{id:id}}).then(function (response) {

                _this.user = response.data;

            }).catch(function (error) {

            }).finally(function () {

            })
        },

        // 更新保存
        update:function () {
            var _this = this;
            axios.post("./user/update",this.user).then(function (response) {
                // 刷新页面（刷新模型数据）
                _this.findAll();
            }).catch(function () {
                alert(error);
            }).finally(function () {

            })
        }
    },
    created:function(){
        this.findAll();
    },

});