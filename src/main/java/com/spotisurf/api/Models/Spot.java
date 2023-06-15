package com.spotisurf.api.Models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;
@Document(collection = "records")
public class Spot {
        @Id
        private String _id;
        private String id;
        private String createdTime;
        private Fields fields;
        public String get_id() {
                return _id;
            };
        public void set_id(String _id) {
                this._id = _id;
            };
        public String getId() {
                return id;
            };
        public void setId(String id) {
                this.id = id;
            };

        public String getCreatedTime() {
            return createdTime;
        };

        public void setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
        };

        public Fields getFields() {
            return fields;
        };

        public void setFields(Fields fields) {
            this.fields = fields;
        };

        public static class Fields {
            private String surfBreak;
            private int difficultyLevel;
            private String destination;
            private String geocode;
            private List<String> influencers;
            private String magicSeaweedLink;
            private List<Photo> photos;
            private String peakSurfSeasonBegins;
            private String destinationStateCountry;
            private String peakSurfSeasonEnds;
            private String address;

            public String getSurfBreak() {
                return surfBreak;
            }

            public void setSurfBreak(String surfBreak) {
                this.surfBreak = surfBreak;
            }

            public int getDifficultyLevel() {
                return difficultyLevel;
            }

            public void setDifficultyLevel(int difficultyLevel) {
                this.difficultyLevel = difficultyLevel;
            }

            public String getDestination() {
                return destination;
            }

            public void setDestination(String destination) {
                this.destination = destination;
            }

            public String getGeocode() {
                return geocode;
            }

            public void setGeocode(String geocode) {
                this.geocode = geocode;
            }

            public List<String> getInfluencers() {
                return influencers;
            }

            public void setInfluencers(List<String> influencers) {
                this.influencers = influencers;
            }

            public String getMagicSeaweedLink() {
                return magicSeaweedLink;
            }

            public void setMagicSeaweedLink(String magicSeaweedLink) {
                this.magicSeaweedLink = magicSeaweedLink;
            }

            public List<Photo> getPhotos() {
                return photos;
            }

            public void setPhotos(List<Photo> photos) {
                this.photos = photos;
            }

            public String getPeakSurfSeasonBegins() {
                return peakSurfSeasonBegins;
            }

            public void setPeakSurfSeasonBegins(String peakSurfSeasonBegins) {
                this.peakSurfSeasonBegins = peakSurfSeasonBegins;
            }

            public String getDestinationStateCountry() {
                return destinationStateCountry;
            }

            public void setDestinationStateCountry(String destinationStateCountry) {
                this.destinationStateCountry = destinationStateCountry;
            }

            public String getPeakSurfSeasonEnds() {
                return peakSurfSeasonEnds;
            }

            public void setPeakSurfSeasonEnds(String peakSurfSeasonEnds) {
                this.peakSurfSeasonEnds = peakSurfSeasonEnds;
            }

            public String getAddress() {
                return address;
            }

            public void setAddress(String address) {
                this.address = address;
            }
        }

        public static class Photo {
            private String id;
            private int width;
            private int height;
            private String url;
            private String filename;
            private int size;
            private String type;

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public int getWidth() {
                return width;
            }

            public void setWidth(int width) {
                this.width = width;
            }

            public int getHeight() {
                return height;
            }

            public void setHeight(int height) {
                this.height = height;
            }

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getFilename() {
                return filename;
            }

            public void setFilename(String filename) {
                this.filename = filename;
            }

            public int getSize() {
                return size;
            }

            public void setSize(int size) {
                this.size = size;
            }

            public String getType() {
                return type;
            }

            public void setType(String type) {
                this.type = type;
            }
        }

}


