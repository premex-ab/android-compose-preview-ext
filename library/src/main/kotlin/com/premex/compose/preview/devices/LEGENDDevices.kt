package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * LEGEND device specifications for Android Compose previews.
 *
 * This extension provides LEGEND device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.LEGEND.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.LEGEND: Any
  get() = object {
      /** LEGEND ACE_I */
      val ACE_I = "spec:width=480,height=854,unit=px,dpi=240"

      /** LEGEND NEBULAE */
      val NEBULAE = "spec:width=720,height=1440,unit=px,dpi=320"

  }
