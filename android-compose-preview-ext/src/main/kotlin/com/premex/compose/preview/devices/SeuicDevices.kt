package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEUIC device specifications for Android Compose previews.
 *
 * This extension provides SEUIC device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Seuic.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Seuic: Any
  get() = object {
      /** SEUIC d310m */
      val D310M = "spec:width=480,height=800,unit=px,dpi=240"

      /** SEUIC D360 */
      val D360 = "spec:width=480,height=800,unit=px,dpi=240"

      /** SEUIC d500b */
      val D500B = "spec:width=480,height=800,unit=px,dpi=240"

      /** SEUIC d520 */
      val D520 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** SEUIC D527 */
      val D527 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** SEUIC d550 */
      val D550 = "spec:width=480,height=800,unit=px,dpi=240"

      /** SEUIC d560 */
      val D560 = "spec:width=480,height=800,unit=px,dpi=240"

      /** SEUIC d700s */
      val D700S = "spec:width=1080,height=1920,unit=px,dpi=480"

      /** SEUIC d730 */
      val D730 = "spec:width=720,height=1440,unit=px,dpi=320"

      /** SEUIC d740 */
      val D740 = "spec:width=1080,height=2160,unit=px,dpi=480"

  }
