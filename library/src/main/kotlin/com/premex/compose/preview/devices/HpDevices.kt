package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HP device specifications for Android Compose previews.
 *
 * This extension provides HP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Hp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Hp: Any
  get() = object {
      /** HP Fir */
      val FIR = "spec:width=768,height=1024,unit=px,dpi=160"

      /** HP Holly */
      val HOLLY = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HP Ilex */
      val ILEX = "spec:width=600,height=1024,unit=px,dpi=160"

      /** HP pangyo */
      val PANGYO = "spec:width=2160,height=3840,unit=px,dpi=320"

  }
