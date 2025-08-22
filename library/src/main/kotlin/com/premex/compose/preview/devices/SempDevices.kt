package com.premex.compose.preview.devices

import com.premex.compose.preview.Devices
import kotlin.Any

/**
 * SEMP device specifications for Android Compose previews.
 *
 * This extension provides SEMP device specifications that can be used with @Preview annotations
 * in Android Compose, sourced from the Android Device Catalog maintained by Google Play Store.
 *
 * Usage:
 * ```kotlin
 * @Preview(device = Devices.Semp.DEVICE_NAME)
 * @Composable
 * fun MyPreview() {
 *     // Your composable content
 * }
 * ```
 */
public val Devices.Semp: Any
  get() = object {
      /** SEMP GO3C */
      val GO3C = "spec:width=480,height=800,unit=px,dpi=240"

      /** SEMP GO3C_Plus */
      val GO3C_PLUS = "spec:width=480,height=800,unit=px,dpi=240"

      /** SEMP GO3E */
      val GO3E = "spec:width=480,height=960,unit=px,dpi=240"

      /** SEMP GO5E */
      val GO5E = "spec:width=720,height=1440,unit=px,dpi=320"

  }
