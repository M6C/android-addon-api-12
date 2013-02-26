package com.addon.api.json;

import java.io.IOException;
import java.io.OutputStreamWriter;

public class JsonWriter {

	private android.util.JsonWriter jsonWriter = null;
	
	public JsonWriter(OutputStreamWriter outputStreamWriter) {
		jsonWriter = new android.util.JsonWriter(outputStreamWriter);
	}

	public void setIndent(String indent) {
		jsonWriter.setIndent(indent);
	}

	public void beginObject() throws IOException {
		jsonWriter.beginObject();
	}

	public void endObject() throws IOException {
		jsonWriter.endObject();
	}

	public void beginArray() throws IOException {
		jsonWriter.beginArray();
	}

	public void endArray() throws IOException {
		jsonWriter.endArray();
	}
	
	public android.util.JsonWriter name(String name) throws IOException {
		return jsonWriter.name(name);
	}

	public JsonWriter value(boolean value) throws IOException {
		jsonWriter.value(value);
		return this;
	}

	public JsonWriter value(double value) throws IOException {
		jsonWriter.value(value);
		return this;
	}

	public JsonWriter value(long value) throws IOException {
		jsonWriter.value(value);
		return this;
	}

	public JsonWriter value(Number value) throws IOException {
		jsonWriter.value(value);
		return this;
	}

	public JsonWriter value(String value) throws IOException {
		jsonWriter.value(value);
		return this;
	}

	public void close() throws IOException {
		jsonWriter.close();
	}
}
