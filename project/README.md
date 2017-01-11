# data-model

- 数据库主键使用默认自增，逻辑模型时不能设置，只有物理模型才可以。
- 自动生成时间
    - 创建字段
        - created_at timestamp not null default CURRENT_TIMESTAMP
    - 更新字段
        -  updated_at           timestamp default CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP

