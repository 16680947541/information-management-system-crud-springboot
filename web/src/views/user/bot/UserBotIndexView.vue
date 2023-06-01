<template>
    <div class="container">
        <div class="row">
            <div class="col-3">
                <div class="card" style="margin-top: 20px;">
                    <div class="card-body">
                        <img :src="$store.state.user.photo" alt="" style="width: 100%;">
                    </div>
                </div>
            </div>
            <div class="col-9">
                <div class="card" style="margin-top: 20px;">
                    <div class="card-header">
                        <span style="font-size: 125%">我的个人信息</span>
                        <!-- Button trigger modal -->
                        <button type="button" class="btn btn-primary float-end" data-bs-toggle="modal" data-bs-target="#add-bot-btn">
                            创建个人信息
                        </button>
                        <!-- Modal -->
                        <div class="modal fade" id="add-bot-btn"  tabindex="-1" aria-labelledby="staticBackdropLabel">
                        <div class="modal-dialog">
                            <div class="modal-content">
                            <div class="modal-header">
                                <h1 class="modal-title fs-5" id="staticBackdropLabel">个人信息</h1>
                                <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                            </div>
                            <div class="modal-body">
                                <div class="mb-3">
                                    <label for="add-bot-title" class="form-label">title</label>
                                    <input v-model="botadd.title" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的标题">
                                </div>
                                <div class="mb-3">
                                    <label for="add-bot-name" class="form-label">name</label>
                                    <input v-model="botadd.name" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的名字">
                                </div>
                                <div class="mb-3">
                                    <label for="add-bot-surname" class="form-label">surname</label>
                                    <input v-model="botadd.surname" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的姓氏">
                                </div>
                                <div class="mb-3">
                                    <label for="add-bot-sex" class="form-label">sex</label>
                                    <input v-model="botadd.sex" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的性别">
                                </div>
                                <div class="mb-3">
                                    <label for="add-bot-address" class="form-label">address</label>
                                    <input v-model="botadd.address" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的地址">
                                </div>
                                <div class="mb-3">
                                    <label for="add-bot-phone" class="form-label">phone</label>
                                    <input v-model="botadd.phone" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的电话">
                                </div>
                                <div class="mb-3">
                                    <label for="add-bot-eamil" class="form-label">email</label>
                                    <input v-model="botadd.email" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的eamil">
                                </div>
        
                            </div>
                            <div class="modal-footer">
                                <div class="error-message">{{ botadd.error_message }}</div>
                                <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">关闭</button>
                                <button type="button" class="btn btn-primary"  @click="add_bot">保存</button>
                            </div>
                            </div>
                        </div>
                        </div>
                    </div>
                    <div class="card-body">
                        <table class="table table-striped table-hover">
                            <thead>
                                <tr>
                                    <th>名称</th>
                                    <th>操作</th>
                                </tr>
                            </thead>
                            <tbody>
                                <tr v-for="bot in bots" :key="bot.id">
                                    <td>{{ bot.title }}</td>
                                    <td>{{ bot.createtime }}</td>
                                    <td>
                                        <button type="button" class="btn btn-secondary" style="margin-right: 10px;" data-bs-toggle="modal" :data-bs-target="'#update-bot-modal-' + bot.id">修改</button>
                                        <button type="button" class="btn btn-danger" @click="remove_bot(bot)">删除</button>

                                        <div class="modal fade" :id="'update-bot-modal-' + bot.id" tabindex="-1">
                                            <div class="modal-dialog modal-xl">
                                                <div class="modal-content">
                                                <div class="modal-header">
                                                    <h5 class="modal-title">创建信息</h5>
                                                    <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
                                                </div>
                                                <div class="modal-body">
                                                    <div class="mb-3">
                                                        <label for="add-bot-title" class="form-label">title</label>
                                                        <input v-model="bot.title" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的标题">
                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="add-bot-name" class="form-label">name</label>
                                                        <input v-model="bot.name" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的名字">
                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="add-bot-surname" class="form-label">surname</label>
                                                        <input v-model="bot.surname" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的姓氏">
                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="add-bot-sex" class="form-label">sex</label>
                                                        <input v-model="bot.sex" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的性别">
                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="add-bot-address" class="form-label">address</label>
                                                        <input v-model="bot.address" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的地址">
                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="add-bot-phone" class="form-label">phone</label>
                                                        <input v-model="bot.phone" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的电话">
                                                    </div>
                                                    <div class="mb-3">
                                                        <label for="add-bot-email" class="form-label">email</label>
                                                        <input v-model="bot.email" type="text" class="form-control" id="add-bot-title" placeholder="请输入你的eamil">
                                                    </div>
                                                    <!-- <div class="mb-3">
                                                        <label for="add-bot-title" class="form-label">名称</label>
                                                        <input v-model="bot.title" type="text" class="form-control" id="add-bot-title" placeholder="请输入Bot名称">
                                                    </div> -->
                                                </div>
                                                <div class="modal-footer">
                                                    
                                                    <button type="button" class="btn btn-primary" @click="update_bot(bot)">保存</button>
                                                    <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">取消</button>
                                                </div>
                                                </div>
                                            </div>
                                        </div>
                                    </td>
                                </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>
        </div>
    </div>
</template>

<script>
import { ref, reactive } from 'vue'
import $ from 'jquery'
import { useStore } from 'vuex'
import { Modal } from 'bootstrap/dist/js/bootstrap'
import ace from 'ace-builds';

export default {
    setup() {
        ace.config.set(
            "basePath", 
            "https://cdn.jsdelivr.net/npm/ace-builds@" + require('ace-builds').version + "/src-noconflict/")

        const store = useStore();
        let bots = ref([]);

        const botadd = reactive({
            title: "",
            name: "",
            surname: "",
            sex: "",
            address: "",
            phone: "",
            email: "",
            error_message: "",
        });

        const refresh_bots = () => {
            $.ajax({
                url: "http://127.0.0.1:3000/user/bot/getlist/",
                type: "get",
                headers: {
                    Authorization: "Bearer " + store.state.user.token,
                },
                success(resp) {
                    bots.value = resp;
                }
            })
        }

        refresh_bots();

        const add_bot = () => {
            botadd.error_message = "";
            $.ajax({
                url: "http://127.0.0.1:3000/user/bot/add/",
                type: "post",
                data: {
                    title: botadd.title,
                    description: botadd.description,
                    content: botadd.content,
                    name: botadd.name,
                    surname: botadd.surname,
                    sex: botadd.sex,
                    address: botadd.address,
                    phone: botadd.phone,
                    email: botadd.email
                },
                headers: {
                    Authorization: "Bearer " + store.state.user.token,
                },
                success(resp) {
                    if (resp.error_message === "success") {
                        botadd.title = "";
                        botadd.description = "";
                        // botadd.content = "";
                        // botadd.name = "";
                        // botadd.surname = "";
                        // botadd.sex = "";
                        // botadd.address = "";
                        // botadd.phone = "";
                        // botadd.email = "";
                        Modal.getInstance("#add-bot-btn").hide();
                        refresh_bots();
                    } else {
                        botadd.error_message = resp.error_message;
                    }
                }
            })
        }

        const update_bot = (bot) => {
            botadd.error_message = "";
            $.ajax({
                url: "http://127.0.0.1:3000/user/bot/update/",
                type: "post",
                data: {
                    bot_id: bot.id,
                    title: bot.title,
                    description: bot.description,
                    content: bot.content,
                    name: bot.name,
                    surname: bot.surname,
                    sex: bot.sex,
                    address: bot.address,
                    phone: bot.phone,
                    email: bot.email
                },
                headers: {
                    Authorization: "Bearer " + store.state.user.token,
                },
                success(resp) {
                    if (resp.error_message === "success") {
                        Modal.getInstance('#update-bot-modal-' + bot.id).hide();
                        refresh_bots();
                    } else {
                        botadd.error_message = resp.error_message;
                    }
                }
            })
        }

        const remove_bot = (bot) => {
            $.ajax({
                url: "http://127.0.0.1:3000/user/bot/remove/",
                type: "post",
                data: {
                    bot_id: bot.id,
                },
                headers: {
                    Authorization: "Bearer " + store.state.user.token,
                },
                success(resp) {
                    if (resp.error_message === "success") {
                        refresh_bots();
                    }
                }
            })
        }

        return {
            bots,
            botadd,
            add_bot,
            update_bot,
            remove_bot,
        }
    }
}
</script>

<style scoped>
div.error-message {
    color: red;
}
</style>
