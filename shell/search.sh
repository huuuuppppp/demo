#!/bin/bash

# 输入要搜索的内容
read -p "请输入要搜索的内容： " search_content

# 输入要搜索的文件路径
read -p "请输入要搜索的文件路径： " file_path

# 输入保存搜索结果的文件路径
read -p "请输入保存搜索结果的文件路径： " save_path

# 使用grep命令搜索内容，并将结果保存到文件和输出到控制台
grep -n "$search_content" "$file_path" | tee "$save_path"

echo "搜索结果已保存到文件：$save_path"
