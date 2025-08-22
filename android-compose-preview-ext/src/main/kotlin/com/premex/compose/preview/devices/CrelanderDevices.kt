package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * Crelander device specifications for Android Compose previews.
 *
 * This extension provides Crelander device specifications that can be used with @Preview
 * annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Crelander.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Crelander: Any
  get() = object {
      /** Crelander A101 */
      val A101 = "spec:width=1200,height=1920,unit=px,dpi=320"

      /** Crelander T118 */
      val T118 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Crelander W30 */
      val W30 = "spec:width=800,height=1280,unit=px,dpi=213"

      /** Crelander Z103 */
      val Z103 = "spec:width=800,height=1280,unit=px,dpi=213"

  }
