package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ADMIRAL device specifications for Android Compose previews.
 *
 * This extension provides ADMIRAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.ADMIRAL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.ADMIRAL: Any
  get() = object {
      /** ADMIRAL stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ADMIRAL sunnyvale */
      val SUNNYVALE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ADMIRAL SW4H */
      val SW4H = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** ADMIRAL zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
