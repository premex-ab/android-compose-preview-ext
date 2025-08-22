package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * BouyguesTelecom device specifications for Android Compose previews.
 *
 * This extension provides BouyguesTelecom device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Bouyguestelecom.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Bouyguestelecom: Any
  get() = object {
      /** BouyguesTelecom HMB4213H */
      val HMB4213H = "spec:width=720,height=1280,unit=px,dpi=213"

      /** BouyguesTelecom HMB9213NW */
      val HMB9213NW = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** BouyguesTelecom UZW4020BYT */
      val UZW4020BYT = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
