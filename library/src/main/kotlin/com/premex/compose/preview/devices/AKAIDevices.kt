package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * AKAI device specifications for Android Compose previews.
 *
 * This extension provides AKAI device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.AKAI.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.AKAI: Any
  get() = object {
      /** AKAI MD1063 */
      val MD1063 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** AKAI R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AKAI SP5504G */
      val SP5504G = "spec:width=480,height=960,unit=px,dpi=200"

      /** AKAI stanford */
      val STANFORD = "spec:width=720,height=1280,unit=px,dpi=213"

      /** AKAI SW6H */
      val SW6H = "spec:width=1080,height=1920,unit=px,dpi=160"

      /** AKAI umeda */
      val UMEDA = "spec:width=720,height=1280,unit=px,dpi=213"

  }
