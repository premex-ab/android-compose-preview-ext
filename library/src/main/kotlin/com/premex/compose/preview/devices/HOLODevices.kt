package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * HOLO device specifications for Android Compose previews.
 *
 * This extension provides HOLO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.HOLO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.HOLO: Any
  get() = object {
      /** HOLO VE0319 */
      val VE0319 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOLO VE1983 */
      val VE1983 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOLO X10 */
      val X10 = "spec:width=1080,height=2460,unit=px,dpi=480"

      /** HOLO XULTRA2 */
      val XULTRA2 = "spec:width=1200,height=2000,unit=px,dpi=280"

      /** HOLO XULTRA3 */
      val XULTRA3 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** HOLO XULTRAPLUS */
      val XULTRAPLUS = "spec:width=1200,height=2000,unit=px,dpi=213"

      /** HOLO XULTRAPLUS3 */
      val XULTRAPLUS3 = "spec:width=1200,height=1920,unit=px,dpi=280"

  }
