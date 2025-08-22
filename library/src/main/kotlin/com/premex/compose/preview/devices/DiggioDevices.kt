package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * DIGGIO device specifications for Android Compose previews.
 *
 * This extension provides DIGGIO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Diggio.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Diggio: Any
  get() = object {
      /** DIGGIO lavender */
      val LAVENDER = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** DIGGIO mountbaker */
      val MOUNTBAKER = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DIGGIO stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** DIGGIO zhongshan */
      val ZHONGSHAN = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
