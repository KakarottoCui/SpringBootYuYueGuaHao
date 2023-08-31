//微信：egvh56ufy7hh ，QQ：821898835
    AdviceMapper adviceMapper;

    @Resource
    StudentMapper studentMapper;

    @Resource
    TeacherMapper teacherMapper;



    public Map<String,Object> addAdvice(Advice advice, HttpServletRequest request){
        advice.setCreatedate(new Date());
        advice.setValid(1);
        adviceMapper.insert(advice);
        return getRes(200,"success");
    }

    public Map<String,Object> updateAdvice(Advice advice,HttpServletRequest request){
        if(advice.getState() !=null && advice.getState()==2){
            advice.setAnsdate(new Date());
        }
        adviceMapper.update(advice);
        return getRes(200,"success");
    }

    public Map<String,Object> findAdvice(Advice advice){
        List<Advice> adviceList = adviceMapper.queryAll(advice);
        for(Advice ad : adviceList){
            if(ad.getSid()!=null){
                Student student = studentMapper.selectById(ad.getSid());
                if (student != null) {
                    ad.setStudent(student);
                }
            }
            if(ad.getTid()!=null){
                Teacher teacher = teacherMapper.selectByTeaId(ad.getTid());
                if (teacher != null) {
                    ad.setTeacher(teacher);
                }
            }
        }
        return getRes(200,adviceList);
    }

    public Map<String,Object> getRes(Integer code, Object data){
        Map<String,Object> res = new HashMap<>();
        res.put("code",code);
        res.put("data",data);
        res.put("msg","操作成功");
        return  res;
    }
}
