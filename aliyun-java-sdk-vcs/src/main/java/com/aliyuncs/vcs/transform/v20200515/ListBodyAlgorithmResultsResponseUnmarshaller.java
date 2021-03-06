/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.vcs.transform.v20200515;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vcs.model.v20200515.ListBodyAlgorithmResultsResponse;
import com.aliyuncs.vcs.model.v20200515.ListBodyAlgorithmResultsResponse.Data;
import com.aliyuncs.vcs.model.v20200515.ListBodyAlgorithmResultsResponse.Data.RecordsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListBodyAlgorithmResultsResponseUnmarshaller {

	public static ListBodyAlgorithmResultsResponse unmarshall(ListBodyAlgorithmResultsResponse listBodyAlgorithmResultsResponse, UnmarshallerContext _ctx) {
		
		listBodyAlgorithmResultsResponse.setRequestId(_ctx.stringValue("ListBodyAlgorithmResultsResponse.RequestId"));
		listBodyAlgorithmResultsResponse.setCode(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Code"));
		listBodyAlgorithmResultsResponse.setMessage(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Message"));

		Data data = new Data();
		data.setPageNumber(_ctx.integerValue("ListBodyAlgorithmResultsResponse.Data.PageNumber"));
		data.setPageSize(_ctx.integerValue("ListBodyAlgorithmResultsResponse.Data.PageSize"));
		data.setTotalCount(_ctx.integerValue("ListBodyAlgorithmResultsResponse.Data.TotalCount"));
		data.setTotalPage(_ctx.integerValue("ListBodyAlgorithmResultsResponse.Data.TotalPage"));

		List<RecordsItem> records = new ArrayList<RecordsItem>();
		for (int i = 0; i < _ctx.lengthValue("ListBodyAlgorithmResultsResponse.Data.Records.Length"); i++) {
			RecordsItem recordsItem = new RecordsItem();
			recordsItem.setCapStyle(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].CapStyle"));
			recordsItem.setCorpId(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].CorpId"));
			recordsItem.setDataSourceId(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].DataSourceId"));
			recordsItem.setPersonId(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].PersonId"));
			recordsItem.setGenderCode(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].GenderCode"));
			recordsItem.setHairStyle(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].HairStyle"));
			recordsItem.setLeftTopX(_ctx.floatValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopX"));
			recordsItem.setLeftTopY(_ctx.floatValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].LeftTopY"));
			recordsItem.setMaxAge(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].MaxAge"));
			recordsItem.setMinAge(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].MinAge"));
			recordsItem.setPicUrlPath(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].PicUrlPath"));
			recordsItem.setRightBottomX(_ctx.floatValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomX"));
			recordsItem.setRightBottomY(_ctx.floatValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].RightBottomY"));
			recordsItem.setShotTime(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].ShotTime"));
			recordsItem.setTargetPicUrlPath(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].TargetPicUrlPath"));
			recordsItem.setCoatLength(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].CoatLength"));
			recordsItem.setCoatStyle(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].CoatStyle"));
			recordsItem.setTrousersLength(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].TrousersLength"));
			recordsItem.setTrousersStyle(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].TrousersStyle"));
			recordsItem.setCoatColor(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].CoatColor"));
			recordsItem.setTrousersColor(_ctx.stringValue("ListBodyAlgorithmResultsResponse.Data.Records["+ i +"].TrousersColor"));

			records.add(recordsItem);
		}
		data.setRecords(records);
		listBodyAlgorithmResultsResponse.setData(data);
	 
	 	return listBodyAlgorithmResultsResponse;
	}
}