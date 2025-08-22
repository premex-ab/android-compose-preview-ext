package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AVH device specifications for Android Compose previews.
 *
 * This extension provides AVH device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AVH.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AVH: Any
  get() = object {
      /** AVH Excer_10_PRO */
      val EXCER_10_PRO = "spec:width=800,height=1280,unit=px,dpi=213"

  }
