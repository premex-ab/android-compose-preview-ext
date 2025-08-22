package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * PACKARD_BELL device specifications for Android Compose previews.
 *
 * This extension provides PACKARD_BELL device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.PACKARDBELL.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.PACKARDBELL: Any
  get() = object {
      /** PACKARD_BELL M10400 */
      val M10400 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PACKARD_BELL M10500 */
      val M10500 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PACKARD_BELL M10600 */
      val M10600 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PACKARD_BELL M10950 */
      val M10950 = "spec:width=1200,height=1920,unit=px,dpi=240"

      /** PACKARD_BELL M11550 */
      val M11550 = "spec:width=1080,height=1920,unit=px,dpi=240"

      /** PACKARD_BELL M7500 */
      val M7500 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PACKARD_BELL M7600-D */
      val M7600_D = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PACKARD_BELL PB1009 */
      val PB1009 = "spec:width=800,height=1280,unit=px,dpi=160"

      /** PACKARD_BELL PB101 */
      val PB101 = "spec:width=600,height=1024,unit=px,dpi=160"

      /** PACKARD_BELL PB9000-32 */
      val PB9000_32 = "spec:width=800,height=1280,unit=px,dpi=160"

  }
