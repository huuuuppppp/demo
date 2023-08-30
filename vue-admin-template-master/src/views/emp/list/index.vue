<template>
  <div class="app-container">
    <el-form :inline="true" class="search-form">
      <el-form-item label="职工姓名">
        <el-input v-model="searchName" clearable placeholder="请输入姓名"></el-input>
      </el-form-item>
      <el-form-item label="部门">
        <el-select v-model="searchDepartment" clearable placeholder="请选择部门">
          <el-option label="业务部" value="业务部"></el-option>
          <el-option label="后勤部" value="后勤部"></el-option>
          <el-option label="人事部" value="人事部"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item label="学历">
        <el-select v-model="searchEducation" clearable placeholder="请选择学历">
          <el-option label="大专" value="大专"></el-option>
          <el-option label="本科" value="本科"></el-option>
          <el-option label="研究生" value="研究生"></el-option>
        </el-select>
      </el-form-item>
      <el-form-item>
        <el-button type="primary" @click="add">新增</el-button>
        <el-button type="primary" @click="search">搜索</el-button>
        <el-button @click="reset">重置</el-button>
      </el-form-item>
    </el-form>
    <el-table v-loading="listLoading" :data="list" element-loading-text="Loading" border fit highlight-current-row>
      <el-table-column align="center" label="ID" width="95">
        <template slot-scope="scope">
          {{ scope.row.id }}
        </template>
      </el-table-column>
      <el-table-column label="职工姓名">
        <template slot-scope="scope">
          {{ scope.row.empName }}
        </template>
      </el-table-column>
      <el-table-column label="性别" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.sex }}</span>
        </template>
      </el-table-column>
      <el-table-column label="年龄" align="center">
        <template slot-scope="scope">
          {{ scope.row.age }}
        </template>
      </el-table-column>
      <el-table-column class-name="部门名" label="部门名" align="center">
        <template slot-scope="scope">
          <span>{{ scope.row.deptName }}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" prop="education" label="学历" width="200">
        <template slot-scope="scope">
          <span>{{ scope.row.empDegreeName }}</span>
        </template>
      </el-table-column>
      <el-table-column align="center" prop="created_at" label="操作" width="200">
        <template slot-scope="scope">
          <el-button type="primary" size="small" @click="editItem(scope.row)">编辑</el-button>
          <el-button type="danger" size="small" @click="deleteItem(scope.row)">删除</el-button>
        </template>
      </el-table-column>
    </el-table>
    <div class="pagination-container">
      <el-pagination @size-change="handleSizeChange" @current-change="handleCurrentChange" :current-page="currentPage"
        :page-sizes="[10, 20, 30, 40]" :page-size="pageSize" :total="total"
        layout="sizes, prev, pager, next, jumper"></el-pagination>
    </div>
    <el-dialog title="" :visible.sync="dialogFormVisible">
      <el-form :model="form">
        <el-form-item hidden label="id">
          <el-input v-model="form.id" autocomplete="off"></el-input>
        </el-form-item>

        <el-form-item label="职工姓名">
          <el-input v-model="form.empName" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="性别">
          <el-select v-model="form.sex" placeholder="请选择性别">
            <el-option label="男" value="男"></el-option>
            <el-option label="女" value="女"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="年龄">
          <el-input v-model="form.age" autocomplete="off"></el-input>
        </el-form-item>
        <el-form-item label="部门名">
          <el-select v-model="form.deptName" placeholder="请选择部门名">
            <el-option label="业务部" value="业务部"></el-option>
            <el-option label="后勤部" value="后勤部"></el-option>
            <el-option label="人事部" value="人事部"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item label="学历">
          <el-select v-model="form.empDegreeName" placeholder="请选择学历">
            <el-option label="大专" value="大专"></el-option>
            <el-option label="本科" value="本科"></el-option>
            <el-option label="研究生" value="研究生"></el-option>
          </el-select>
        </el-form-item>
        <el-form-item>
          <el-button type="primary" @click="onSubmit">保存</el-button>
          <el-button @click="dialogFormVisible = false">取消</el-button>
        </el-form-item>
      </el-form>
    </el-dialog>
  </div>
</template>

<script>
import { getList, delItem, save } from '@/api/table'
export default {
  filters: {
    statusFilter(status) {
      const statusMap = {
        published: 'success',
        draft: 'gray',
        deleted: 'danger'
      }
      return statusMap[status]
    }
  },
  data() {
    return {
      list: [],
      listLoading: true,
      searchName: '',
      searchDepartment: '',
      searchEducation: '',
      currentPage: 1,
      pageSize: 10,
      total: 0,
      activeId: '',
      dialogFormVisible: false,
      form: {
        empName: '',
        sex: '',
        age: '',
        deptName: '',
        empDegreeName: ''
      }
    }
  },
  created() {
    this.fetchData()
  },
  computed: {
    filteredList() {
      // 根据分页参数返回当前页的数据
      const startIndex = (this.currentPage - 1) * this.pageSize
      const endIndex = startIndex + this.pageSize
      return this.list.slice(startIndex, endIndex)
    }
  },
  methods: {
    fetchData() {
      this.listLoading = true
      // 调用后端接口进行分页查询
      getList({
        degreeName: this.searchEducation,
        deptName: this.searchDepartment,
        employeesName: this.searchName,
        pageNum: this.currentPage,
        pageSize: this.pageSize
      }).then(response => {
        this.list = response.data.records
        this.total = response.data.total
        this.listLoading = false
      })
    },
    add() { 
      this.dialogFormVisible = true
      for (const key in this.form) {
        this.form[key] = ''
      }
    },
    editItem(row) {
      // 编辑按钮点击事件
      console.log("编辑", row);
      this.activeId = row.id
      this.dialogFormVisible = true
      this.form = JSON.stringify(JSON.parse(row))
    },
    deleteItem(row) {
      // 删除按钮点击事件
      this.$confirm('此操作将永久删除该文件, 是否继续?', '提示', {
        confirmButtonText: '确定',
        cancelButtonText: '取消',
        type: 'warning'
      }).then(() => {
        delItem({ id: row.id }).then((res) => {
          this.$message({
            type: 'success',
            message: '删除成功!'
          });
          this.fetchData()
        })
        console.log("删除", row);

      }).catch(() => {
        this.$message({
          type: 'info',
          message: '已取消删除'
        });
      });

    },
    onSubmit(row) {
      console.log("保存编辑")
      console.log(row)
      save({
        id: this.activeId,
        empName: this.form.empName,
        sex: this.form.sex,
        age: this.form.age,
        deptName: this.form.deptName,
        empDegreeName: this.form.empDegreeName
      }).then(response => {
        this.fetchData()
        this.dialogFormVisible = false
        this.$message({
          type: 'success',
          message: '删除成功!'
        });
      })
    },
    search() {
      // 点击搜索按钮触发的事件
      this.currentPage = 1 // 搜索后重置当前页为第一页
      this.empName = this.searchName
      this.fetchData() // 重新调用接口进行查询
    },
    reset() {
      // 点击重置按钮触发的事件
      this.searchName = ''
      this.searchDepartment = ''
      this.searchEducation = ''
      this.currentPage = 1 // 重置搜索条件后重置当前页为第一页
      this.fetchData() // 重新调用接口进行查询
    },
    handleSizeChange(size) {
      // 分页器每页显示条数变化时的事件
      this.pageSize = size
      this.fetchData() // 重新调用接口进行查询
    },
    handleCurrentChange(page) {
      // 分页器当前页码变化时的事件
      this.currentPage = page
      this.fetchData() // 重新调用接口进行查询
    }
  }
}
</script>
