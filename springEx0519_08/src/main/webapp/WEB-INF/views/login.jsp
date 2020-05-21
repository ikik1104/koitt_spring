<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8">
    <title>cj cookit 마크업</title>
    <link href="css/style.css" rel="stylesheet">
    <link href="https://fonts.googleapis.com/css?family=Noto+Sans+KR:400,500,700&display=swap" rel="stylesheet">    
  </head>
  <body>
    <div class="wrap">
      <!-- 헤드영역 -->
      <header>
        <div class="black_menu">
          <ul>
            <li>회원가입</li>
            <li>로그인</li>
            <li>고객행복센터</li>
            <li>배송지역검색</li>
            <li>기프트카드 등록</li>
          </ul>
        </div>
        <!-- 네비게이션 -->
        <div class="navi">
          <div class="logo"></div>
          <div class="menu">
            <ul>
              <li>COOKIT 소개</li>
              <li>COOKIT 메뉴</li>
              <li>리뷰</li>
              <li>이벤트</li>
              <li>MY쿡킷</li>
            </ul>
          </div>
          <div class="navi_btn">
            <div class="cart_btn">
              <div class="cart_ico"></div>
              <span class="cart_txt">장바구니</span>          
            </div>
            <div class="srch_btn">
              <div class="srch_ico"></div>          
              <span class="srch_txt">메뉴찾기</span>          
            </div>
          </div>
        </div>
      </header>
      <!-- 본문영역 -->
      <section>
        <div class="l_container">
          <div class="p_name">로그인</div>
          <div class="login_box">
            <div class="tab_mn">
              <ul>
                <li id="mem_log">회원 로그인</li>
                <li>비회원 주문조회</li>
              </ul>
            </div>
            <div class="input_log">
              <input type="text" name="log_id" placeholder="CJ ONE 통합아이디 6~20자" class="inputbox">
              <input type="password" name="log_id" placeholder="비밀번호 영문, 특수문자, 숫자혼합 8~12자" class="inputbox" id="ineedmargin">
              <div class="id_remember">
                <input type="checkbox" id="remember" name="id_remem" value="y">
                <span>
                  <div></div>
                  <label for="remember">아이디 저장</label>
                </span>
              </div>
              <div class="id_find">
                <span>아이디 찾기</span>
                <span>비밀번호 찾기</span>
              </div>
              <button class="login_button" onclick="location.href='main.html'">로그인</button>
            </div>
            
            <div class="sns_log">
              <ul class="sns_ico">
                <li></li>
                <li></li>
                <li></li>
                <li></li>
              </ul>            
            </div>
            
            <div class="regi_area">
              <p>CJ ONE 통합회원이 아니신가요?</p>
              <p>CJ ONE 통합회원으로 가입하시면 CJ제일제당의 다양한 서비스(COOKIT, CJ THE MARKET, CJ제일제당 홈페이지)를 이용하실 수 있습니다.</p>
              <div>CJ ONE 통합회원 신규가입하기</div>
            </div>
          </div>
        </div>
      </section>
      <!-- float btn -->
      <section>
        <div class="float_btn"></div>
      </section>
      
      <!-- 푸터 -->
      <footer>
        <div class="foot">
          <div class="foot_cont">
            <div class="foot_logo">
              <div class="ft_lg_ico"></div>
              <p class="copyright">© COOKIT ALL RIGHTS RESERVED</p>
            </div>
            <div class="foot_info">
              <ul>
                <li>이용약관</li>
                <li id="important">개인정보처리 방침</li>
                <li>법적고지</li>
                <li>사업자정보 확인</li>
              </ul>
              
              <div>
                <span>씨제이제일제당(주)</span>
                <span>대표이사 : 손경식,강신호,신현재</span>
                <span>사업자등록번호 : 104-86-09535</span>  
              </div>
              <div>
                <span>주소 : 서울 중구 동호로 330 CJ제일제당 센터 (우) 04560</span>
                <span>통신판매업신고 중구 제 07767호</span>
                <span>개인정보보호책임자 : 조영민</span>  
              </div>
              <div>
                <span>이메일 : cjon@cj.net</span>
                <span>호스팅제공자 : CJ올리브네트웍스㈜</span>
              </div>
              <div>
                <span>고객님은 안전거래를 위해 현금등으로 결제시 LG U+ 전자 결제의 매매보호(에스크로) 서비스를 이용하실 수 있습니다. <a id="check" href="#">가입 사실 확인</a></span>
              </div>
              
            </div>
            <div class="foot_etc">
              <div>CJ그룹계열사 바로가기</div>
              <div>고객행복센터 1668-1920</div>
              <div>1:1문의</div>
            </div>
          </div>
        </div>
      
      
      
      
      </footer>      
    </div>
  
  
  
  
  </body>
</html>l>