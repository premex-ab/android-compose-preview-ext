package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * nJoy device specifications for Android Compose previews.
 *
 * This extension provides nJoy device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Njoy.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Njoy: Any
  get() = object {
      /** nJoy nJoy_Theia_10 */
      val NJOY_THEIA_10 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
