package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PANTECH_SMART device specifications for Android Compose previews.
 *
 * This extension provides PANTECH_SMART device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PANTECHSMART.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PANTECHSMART: Any
  get() = object {
      /** PANTECH_SMART K-50 */
      val K_50 = "spec:width=800,height=1280,unit=px,dpi=310"

  }
