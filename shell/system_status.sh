#!/bin/bash

# 显示硬盘使用情况
echo "硬盘使用情况："
df -h | awk 'NR==1 || /\/dev\/[shv]d/'

# 显示内存使用情况
echo -e "\n内存使用情况："
free -h

# 显示CPU使用情况
cpu_usage=$(top -bn1 | grep "Cpu(s)" | awk '{print $2 + $4}')
echo "CPU使用率：${cpu_usage}%"