//人员管理相关的配置
export default {
	namespaced:true,
  state:{
    user_tel:'',
    token:"",
    sum:0,
    name:"",
    address:"",
    info:{}
	},
	actions:{
    change_tel(context,value){
      console.log("修改手机号")
      context.commit("CHANGETEL",value)
    },
    change_token(context,value){
      console.log("修改token")
      context.commit("CHANGETOKEN",value)
    },
    change_info(context,value){
      console.log("个人信息")
      context.commit("CHANGEINFO",value)
    },
	},
	mutations:{
    CHANGETEL(state,value){
      console.log("修改结束")
      state.user_tel=value
    },
    CHANGETOKEN(state,value){
      console.log("")
      state.token=value
    },
    CHANGEINFO(state,value){
      state.info=value
    }
	},

	getters:{
	}
}