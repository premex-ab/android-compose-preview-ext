package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SAMPO device specifications for Android Compose previews.
 *
 * This extension provides SAMPO device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.SAMPO.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.SAMPO: Any
  get() = object {
      /** SAMPO R2 */
      val R2 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SAMPO R4 */
      val R4 = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SAMPO R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

      /** SAMPO vileparle */
      val VILEPARLE = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
