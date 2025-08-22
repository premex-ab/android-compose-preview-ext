package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * O2 device specifications for Android Compose previews.
 *
 * This extension provides O2 device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.O2.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.O2: Any
  get() = object {
      /** O2 O2TV_B866V2 */
      val O2TV_B866V2 = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
