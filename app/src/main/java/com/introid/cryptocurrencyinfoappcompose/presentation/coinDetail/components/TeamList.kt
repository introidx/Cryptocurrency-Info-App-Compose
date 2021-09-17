package com.introid.cryptocurrencyinfoappcompose.presentation.coinDetail.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.introid.cryptocurrencyinfoappcompose.data.remote.dto.TeamMember
import androidx.compose.ui.unit.dp


@Composable
fun TeamListItem(
    teamMember: TeamMember,
    modifier: Modifier = Modifier
) {

    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = teamMember.name,
            style = MaterialTheme.typography.h6
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = teamMember.position,
            style = MaterialTheme.typography.body2
        )
    }

}