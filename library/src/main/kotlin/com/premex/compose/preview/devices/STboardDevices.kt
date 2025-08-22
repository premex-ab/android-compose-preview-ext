package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * STboard device specifications for Android Compose previews.
 *
 * This extension provides STboard device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.STboard.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.STboard: Any
  get() = object {
      /** STboard HJ_TD */
      val HJ_TD = "spec:width=2160,height=3840,unit=px,dpi=420"

  }
