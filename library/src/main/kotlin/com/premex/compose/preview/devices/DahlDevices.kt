package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DAHL device specifications for Android Compose previews.
 *
 * This extension provides DAHL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Dahl.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Dahl: Any
  get() = object {
      /** DAHL People_Plus */
      val PEOPLE_PLUS = "spec:width=720,height=1440,unit=px,dpi=320"

  }
