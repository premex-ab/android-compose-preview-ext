package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Smart_Touch device specifications for Android Compose previews.
 *
 * This extension provides Smart_Touch device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SmartTouch.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SmartTouch: Any
  get() = object {
      /** Smart_Touch STG_IR13 */
      val STG_IR13 = "spec:width=2160,height=3840,unit=px,dpi=480"

  }
