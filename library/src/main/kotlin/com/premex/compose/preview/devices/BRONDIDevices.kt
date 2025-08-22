package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BRONDI device specifications for Android Compose previews.
 *
 * This extension provides BRONDI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.BRONDI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.BRONDI: Any
  get() = object {
      /** BRONDI AMICO_SMARTPHONE_POCKET */
      val AMICO_SMARTPHONE_POCKET = "spec:width=480,height=800,unit=px,dpi=240"

      /** BRONDI AMICO_SMARTPHONE_XL */
      val AMICO_SMARTPHONE_XL = "spec:width=480,height=960,unit=px,dpi=240"

      /** BRONDI AMICO_VERO_4G */
      val AMICO_VERO_4G = "spec:width=720,height=1440,unit=px,dpi=320"

      /** BRONDI MIDNIGHT_SKY_EEA */
      val MIDNIGHT_SKY_EEA = "spec:width=720,height=1560,unit=px,dpi=320"

      /** BRONDI 850_4G */
      val _850_4G = "spec:width=480,height=960,unit=px,dpi=240"

  }
