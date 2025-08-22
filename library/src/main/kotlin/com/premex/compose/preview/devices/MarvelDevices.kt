package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Marvel device specifications for Android Compose previews.
 *
 * This extension provides Marvel device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Marvel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Marvel: Any
  get() = object {
      /** Marvel Avengers */
      val AVENGERS = "spec:width=600,height=1024,unit=px,dpi=160"

  }
