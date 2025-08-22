package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * TuCEL device specifications for Android Compose previews.
 *
 * This extension provides TuCEL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Tucel.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Tucel: Any
  get() = object {
      /** TuCEL TL554B */
      val TL554B = "spec:width=640,height=1280,unit=px,dpi=320"

  }
