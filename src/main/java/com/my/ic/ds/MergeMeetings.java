package com.my.ic.ds;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MergeMeetings {
    public static class Meeting {

        private int startTime;
        private int endTime;

        public Meeting(int startTime, int endTime) {
            // number of 30 min blocks past 9:00 am
            this.startTime = startTime;
            this.endTime   = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        @Override
        public boolean equals(Object o) {
            if (o == this) {
                return true;
            }
            if (!(o instanceof Meeting)) {
                return false;
            }
            final Meeting meeting = (Meeting) o;
            return startTime == meeting.startTime && endTime == meeting.endTime;
        }

        @Override
        public int hashCode() {
            int result = 17;
            result = result * 31 + startTime;
            result = result * 31 + endTime;
            return result;
        }

        @Override
        public String toString() {
            return String.format("(%d, %d)", startTime, endTime);
        }
    }

    public static List<Meeting> mergeRanges(List<Meeting> meetings) {

        // merge meetings ranges
        List<Meeting> sortedMeetings = new ArrayList<>();
        for(Meeting meeting:meetings){
            Meeting meetingCopy=new Meeting(meeting.getStartTime(),meeting.getEndTime());
            sortedMeetings.add(meetingCopy);
        }
        
        Collections.sort(sortedMeetings,new Comparator<Meeting>(){
            @Override
            public int compare(Meeting m1 , Meeting m2){
                return m1.getStartTime()- m2.getStartTime();
            }
            });
            List<Meeting> mergedMeetings = new ArrayList<>();
            mergedMeetings.add(sortedMeetings.get(0));
            
            for(Meeting currentMeeting : sortedMeetings){
                Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size()-1);
                if(currentMeeting.getStartTime() <= lastMergedMeeting.getEndTime()){
                    lastMergedMeeting.setEndTime(Math.max(lastMergedMeeting.getEndTime(),currentMeeting.getEndTime()));
                }else{
                    mergedMeetings.add(currentMeeting);
                }
            }
        return mergedMeetings;
    }



    // tests

    public void meetingsOverlapTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(2, 4));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(1, 4));
        System.out.println("meetingsOverlapTest::expected:"+expected);
        System.out.println("meetingsOverlapTest::actual:"+actual);
    }

    public void  meetingsTouchTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(5, 6), new Meeting(6, 8));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(5, 8));
        System.out.println("meetingsTouchTest::expected:"+expected);
        System.out.println("meetingsTouchTest::actual:"+actual);
    }

    public void meetingContainsOtherMeetingTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 8), new Meeting(2, 5));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(1, 8));
        System.out.println("meetingContainsOtherMeetingTest::expected:"+expected);
        System.out.println("meetingContainsOtherMeetingTest::actual:"+actual);
       }

    public void meetingsStaySeparateTest() {
        final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(4, 8));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(
            new Meeting(1, 3), new Meeting(4, 8)
        );
        System.out.println("meetingsStaySeparateTest::expected:"+expected);
        System.out.println("meetingsStaySeparateTest::actual:"+actual);
    }

    public void multipleMergedMeetingsTest() {
        final List<Meeting> meetings = Arrays.asList(
            new Meeting(1, 4), new Meeting(2, 5), new Meeting (5, 8));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(new Meeting(1, 8));
        System.out.println("multipleMergedMeetingsTest::expected:"+expected);
        System.out.println("multipleMergedMeetingsTest::actual:"+actual);
       }

    public void meetingsNotSortedTest() {
        final List<Meeting> meetings = Arrays.asList(
            new Meeting(5, 8), new Meeting(1, 4), new Meeting(6, 8));
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(
            new Meeting(1, 4), new Meeting(5, 8)
        );
        System.out.println("meetingsNotSortedTest::expected:"+expected);
        System.out.println("meetingsNotSortedTest::actual:"+actual);
    }

    public void oneLongMeetingContainsSmallerMeetingsTest() {
        final List<Meeting> meetings = Arrays.asList(
            new Meeting(1, 10), new Meeting(2, 5), new Meeting(6, 8),
            new Meeting(9, 10), new Meeting(10, 12)
        );
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(
            new Meeting(1, 12)
        );
          System.out.println("oneLongMeetingContainsSmallerMeetingsTest::expected:"+expected);
        System.out.println("oneLongMeetingContainsSmallerMeetingsTest::actual:"+actual);
    }

    public void sampleInputTest() {
        final List<Meeting> meetings = Arrays.asList(
            new Meeting(0, 1), new Meeting(3, 5), new Meeting(4, 8),
            new Meeting(10, 12), new Meeting(9, 10)
        );
        final List<Meeting> actual = mergeRanges(meetings);
        final List<Meeting> expected = Arrays.asList(
            new Meeting(0, 1), new Meeting(3, 8), new Meeting(9, 12)
        );
        System.out.println("sampleInputTest::expected:"+expected);
        System.out.println("sampleInputTest::actual:"+actual);
    }

    public static void main(String[] args) {
        MergeMeetings mm=new MergeMeetings();
        mm.meetingsOverlapTest();
        mm.meetingsTouchTest();
        mm.meetingContainsOtherMeetingTest();
        mm.meetingsStaySeparateTest();
        mm.multipleMergedMeetingsTest();
        mm.meetingsNotSortedTest();
        mm.oneLongMeetingContainsSmallerMeetingsTest();
        mm.sampleInputTest();
    }
}