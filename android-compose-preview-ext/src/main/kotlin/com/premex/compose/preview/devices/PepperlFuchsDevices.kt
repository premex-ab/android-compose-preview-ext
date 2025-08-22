package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Pepperl_Fuchs device specifications for Android Compose previews.
 *
 * This extension provides Pepperl_Fuchs device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PepperlFuchs.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PepperlFuchs: Any
  get() = object {
      /** Pepperl_Fuchs Smart-Ex03 */
      val SMART_EX03 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
