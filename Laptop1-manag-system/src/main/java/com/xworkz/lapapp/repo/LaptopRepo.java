package com.xworkz.lapapp.repo;

	import java.util.List;

	import com.xworkz.lapapp.dto.LaptopDTO;
	public interface LaptopRepo {

		public LaptopDTO save(LaptopDTO dto);

		public List<LaptopDTO> getLaptop();

		public List<LaptopDTO> searchLaptop(String names);

		public List<LaptopDTO> searchLaptop1(String ram);

		public List<LaptopDTO> searchLaptop2(String color);

		public LaptopDTO updateById(int id);

		public LaptopDTO update(LaptopDTO dto);
		
	}


