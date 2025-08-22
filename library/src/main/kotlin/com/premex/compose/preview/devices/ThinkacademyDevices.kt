package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ThinkAcademy device specifications for Android Compose previews.
 *
 * This extension provides ThinkAcademy device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Thinkacademy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Thinkacademy: Any
  get() = object {
      /** ThinkAcademy T100 */
      val T100 = "spec:width=1200,height=1920,unit=px,dpi=240"

  }
