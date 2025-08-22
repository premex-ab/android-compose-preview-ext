package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BDQ device specifications for Android Compose previews.
 *
 * This extension provides BDQ device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bdq.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bdq: Any
  get() = object {
      /** BDQ Destiny */
      val DESTINY = "spec:width=600,height=1024,unit=px,dpi=213"

      /** BDQ Destiny-4G */
      val DESTINY_4G = "spec:width=600,height=1024,unit=px,dpi=200"

      /** BDQ Smart_Camon */
      val SMART_CAMON = "spec:width=480,height=800,unit=px,dpi=240"

  }
