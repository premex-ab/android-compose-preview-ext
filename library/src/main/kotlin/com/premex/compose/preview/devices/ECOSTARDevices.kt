package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ECOSTAR device specifications for Android Compose previews.
 *
 * This extension provides ECOSTAR device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ECOSTAR.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ECOSTAR: Any
  get() = object {
      /** ECOSTAR elliniko */
      val ELLINIKO = "spec:width=2160,height=3840,unit=px,dpi=320"

      /** ECOSTAR mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ECOSTAR stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ECOSTAR SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ECOSTAR zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
