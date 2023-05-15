@Composable
private fun TopicSelection(
    onboardingUIState: OnboardingUiState.Shown,
    onTopicCheckedChanged: (String, Boolean) -> Unit,
    modifier: Modifier = Modifier,
) = trace(sectionName: "TopicSelection") {
    val lazyGridState = rememberLazyGridState()
    val topicSelectionTestTag = "forYou:topicSelection"


    TrackScrollJank(scrollableState = lazyGridState, stateName = topicSelectionTestTag)


    lazyHorizontalGrid(
        state = lazyGridState,
        rows = GridCells.Fixed(count: 3),
        horizontalArrangement = Arrangement.spacedby(12.dp)
        verticalArrangement = Arrangement.spacedby(12.dp)
        contentPadding = PaddingValues(24.dp)
        modifier = modifier
        .heightIn(max = max(240.dp, with(LocalDensity.current) {240.sp.to0p() }))
        .fillMaxWidth()
        .testTag(topicSelectionTestTag))