package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * ONIDA device specifications for Android Compose previews.
 *
 * This extension provides ONIDA device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Onida.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Onida: Any
  get() = object {
      /** ONIDA lasalle */
      val LASALLE = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ONIDA R3 */
      val R3 = "spec:width=720,height=1280,unit=px,dpi=213"

      /** ONIDA R4_GTV */
      val R4_GTV = "spec:width=1080,height=1920,unit=px,dpi=320"

  }
