
CREATE TABLE product(
	product_no NUMBER(7) PRIMARY KEY,
	product_name VARCHAR2(100),
	kg_per_unit NUMBER(5, 2),
	
	boxing_weight NUMBER(9, 2),
	boxing_disp_weight NUMBER(9, 2),
	sales_price NUMBER(9, 2),
	
	product_method CHAR(1),
	product_bom_regist CHAR(1),
	product_duration NUMBER(3),
	boxing_duration NUMBER(3),
	
	
	company_no NUMBER(7),
	item_category_no NUMBER(7),
	product_routing_no NUMBER(5),
	valid_duration_no NUMBER(5),
	mill_sheet_no NUMBER(5),
	
	product_start_date DATE,
	product_end_date DATE
)

CREATE SEQUENCE product_seq;
