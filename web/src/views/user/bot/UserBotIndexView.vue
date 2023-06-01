<template>
    <ContentField>
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