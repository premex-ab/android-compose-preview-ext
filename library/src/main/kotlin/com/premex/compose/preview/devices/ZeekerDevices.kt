package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ZEEKER device specifications for Android Compose previews.
 *
 * This extension provides ZEEKER device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Zeeker.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Zeeker: Any
  get() = object {
      /** ZEEKER ZEEKER_P10 */
      val ZEEKER_P10 = "spec:width=1080,height=2400,unit=px,dpi=480"

      /** ZEEKER ZEEKER_T100 */
      val ZEEKER_T100 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
