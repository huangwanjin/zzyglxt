
(function() {
    define('modalHtml', ['jquery','objectUtil', 'stringUtil', 'alertUtil', 'bootstrap'], function(jquery, objectUtil,stringUtil,alertUtil,bootstrap) {

        var modalHtml = new Object();

        modalHtml.defaultModalHtml = function defaultModalHtml(obj) {
            return '<div class="modal fade" id="'+obj.modalID+'" data-backdrop="static" data-keyboard="false" tabindex="-1" aria-labelledby="staticBackdropLabel" aria-hidden="true">\n' +
                '            <div class="'+obj.modalClass+'">\n' +
                '                <div class="modal-content">\n' +
                '                    <div class="modal-header">\n' +
                '                        <h5 class="modal-title" id="staticBackdropLabel">'+ obj.modalTitle +'</h5>\n' +
                '                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">\n' +
                '                            <span aria-hidden="true">&times;</span>\n' +
                '                        </button>\n' +
                '                    </div>\n' +
                '                    <div class="modal-body">\n' + obj.modalBody +
                '                    </div>\n' +
                '                    <div class="modal-footer">\n' +
                '                        <button type="button" id="'+obj.modalCancelID+'" class="btn btn-secondary" data-dismiss="modal">'+obj.modalCancel+'</button>\n' +
                '                        <button type="button" id="'+obj.modalConfirmID+'" class="'+ obj.confirmButtonClass +'">'+obj.modalConfirm+'</button>\n' +
                '                    </div>\n' +
                '                </div>\n' +
                '            </div>\n' +
                '        </div>\n' +
                '    </div>';

        };
        modalHtml.myDeleteModalTravel = '是否删除景点信息?';
        modalHtml.myDeleteModalTraditionalCul = '是否删除中医医史信息?';
        modalHtml.myDeleteModalTraditionalDoc = '是否删除历代名家信息?';
        modalHtml.myDeleteModalTraditionalSch = '是否删除中医流派信息?';
        modalHtml.myDeleteModalCartoonAll = '是否删除漫画典故信息?';
        modalHtml.myDeleteModalComGam = '是否删除动漫游戏信息?';
        modalHtml.myDeleteModalCulRel = '是否删除文化古迹信息?';
        modalHtml.myDeleteModalCulVen = '是否删除文化场馆信息?';
        modalHtml.myDeleteModalInCuHe = '是否删除非物质文化遗产信息?';
        modalHtml.myDeleteModalMovTV = '是否删除电视电影信息?';
        modalHtml.myDeleteAchievement = '是否删除科研成果?';

        modalHtml.myDeleteRecruit = '是否删除招聘信息?';
        modalHtml.myDeleteCooperation = '是否删除合作交流信息?';
        modalHtml.myDeleteModalfamPre='是否删除历史名方';
        modalHtml.myDeleteModalMedicine='是否删除中医药';
        modalHtml.myDeleteModalcareFam='是否删除国医话健康';
        modalHtml.myDeleteModalSciknow='是否删除科普知识';

        modalHtml.myDeleteNewsInf = '是否删除新闻信息?';
        modalHtml.myDeleteNewsRotations = '是否删除新闻轮播图?';
        modalHtml.myDeleteAnnouncement = '是否删除通知公告?';
        modalHtml.myDeleteRegulation = '是否删除政策法规?';
        modalHtml.myDeleteProcess = '是否删除办事流程?';


        modalHtml.myDeleteHospital = "是否删除医院信息？";
        modalHtml.myDeleteSpecialty = "是否删除科室信息？";
        modalHtml.myDeleteChineseMedicine = "是否删除名老中医信息？";

        return modalHtml;

    });
})();