from selenium import webdriver
from selenium.webdriver.chrome.service import Service
from webdriver_manager.chrome import ChromeDriverManager
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
import time

#driver = webdriver.Chrome(service=Service(ChromeDriverManager().install()))
driver = webdriver.Chrome('./chromedriver')
driver.get('https://www.moaform.com/users/sign_in')

userId = ["junseok.lee@hdel.co.kr"]
password = ["tjdrhd323^"]

# 다음 세 줄이 기본 패턴 코드: ID 넣기
# WebDriverWait(driver, 최대 기다리는 시간).until(EC.presence_of_element_located((By.CSS_SELECTOR, CSS Selector 태그)))
login_id = WebDriverWait(driver, 3).until(
    EC.presence_of_element_located((By.CSS_SELECTOR, "#login-account")))
login_id.clear()  # 입력창의 경우, 사전에 작성되어 있는 텍스트를 삭제
login_id.send_keys(userId)  # 내가 넣고자 하는 텍스트 삽입

# 다음 세 줄이 기본 패턴 코드: 패스워드 넣기
login_pw = WebDriverWait(driver, 3).until(
    EC.presence_of_element_located((By.CSS_SELECTOR, "#login-password")))
login_pw.clear()
login_pw.send_keys(password)


# 버튼 클릭시는 다음 두 줄: 로그인 버튼 누르기
button = WebDriverWait(driver, 3).until(EC.presence_of_element_located(
    (By.CSS_SELECTOR, "#new_user_sign_in > fieldset > button")))
button.click()
time.sleep(10)


driver.quit()
