import requests
import openpyxl
from bs4 import BeautifulSoup


def crawling_template_with_href(url, css_selector, pre_url):
    return_data = list()
    res = requests.get(url)
    soup = BeautifulSoup(res.content, 'html.parser')
    datas1 = soup.select(css_selector)
    for item in datas1:
        return_data.append([item.get_text(), pre_url + item['href']])
    return return_data


def write_excel_template(filename, sheetname, listdata):
    excel_file = openpyxl.Workbook()
    excel_sheet = excel_file.active

    if sheetname != '':
        excel_sheet.title = sheetname

    for item in listdata:
        excel_sheet.append(item)
    excel_file.save(filename)
    excel_file.close()


def crawling_template_list(url, tr_css_selector, td_css_selector):
    return_data = list()
    res = requests.get(url)
    soup = BeautifulSoup(res.content, 'html.parser')
    datas1 = soup.select(tr_css_selector)

    for item in datas1:
        datas2 = item.select(td_css_selector)
        datas3 = list()
        for item2 in datas2:
            datas3.append(item2.get_text())
        return_data.append(datas3)
    return return_data


datas1 = crawling_template_list(
    'https://davelee-fun.github.io/blog/crawl_html_css', 'table tr', 'td')

datas1

write_excel_template('tmp.xlsx', '커리큘럼', datas1)
