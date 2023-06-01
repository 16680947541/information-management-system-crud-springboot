<template>
    <ContentField>
        <form>
           
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">name</label>
                <input type="text" class="form-control" id="exampleInputPassword1">
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">surname</label>
                <input type="text" class="form-control" id="exampleInputPassword1">
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">sex</label>
                <input type="text" class="form-control" id="exampleInputPassword1">
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">address</label>
                <input type="text" class="form-control" id="exampleInputPassword1">
            </div>
            <div class="mb-3">
                <label for="exampleInputPassword1" class="form-label">phone</label>
                <input type="password" class="form-control" id="exampleInputPassword1">
            </div>

            <div class="mb-3">
                <label for="exampleInputEmail1" class="form-label">Email address</label>
                <input type="email" class="form-control" id="exampleInputEmail1" aria-describedby="emailHelp">
                <!-- <div id="emailHelp" class="form-text">We'll never share your email with anyone else.</div> -->
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
            </form>
            我的个人信息
    </ContentField>
</template>

<script>
import ContentField from "@/components/ContentField.vue"
// import { useStore } from 'vuex'
// import $ from 'jquery';
export default {
    components: {
        ContentField
    },
    // setup() {
    //     const store = useStore();
    //     $.ajax ({ // add bot
    //           url: "http://127.0.0.1:3000/user/bot/add/",
    //           type: "post",
    //           data: {
    //             title: "我的bot",
    //             description: "bot描述",
    //             content: "代码",
    //           },
    //           headers: {
    //             Authorization: "Bearer " + store.state.user.token,
    //           },
    //           success(resp) {
    //             console.log(resp);
    //           },
    //           errot(resp) {
    //             console.log(resp);
    //           }
    //     });
    //     $.ajax ({ // 删除bot
    //           url: "http://127.0.0.1:3000/user/bot/remove/",
    //           type: "post",
    //           data: {
    //             bot_id: 7,
    //           },
    //           headers: {
    //             Authorization: "Bearer " + store.state.user.token,
    //           },
    //           success(resp) {
    //             console.log(resp);
    //           },
    //           errot(resp) {
    //             console.log(resp);
    //           }
    //     });
    //     $.ajax ({ // update bot
    //           url: "http://127.0.0.1:3000/user/bot/update/",
    //           type: "post",
    //           data: {
    //             bot_id: 4,
    //             title: "我的bot88",
    //             description: "bot描述88",
    //             content: "代码88",
    //           },
    //           headers: {
    //             Authorization: "Bearer " + store.state.user.token,
    //           },
    //           success(resp) {
    //             console.log(resp);
    //           },
    //           errot(resp) {
    //             console.log(resp);
    //           }
    //     });
    //     $.ajax ({ // select bot
    //           url: "http://127.0.0.1:3000/user/bot/getlist/",
    //           type: "get",
    //           headers: {
    //             Authorization: "Bearer " + store.state.user.token,
    //           },
    //           success(resp) {
    //             console.log(resp);
    //           },
    //           errot(resp) {
    //             console.log(resp);
    //           }
    //     });
    // }
}
</script>

<style scoped>
</style>