package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * GLOBAL device specifications for Android Compose previews.
 *
 * This extension provides GLOBAL device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Global.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Global: Any
  get() = object {
      /** GLOBAL lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** GLOBAL mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** GLOBAL stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** GLOBAL zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
