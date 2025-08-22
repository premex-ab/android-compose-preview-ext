package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DayMark device specifications for Android Compose previews.
 *
 * This extension provides DayMark device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Daymark.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Daymark: Any
  get() = object {
      /** DayMark IT119345 */
      val IT119345 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** DayMark IT119411 */
      val IT119411 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
