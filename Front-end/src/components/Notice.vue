<template>
  <section
    id="get-in-touch"
    class="hide-overflow"
  >
    <v-layout primary white--text class="pt-10">
        <v-container fluid class="mt-8">
             <v-expansion-panels focusable multiple>
                <v-expansion-panel
                  v-for="(item,i) in items"
                  :key="i"
                >
                  <v-expansion-panel-header>{{item.Header}}</v-expansion-panel-header>
                  <v-expansion-panel-content>
                    <br>
                    {{item.Content}}
                  </v-expansion-panel-content>
                </v-expansion-panel>
              </v-expansion-panels>
        </v-container>
    </v-layout>
  </section>
</template>

<script>
export default {
  data: () => ({
    items: [
      {
        No: '1',
        Header: '가게 지역 확장에 관한 공지',
        Content: '현재는 대전의 한밭대 중심으로 시범적 개발을 하고있습니다. 추후에 지속적으로 확장할 계획입니다.'
      },
      {
        No: '2',
        Header: '2019년 10월 25일 임시 점검 안내',
        Content: '종료 일시는 미정으로 추후에 공지하겠습니다.'
      },
      {
        No: '3',
        Header: '2019년 10월 22일 임시 점검 안내 (완료)',
        Content: '(점검 완료)'
      },
      {
        No: '4',
        Header: '상담 관련 공지',
        Content: '메인 페이지의 이메일 보내기를 사용해주시면 빠른 시일 내에 답변 드리겠습니다.'
      },
    ]
  })
}
</script>

<style>

  @media screen and (min-width: 1520px) {
    #login__card{
      margin-top: 150px;
      margin-bottom: 150px;
      margin-left: 440px;
       width: 600px;
    }
  }

   @media screen and (max-width: 600px) {
     #login__card{
       margin-top: 200px;
       margin-bottom: 200px;
     }
   }
  
</style>
