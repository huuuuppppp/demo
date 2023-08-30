import request from '@/utils/request'

export function getList(data) {
  return request({
    url: '/employees/page',
    method: 'post',
    data
  })
}
export function delItem(data) {
  return request({
    url: '/employees/del',
    method: 'post',
    data
  })
}
export function save(data){
  return request({
    url: '/employees/addOrUpdate',
    method: 'post',
    data
  })
}
